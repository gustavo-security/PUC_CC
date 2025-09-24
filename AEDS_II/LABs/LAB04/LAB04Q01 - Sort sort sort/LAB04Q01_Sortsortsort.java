import java.util.Arrays;
import java.util.Scanner;

public class LAB04Q01_Sortsortsort{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        boolean abort = false;

        while(abort == false){
            int entradas = scanner.nextInt();
            int modulo = scanner.nextInt();

            if(entradas == 0 && modulo == 0){
                System.out.println("0 0");
                abort = true;
            }else{
                System.out.println(entradas + " " + modulo);

            int[] vet = new int[entradas];
            int[] vetMod = new int[entradas];	
            int[] vetCont = new int[modulo];

                //Popular vetor
                for(int i = 0; i < entradas; i++){
                    vet[i] = scanner.nextInt();
                    vetMod[i] = (vet[i] % modulo);

                    if(vetMod[i] < 0){
                        vetMod[i] = -1;
                    }
                }

                scanner.close();
                //Contar ocorrencias
                int negativo = 0;
                for(int i = 0; i < modulo; i++){
                    for(int j = 0; j < entradas; j++){
                        if(vetMod[j] == i){
                            vetCont[i]++;
                        }else if(vetMod[j] == -1){
                            negativo++;
                        }
                    }
                }


                for(int i = 0; i < modulo; i++){
                    int[] vetResp = new int[entradas]; //os elementos do modulo
                    int elementos = vetResp.length; //numero de elementos no modulo
                    int cont=0;
                    
                    for(int j = 0; j < elementos; j++){
                        if(vetMod[j] == i){
                            vetResp[cont] = vet[j];
                            cont++;
                        }
                    }

                    validar(vetResp);
                }
            }
        }
    }

    public static void validar(int[] vetResp){
        int countValidos = 0;

        // Contar quantos valores são diferentes de zero
        for (int i = 0; i < vetResp.length; i++) {
            if (vetResp[i] != 0) {
                countValidos++;
            }
        }

        // Criar novo array com o tamanho adequado (sem zeros)
        int[] vetResp_Final = new int[countValidos];
        int indice = 0;

        // Preencher o novo array com valores diferentes de zero
        for (int i = 0; i < vetResp.length; i++) {
            if (vetResp[i] != 0) {
                vetResp_Final[indice] = vetResp[i];
                indice++;
            }
        }

        ordenar(vetResp_Final);
    }

    public static void ordenar(int[] vetResp_Final){
        int[] vetImpar = new int[vetResp_Final.length];
        int[] vetPar = new int[vetResp_Final.length];
        int countImpar = 0;
        int countPar = 0;

        //Separar ímpares e pares em vetores diferentes
        for (int i = 0; i < vetResp_Final.length; i++) {
            if (vetResp_Final[i] % 2 != 0) { //ímpar
                vetImpar[countImpar] = vetResp_Final[i];
                countImpar++;
            } else if (vetResp_Final[i] % 2 == 0 && vetResp_Final[i] != 0) { //par
                vetPar[countPar] = vetResp_Final[i];
                countPar++;
            }
        }

        // Reduzir o tamanho dos vetores para os números válidos
        vetImpar = Arrays.copyOf(vetImpar, countImpar);
        vetPar = Arrays.copyOf(vetPar, countPar);

        // Ordenar vetores
        Arrays.sort(vetImpar);
        Arrays.sort(vetPar);

        // Inverter o vetor ímpar para ordem decrescente
        for (int i = 0; i < vetImpar.length / 2; i++) {
            int temp = vetImpar[i];
            vetImpar[i] = vetImpar[vetImpar.length - 1 - i];
            vetImpar[vetImpar.length - 1 - i] = temp;
        }

        //Imprimir os ímpares 
        for (int i = 0; i < vetImpar.length; i++) {
            System.out.println(vetImpar[i]);
        }

        //Imprimir os pares
        for (int i = 0; i < vetPar.length; i++) {
            System.out.println(vetPar[i]);
        }
    }
    
}