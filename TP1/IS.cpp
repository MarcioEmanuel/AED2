#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
#include <ios>
#include <limits>

using namespace std;

int isFim(string s)
{
    int tamanho = s.length();
    if(tamanho >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){
        return 1;
    }else{
        return 0;
    }
}

int isVogais(char s){

    if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
        return 1;
    }else{
        return 0;
    }

}

int tdVogais (string s){
    int tamanho = s.length();
    int cont = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
    if(isVogais(s[i]) == 1){
        cont++;
    }else{
        cont = 0;
        return 0;
    }
    }
    
    if(cont != 0)
    {
        return 1;
    }else{
        return 0;
    }
}

int tdConsoantes (string s)
{
    int tamanho = s.length();
    int cont = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
        if(isVogais(s[i]) == 0 && s[i] != '0' && s[i] != '1' && s[i] != '2' && s[i] != '3' && s[i] != '4' && s[i] != '5' && s[i] != '6' && s[i] != '7' && s[i] != '8' && s[i] != '9')
        {
            cont++;
        }else{
            cont = 0;
            return 0;
        }
    }
    
    if(cont != 0)
    {
        return 1;
    }else{
        return 0;
    }
}

int tdInt (string s)
{
    int tamanho = s.length();
    int cont = 0;

    for(int i = 0; i < tamanho; i++)
    {
        if(s[i] >= '0' && s[i] <= '9'){

            cont++;

        }else{

            cont = 0;
            i = tamanho - 1;
            return 0;
        }

    }

    if(cont != 0)
    {
        return 1;
    }else
    {
        return 0;
    }
}

int isReal(string s)
{
    int tamanho = s.length();
    int cont = 0;
    int cont2 = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
        if((s[i] >= '0' && s[i] <='9') || s[i] == '.' || s[i] == ',')
        {
            cont++;
        }else{
            cont = 0;
            return 0;
        }

        if(s[i] == '.' || s[i]  == ','){
            cont2++;
        }else{

        }
    }

    if(cont != 0 && cont2 != 0)
    {
        return 1;
    }else
    {
        return 0;
    }
}

int main(){
    string palavras[1000];
    int qtd = 0;
    int resp1 = 0;
    int resp2 = 0;
    int resp3 = 0;
    int resp4 = 0;

    do {

        getline(cin, palavras[qtd]);

    } while (isFim(palavras[qtd++]) == 0);
    qtd--;

    for(int i = 0; i < qtd; i++)
    {
        resp1 = tdVogais(palavras[i]);
            if(resp1 == 1)
            {
                cout << "SIM ";
            }else
            {
                cout << "NAO ";
            }
        
        resp2 = tdConsoantes(palavras[i]);
            if(resp2 == 1)
            {
                cout << "SIM ";
            }else
            {
                cout << "NAO ";
            }
        
        resp3 = tdInt(palavras[i]);
            if(resp3 == 1)
            {
                cout << "SIM ";
            }else
            {
                cout << "NAO ";
            }
        
        resp4 = isReal(palavras[i]);
            if(resp4 == 1)
            {
                cout << "SIM" << "\n";
            }else
            {
                cout << "NAO" << "\n";
            }
    }
}