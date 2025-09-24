import java.util.Scanner;

public class TP01Q14_RECURSIVOIs {

    public static boolean SomenteVogais(String palavra, int inicio) { 
        boolean sovogal = true;
        char c;
        int tamanho = palavra.length();

        if (inicio < tamanho) {
            c = palavra.charAt(inicio);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                sovogal = false;
            } else {
                sovogal = SomenteVogais(palavra, inicio + 1);
            }
        }

        return sovogal;
    }

    public static boolean SomenteConsoantes(String palavra, int inicio) {
        boolean soconsoante = true;
        char c;
        int tamanho = palavra.length();

        if (inicio < tamanho) {
            c = palavra.charAt(inicio);
            if (c != 'b' && c != 'c' && c != 'd' && c != 'f' && c != 'g' &&
                c != 'h' && c != 'j' && c != 'k' && c != 'l' && c != 'm' &&
                c != 'n' && c != 'p' && c != 'q' && c != 'r' && c != 's' &&
                c != 't' && c != 'v' && c != 'w' && c != 'x' && c != 'y' && c != 'z' &&
                c != 'B' && c != 'C' && c != 'D' && c != 'F' && c != 'G' &&
                c != 'H' && c != 'J' && c != 'K' && c != 'L' && c != 'M' &&
                c != 'N' && c != 'P' && c != 'Q' && c != 'R' && c != 'S' &&
                c != 'T' && c != 'V' && c != 'W' && c != 'X' && c != 'Y' && c != 'Z') {
                soconsoante = false;
            } else {
                soconsoante = SomenteConsoantes(palavra, inicio + 1);
            }
        }

        return soconsoante;
    }

    public static boolean SomenteInteiros(String palavra, int inicio) {
        boolean sointeiros = true;
        char c;
        int tamanho = palavra.length();

        if (inicio < tamanho) {
            c = palavra.charAt(inicio);
            if (!(c >= '0' && c <= '9')) {
                sointeiros = false;
            } else {
                sointeiros = SomenteInteiros(palavra, inicio + 1);
            }
        }
        return sointeiros;
    }

    public static boolean SomenteReais(String palavra, int inicio, int count) {
        boolean NumReal = true;
        int tamanho = palavra.length();

        if (inicio < tamanho) {
            if (palavra.charAt(inicio) == ',' || palavra.charAt(inicio) == '.') {
                count++;
                if (count > 1) {
                    return false; 
                }
            } else if (!(palavra.charAt(inicio) >= '0' && palavra.charAt(inicio) <= '9')) {
                NumReal = false;
            }
            if(NumReal){
                NumReal = SomenteReais(palavra, inicio + 1, count);
            }
        }
        return NumReal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        String palavra = "";

        while (control) {
            palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("FIM")) {
                control = false;
            } else {
                System.out.print((SomenteVogais(palavra, 0) ? "SIM" : "NAO") + " ");
                System.out.print((SomenteConsoantes(palavra, 0) ? "SIM" : "NAO") + " ");
                System.out.print((SomenteInteiros(palavra, 0) ? "SIM" : "NAO") + " ");
                System.out.println(SomenteReais(palavra, 0, 0) ? "SIM" : "NAO");
            }
        }
        scanner.close();
    }
}
