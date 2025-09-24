import java.util.Scanner;

public class TP01Q10_RECURSIVOPalindromo {

    static boolean ispalindromo(String palavra, int inicio, int fim){
        boolean resp = true;
        if(inicio < palavra.length()/2){
            if(palavra.charAt(inicio) == palavra.charAt(fim)){
                resp = ispalindromo(palavra, inicio + 1, fim - 1);
            }else{
                resp = false;
            }
        }else{
            return resp;
        }

        return resp;
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
            System.out.println(ispalindromo(palavra, 0, palavra.length() -1) ? "SIM" : "NAO");
            }
        }


    }
}