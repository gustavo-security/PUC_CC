#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int ultrapasagens(int a, char* largada, char* chegada){
    int resp = 0;
    
    for(int i = 0; i < a; i++){
        for(int j = 0; j < a; j++){
            if(largada[i] == chegada[j]){
                if(i < j){
                    resp += j - i;
                }
                j = a;
            }
        }
    }
    return resp;
}


int main(){
    int pilotos = 0;

    while (scanf("%d", &pilotos) == 1) {
        char largada[pilotos];
        char chegada[pilotos];
        int num_ultrapassagens = 0;
        
        // Entrada dos valores de largada (O(n), onde n é o número de pilotos)
        for (int i = 0; i < pilotos; i++) {
            scanf("%d", &largada[i]);
        }

        // Entrada dos valores de chegada (O(n))
        for (int i = 0; i < pilotos; i++) {
            scanf("%d", &chegada[i]);
        }

        num_ultrapassagens = ultrapasagens(pilotos, largada, chegada);
        printf("%d\n", num_ultrapassagens);
    }

return 0;
}