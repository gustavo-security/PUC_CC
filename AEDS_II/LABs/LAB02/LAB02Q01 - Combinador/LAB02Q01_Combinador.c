#include <stdio.h>
#include <string.h>

int n=200;

int Combinador(char a[], char b[]){
    int i=0, j=0, k=0;
    int string1 = strlen(a);
    int string2 = strlen(b);
    int tamanho = string1 + string2;

    char output[tamanho];

while (i<string1 && j<string2){
        output[k] = a[i];
           k++;
           i++;

        output[k] = b[j];
          k++;
          j++;
}
    
    while (i<string1){
        output[k] = a[i];
            k++;
            i++;
    }

        while (i<string2){
            output[k] = b[j];
            k++;
            j++;
    }

    printf("%s\n", output);
}

int main(){
    char array1[n], array2[n];

    while(scanf("%s %s", array1 , array2)==2){
        Combinador(array1, array2);
    }

    return 0;
}