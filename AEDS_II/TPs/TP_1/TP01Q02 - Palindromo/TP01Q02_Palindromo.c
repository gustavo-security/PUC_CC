#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#define MAX 1000

bool is_palindromo(char* palavra){ // O método recebe uma String e confere se ela é palindromo, caso seja ela retornará TRUE, caso contrário FALSE.
    int tamanho = strlen(palavra);
    int i = 0;
    int j = tamanho - 1;
    bool resp = true;

    while(resp && i < tamanho /2){ // O laço repete enquanto "i" for menor que "tamanho/2", já que a variável "j" está vindo do final.
        if (palavra[i] != palavra[j])
        {
            resp = false;
        }
        i++;
        j--;
    }
    return resp;
}

int main(){
    char palavra[MAX];
    bool resposta = true;
    bool control = true;

    while (control) // Laço repete infinitamente
    {
        fgets(palavra, sizeof(palavra), stdin); // Fgets é usado para ler a linha de entrada incluindo espaços
        palavra[strcspn(palavra,"\n")] = '\0'; // Strcspn é usado para remover o "\n" da String
        if(strcmp(palavra, "FIM") == 0){
            control = false; // Caso a palavra for "FIM" control recebe FALSE e o laço é interrompido.
        }else{
        resposta = is_palindromo(palavra); // Resposta recebe o resultado da função "is_palindromo".
        printf("%s\n", resposta ? "SIM" : "NAO"); // Aqui, será impresso "SIM" || "NAO".
        }
    }
    return 0;
}
