import java.util.Scanner;

public class Soma {
    public static int Somando(String numeros){
        int tamanho = numeros.length();
        int soma = 0;

        for(int i = 0; i < tamanho; i++){
            soma += numeros.charAt(i) - '0';
        }

        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        String palavra = "";

        while (control) {
            palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("FIM")){
                control = false;
            }else{
                System.out.println(Somando(palavra));
            }
                
            }

            scanner.close();
        }
    }