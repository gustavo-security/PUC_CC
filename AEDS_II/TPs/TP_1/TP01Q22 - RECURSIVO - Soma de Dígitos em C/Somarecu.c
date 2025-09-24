#include <stdio.h>
#include <string.h>
#include <stdbool.h>


int soma_digitos(char *str) {

    if (*str == '\0') {
        return 0;
    } else {
    
        return (*str - '0') + soma_digitos(str + 1);
    }
}

int main() {
    char numero[100]; 
    bool control = true;
    while (control) {
        scanf("%s", numero);
        if(strcmp(numero, "FIM")== 0){
            control = false;
        }else{

            printf("%d\n", soma_digitos(numero));
        }
    }

    return 0;
}
