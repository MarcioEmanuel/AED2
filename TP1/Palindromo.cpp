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

void palindromo(string str){
	int tamanho = str.length();
	string palavra;

	for(int i = (tamanho - 1); i >= 0; i--){
	
		palavra = palavra + str[i];

	}



	if(palavra == str){		
		
		cout << "SIM\n";
	
	}else{

		cout << "NAO\n";
	}
}


int main(){

	int cont = 0;
	string palavra[1000];

	do{
	
	getline(cin, palavra[cont]);

	}while(isFim(palavra[cont++]) != 1);
	cont--;

	for(int i = 0; i < cont; i++){
		palindromo(palavra[i]);
	}	

}
