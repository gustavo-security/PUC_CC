import java.util.Scanner;

public class LAB03Q01_BalancoParenteses{

    static boolean Expressao(String palavra){
        boolean resposta = true;
        int count = 0;
        int tamanho = palavra.length();

        if(palavra.charAt(0) == ')' || palavra.charAt(tamanho - 1) == '('){
            resposta = false;
            return resposta;
        }else{

        for (char c : palavra.toCharArray()){
            if(c == '('){
                count++;
            }else if(c == ')'){
                count--;
            }
        }
    }
        if(count != 0){
            resposta = false;
        }
        return resposta;
    }



    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        String palavra = "";
        boolean control = true;
        boolean resp = true;

        while (control) {
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }else{
                resp = Expressao(palavra);
                System.out.println(resp ? "CORRETO" : "INCORRETO");
            }
        }
    }
}