import java.util.Scanner;

public class Contagem {

    public static int contandopalavras(String palavra){

        String[] palavras = palavra.split(" ");
        int resp = palavras.length;
        
        return resp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean control = true;
        String palavra = "";
        
        while (control) {
            palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("FIM")){
                control = false;
            }else{
                System.out.println(contandopalavras(palavra));
            }
            
        }
        scanner.close();
    }

}