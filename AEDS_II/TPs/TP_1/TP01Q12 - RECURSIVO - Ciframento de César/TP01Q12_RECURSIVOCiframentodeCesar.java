import java.util.Scanner;

public class TP01Q12_RECURSIVOCiframentodeCesar{

    public static String CifraCesar(String palavra, int inicio){
        String resultado = "";
        char caracter;
        int tamanho = palavra.length();

        if (inicio < tamanho) {
            caracter = palavra.charAt(inicio);
            if(caracter != '\uFFFD'){
                resultado +=(char)(palavra.charAt(inicio) + 3);
                resultado +=CifraCesar(palavra, inicio + 1);
            }else{
                resultado += caracter;
                resultado +=CifraCesar(palavra, inicio + 1);
            }
        }
        
        return resultado;
    }

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in, "UTF-8");
    String palavra = "";
    boolean control = true;

    while (control && !palavra.equalsIgnoreCase("FIM")) {
        palavra = scanner.nextLine();
        if(palavra.equalsIgnoreCase("FIM")){
            control = false;
        }else{
        System.out.println(CifraCesar(palavra, 0));
        }
    }
    
    scanner.close();
}

}