#include <stdio.h>
#include <string.h>
#include <stdbool.h>


int NumMaiuscula(char *palavra){

    int tamanho = strlen(palavra);
    int count = 0;

    for(int i = 0; i < tamanho; i++){
        if(palavra[i] >= 'A' && palavra[i] <='Z'){
            count += 1;
        }
    }
    return count;
}


int main(){

    char palavra[80];
    bool control = true;

    while (control){
        fgets(palavra,sizeof(palavra), stdin);
        palavra[strcspn(palavra , "\n")] = '\0';
        if(strcmp(palavra, "FIM") == 0){
            control = false;
        }else{
            printf("%d\n", NumMaiuscula(palavra));
        }
    }
    return 0;
}