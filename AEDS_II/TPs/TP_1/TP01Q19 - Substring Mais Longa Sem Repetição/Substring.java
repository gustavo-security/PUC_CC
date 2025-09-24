import java.util.Scanner;

public class Substring {

    public static int num_sequencia(String palavra) {
        int tamanho = palavra.length();
        int maxTam = 0;

        for (int i = 0; i < tamanho; i++) {
            boolean[] presente = new boolean[256]; 
            int count = 0;
            int j = i;

            while (j < tamanho && !presente[palavra.charAt(j)]) {
                presente[palavra.charAt(j)] = true;
                count++;
                j++;
            }

            if (count > maxTam) {
                maxTam = count;
            }
        }

        return maxTam;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        boolean control = true;
        while (control) {
            palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("FIM")) {
                control = false;
            } else {
                System.out.println(num_sequencia(palavra));
            }
        }

        scanner.close();
    }
}
