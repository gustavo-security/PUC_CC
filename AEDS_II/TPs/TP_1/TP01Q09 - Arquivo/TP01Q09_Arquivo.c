#include <stdio.h>


int main(){

    FILE *file;

    file = fopen("arquivo.txt", "w");

    if(file == NULL){
        printf("Erro ao abrir o arquivo para escrita.\n");
        return 1; 
    }

    int n = 0;
    scanf("%d", &n);

    for(int i = 0; i < n; i++){
        double numero;
        scanf("%lf", &numero); 

       
        if (numero == (int)numero) {
            fprintf(file, "%d\n", (int)numero); 
        } else {
            fprintf(file, "%.3lf\n", numero); 
        }
    }

    fclose(file);

    file = fopen("arquivo.txt", "r");
    if (file == NULL) {
        printf("Erro ao abrir o arquivo.");
        return 1;
    }

    char lines[100][50];
    int count = 0;

    while (fgets(lines[count], sizeof(lines[count]), file) != NULL) {
        count++;
    }

    fclose(file);

    for (int i = count - 1; i >= 0; i--) {
        printf("%s", lines[i]);
    }

    return 0;
}
