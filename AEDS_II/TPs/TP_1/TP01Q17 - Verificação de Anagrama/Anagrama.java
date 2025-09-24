import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean isAnagrama(String palavra){
        // Dividir as palavras pela string " - "
        String[] palavras = palavra.split(" - ");
        
        // Se não houver exatamente duas palavras, retorne falso
        if (palavras.length != 2) {
            return false;
        }

        // Remover espaços e transformar em minúsculas
        String palavra1 = palavras[0].trim().toLowerCase();
        String palavra2 = palavras[1].trim().toLowerCase();

        // Se as palavras têm tamanhos diferentes, não podem ser anagramas
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Converter as palavras em arrays de caracteres
        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        // Ordenar os arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Comparar os arrays ordenados
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "";
        Boolean control = true;

        while (control) {
            palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("FIM")){
                control = false;
            } else {
                System.out.println(isAnagrama(palavra) ? "SIM" : "NÃO");
            }
        }
        scanner.close();
    }
}
