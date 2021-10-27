#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char isFim(char *string){

	int tamanho = strlen(string);

	if(tamanho >= 3 && string[0] == 'F' && string[1] == 'I' && string[2] == 'M'){
		return 1;
	}else{
		return 0;
	}
}

void isPalindromo(char *p){


}

void palindromo(char *str, int tamanho){

	char p[1000];
	int cont = 0;

	if(tamanho > 0){
	
		p[cont] = str[tamanho];
		cont++;

		return palindromo(str, tamanho - 1);
	}else{

	}

	printf(p);

	if(strcmp(p, str) == 0){
		
		printf("SIM\n");
		printf(p);
	
	}else{

		printf("NAO\n");
		printf(p);

	}
}


int main(){

	char String[1000][1000];
	int cont = 0;

	do{
	
	gets(String[cont]);

	}while(isFim(String[cont++]) != 1);
	cont--;

	for(int i = 0; i < cont; i++){

		palindromo(String[i], strlen(String[i]));

	}
	

}
