import java.util.Scanner;
import java.util.Random;

public class TP01Q04_AlteracaoAleatoria {
    
public static String AlteracaoAleatoria(String palavra, char letra1, char letra2){

    String resultado = "";

    for(char c : palavra.toCharArray()){
        if(c == letra1){
            resultado += letra2;
        }else{
            resultado += c;
        }

    }
    return resultado;
}


public static void main(String[] args) {

    Random gerador = new Random();
    gerador.setSeed(4);

    Scanner scanner = new Scanner(System.in);
    String palavra = "";
    boolean control = true;

    while (control){
        palavra = scanner.nextLine();
        if(palavra.equalsIgnoreCase("FIM")){
            control = false;
        }
        else{
            char letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            char letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            System.out.println(AlteracaoAleatoria(palavra, letra1, letra2));
        }
        }
    }

}


