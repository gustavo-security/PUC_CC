import java.util.Scanner;

public class Inversao {

    public static String inversao(String palavra){
        StringBuilder sb = new StringBuilder(palavra);
        sb.reverse();
        String resultado = sb.toString();
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        String palavra = "";

        while (control) {
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }else{
                System.out.println(inversao(palavra));
            }
        }   

        scanner.close();

    }
}