#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
#include <ios>
#include <limits>

using namespace std;

int main(){

    double valor = 0.0;
    int vInicial = 0;

    FILE* ra = fopen("exemplo01.txt", "rw");

    for(int i = 0; i < vInicial; i++){
        getline(cin, valor);
        fscanf("%f", valor);
    }

    fclose(ra);

    FILE* ra2 = fopen("exemplo.txt", "r");
    double valorFinal = 0.0;

    int seek = (vInicial * sizeof(double));

    for(int i = 0; i > vInicial; i++){
        seek -= sizeof(double);
        ra2(seek);
        fprintf(ra2, "%f", valorFinal);
    }

}