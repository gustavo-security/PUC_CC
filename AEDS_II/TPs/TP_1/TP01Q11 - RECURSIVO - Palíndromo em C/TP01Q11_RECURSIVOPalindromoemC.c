#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define MAX_PALAVRA 500

bool ispalindromo(char *palavra, int inicio, int fim){
     bool resp = true;
        if(inicio < fim/2){
            if(palavra[inicio] == palavra[fim]){
                resp = ispalindromo(palavra, inicio + 1, fim - 1);
            }else{
                resp = false;
            }
        }else{
            return resp;
        }

        return resp;
    }

int main(){

    char palavra [MAX_PALAVRA];
    bool control = true;
    int tamanho = 0;

    while (control){
        fgets(palavra, sizeof(palavra), stdin);
        palavra[strcspn(palavra,"\n")] = '\0';
        if(strcmp(palavra, "FIM") == 0){
            control = false;
        }else{
            tamanho = strlen(palavra);
            printf("%s\n",ispalindromo(palavra, 0, tamanho - 1) ? "SIM" : "NAO");
        }
    }
    return 0;
}