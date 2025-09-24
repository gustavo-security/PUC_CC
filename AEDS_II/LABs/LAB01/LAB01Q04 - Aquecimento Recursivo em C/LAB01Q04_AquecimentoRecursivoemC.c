#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int NumMaiuscula(char* palavra, int index){
    int count = 0;

    if(index == strlen(palavra)){
        return 0;
    }

    if(palavra[index]>= 'A' && palavra[index]<= 'Z'){
        count += 1;
    }

    return count + NumMaiuscula(palavra, index + 1);
}


int main(){

    char palavra [80];
    bool control = true;

    while(control){
        fgets(palavra, sizeof(palavra), stdin);
        palavra[strcspn(palavra, "\n")] = '\0';
        if(strcmp(palavra, "FIM") == 0){
            control = false;
        }else{
            printf("%d\n", NumMaiuscula(palavra, 0));
        }
    }
    return 0;
}