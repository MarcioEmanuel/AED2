#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stddef.h>

int isFim();
struct Player preencherJogador();
void imprimir();

//********************Struct Player**********************
struct Player{
  int id;
	char *nome ;
	int altura;
	int peso;
	char *universidade;
	int anoNascimento;
	char *cidadeNascimento;
	char *estadoNascimento;
  };
//********************Struct Player**********************

//*********************Limpar**************************
void limparLixo(char *linha){

  for(int i = 0; i < strlen(linha); i++){
    if(linha[i] == '\n' || linha[i] == '\r'){
      linha[i] = '\0';
    }
  }

}
//*********************Limpar**************************

//********************FIM*********************
int isFim(char id[4]){
    if(id[0] == 'F' && id[1] == 'I' && id[2] == 'M'){
        return 1;
    }else{
        return 0;
    }
}
//********************FIM*********************


//********************PreencherJogador************************

struct Player preencherJogador(char *linha){

  struct Player temp;
  int controle2 = 0;
  char *cpy, *r, *tok;
  r = cpy = strdup(linha);
        while((tok = strsep(&cpy, ",")) != NULL){
            
            if(controle2 == 0){
            temp.id = atoi(tok);
            }else if(controle2 == 1){
            temp.nome = strdup(tok);
            }else if(controle2 == 2){
            temp.altura = atoi(tok);
            }else if(controle2 == 3){
            temp.peso = atoi(tok);
            }else if(controle2 == 5){
            temp.anoNascimento = atoi(tok);
            }else if(controle2 == 4){
              if(strlen(tok) <= 1){
                temp.universidade = "nao informado";
              }else{
                temp.universidade = strdup(tok);
                }
            }else if(controle2 == 6){
              if(strlen(tok) <= 1){
                temp.cidadeNascimento = "nao informado";
              }else{
              temp.cidadeNascimento = strdup(tok);
              }
            }else if(controle2 == 7){
              if(strlen(tok) <= 1){
                temp.estadoNascimento = "nao informado";
              }else{
                temp.estadoNascimento = strdup(tok);
            }
            }
            
            controle2++;
        }
  free(r);

  return temp;

}
//********************PreencherJogador************************

//*********************Imprimir*****************************
void imprimir(struct Player *j, int i ){
  struct Player p = j[i];

  printf("[%d ## %s ## %d ## %d ## %d ## %s ## %s ## %s]\n", p.id, p.nome, p.altura, p.peso, p.anoNascimento, p.universidade, p.cidadeNascimento, p.estadoNascimento);
  

}
//*********************Imprimir*****************************

//********************Main*********************
int main(){
    char id[3922][100];
    int contLinha = 0;
    struct Player jogadores[3921 + 1];
    char linha[2048];

    //***********************abrir arquivo players.csv**********************************
    FILE* arqNome;
    arqNome = fopen("players.csv", "rt");
    fgets(linha, 2048, arqNome);

    int i = 0;
    while(fgets(linha, 2048, arqNome) != NULL){
      limparLixo(linha);
      jogadores[i] = preencherJogador(linha);
      i++;
    }

    do
    {
        scanf("%s", id[contLinha]);
    } while (isFim(id[contLinha++]) == 0);
    contLinha--;

    for(int j = 0; j < contLinha; j++){
      
      imprimir(jogadores, atoi(id[j]));
    }

    fclose(arqNome);
    return 0;
}
//********************Main*********************