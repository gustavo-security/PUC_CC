#include <stdio.h>
#include <string.h>

// Função recursiva para inverter uma string
void inverter(char *palavra, int inicio, int fim) {
    if (inicio >= fim) {
        return; // Caso base: quando os índices se encontram ou se cruzam
    }

    // Trocar os caracteres nas posições inicio e fim
    char temp = palavra[inicio];
    palavra[inicio] = palavra[fim];
    palavra[fim] = temp;

    // Chamada recursiva com os índices mais próximos do centro
    inverter(palavra, inicio + 1, fim - 1);
}

int main() {
    char palavra[100]; // Definir um tamanho máximo para a string

    while (1) {
        fgets(palavra, sizeof(palavra), stdin); // Lê a string com espaços
        palavra[strcspn(palavra, "\n")] = '\0'; // Remove o caractere de nova linha

        if (strcmp(palavra, "FIM") == 0) {
            break; // Sai do loop se a entrada for "FIM"
        }

        int tamanho = strlen(palavra);
        inverter(palavra, 0, tamanho - 1); // Chama a função recursiva
        printf("%s\n", palavra); // Imprime a string invertida
    }

    return 0;
}
