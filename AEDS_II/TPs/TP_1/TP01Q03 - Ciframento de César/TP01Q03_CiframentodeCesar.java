import java.util.Scanner;

public class TP01Q03_CiframentodeCesar{

    public static String CifraCesar(String palavra){
        String resultado = "";
        char caracter;
        for(int i = 0; i < palavra.length(); i++){
            caracter = palavra.charAt(i);
            if(caracter != '\uFFFD'){
                resultado +=(char)(palavra.charAt(i) + 3);
            }else{
                resultado += caracter;
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
        System.out.println(CifraCesar(palavra));
        }
    }
    
    scanner.close();
}

}