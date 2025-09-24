import java.util.Scanner;

public class TP01Q06_Is{

  public static boolean SomenteVogais(String palavra){ 
        
        boolean sovogal = true;
        boolean control = true;
        char c;
        int i = 0;
        int tamanho = palavra.length();
        while(control){

            if(i < tamanho){
            c = palavra.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
            c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U'){
                sovogal = false;
                control = false;
            }
            i++;
            }
            else{
                control = false;
            }
        }
        return sovogal;
    }


    public static boolean SomenteConsoantes(String palavra){
        boolean soconsoante = true;
        char c;
        int tamanho = palavra.length();

        for(int i = 0; i < tamanho; i++){
            c = palavra.charAt(i);
            if(c != 'b' && c != 'c' && c != 'd' && c != 'f' && c != 'g' &&
                c != 'h' && c != 'j' && c != 'k' && c != 'l' && c != 'm' &&
                c != 'n' && c != 'p' && c != 'q' && c != 'r' && c != 's' &&
                c != 't' && c != 'v' && c != 'w' && c != 'x' && c != 'y' && c != 'z' &&
                c != 'B' && c != 'C' && c != 'D' && c != 'F' && c != 'G' &&
                c != 'H' && c != 'J' && c != 'K' && c != 'L' && c != 'M' &&
                c != 'N' && c != 'P' && c != 'Q' && c != 'R' && c != 'S' &&
                c != 'T' && c != 'V' && c != 'W' && c != 'X' && c != 'Y' && c != 'Z'){
                    soconsoante = false;
                    i = tamanho;
                }

        }
        return soconsoante;
    }

    public static boolean SomenteInteiros(String palavra){
        boolean sointeiros = true;
        boolean control = true;
        char c;
        int i = 0;
        int tamanho = palavra.length();
        while(control){

            if(i < tamanho){
            c = palavra.charAt(i);
            if (!(c >= '0' && c <= '9')){
                sointeiros = false;
                control = false;
            }
            i++;
            }
            else{
                control = false;
            }
        }
        return sointeiros;
    }
    public static boolean SomenteReais(String palavra){

            boolean NumReal = true;
            int tamanho = palavra.length();
            int count = 0;

            for(int i = 0; i < tamanho; i++){
                if(palavra.charAt(i) == ',' || palavra.charAt(i) <= '.'){
                    count++;
                }else if(!(palavra.charAt(i) >= '0' && palavra.charAt(i) <= '9')){
                    NumReal = false;
                    i = tamanho;
                }

                if(count > 1){
                    NumReal = false;
                    i = tamanho;
                }
            }
            return NumReal;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        String palavra = "";

        while (control){
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }
            else {
                System.out.print((SomenteVogais(palavra) ? "SIM" : "NAO") + " ");
                System.out.print((SomenteConsoantes(palavra) ? "SIM" : "NAO") + " ");
                System.out.print((SomenteInteiros(palavra) ? "SIM" : "NAO") + " ");
                System.out.println(SomenteReais(palavra) ? "SIM" : "NAO");
            }
            
        }

    }
}