import java.util.Scanner;


public class TP01Q01_Palindromo{

   static boolean ispalindromo(String palavra){ //O método recebe uma STRING, confere se é palindromo e retorna TRUE caso seja, ou FALSE do contrário.
        boolean verdade = true;
        int tamanho = palavra.length();

        for(int i=0; i<tamanho/2; i++){ //O for caminha até metade do array (tamanho/2), já que ele está comparando o primeiro com o ultimo.
            if(palavra.charAt(i) != palavra.charAt(tamanho - i -1)){
            verdade = false;
            }
        }
    return verdade;
}


    public static void main(String[] args) {
        boolean resultado = true;
        boolean control = true;
        String palavra = "";
        Scanner scanner = new Scanner(System.in);

        while (control && !palavra.equalsIgnoreCase("FIM")){ //O laço continua até que a entrada seja "FIM".
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }
            else{resultado = ispalindromo(palavra);// Resultado recebe TRUE ou FALSE da função "is_palindromo".
            System.out.println(resultado ? "SIM" : "NAO");// Se resultado for igual a TRUE imprime "SIM" caso contrário "NAO"
            }
        }
        scanner.close();

    }


}