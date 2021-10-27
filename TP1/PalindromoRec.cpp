#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
#include <ios>
#include <limits>

using namespace std;

char isFim(string str){

	int tamanho = str.length();

	if(tamanho >= 3 && str[0] == 'F' && str[1] == 'I' && str[2] == 'M'){
		return 1;
	}else{
		return 0;
	}
}

string palindromo(string str, int tamanho, string p){

	if(tamanho >= 0){

		p = p + str[tamanho];

		return palindromo(str, tamanho - 1, p);
	}else{

		return p;

	}

}

void isPalindromo(string str, string p){


	if(p == str){
		
		cout << "SIM\n";
	
	}else{

		cout << "NAO\n";

	}

}

int main(){

	int cont = 0;
	string palavra[1000];
	string p;
	string aux;

	do{
	
	getline(cin, palavra[cont]);

	}while(isFim(palavra[cont++]) != 1);
	cont--;

	for(int i = 0; i < cont; i++){
		int tamanho = palavra[i].length();
		aux = palindromo(palavra[i], tamanho - 1, p);
		isPalindromo(palavra[i], aux);
	}
	

}
