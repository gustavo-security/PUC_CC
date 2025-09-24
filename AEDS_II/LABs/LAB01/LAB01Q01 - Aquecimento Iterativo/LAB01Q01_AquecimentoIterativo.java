import java.util.Scanner;

public class LAB01Q01_AquecimentoIterativo{

        public static int NumMaiuscula(String palavra){
            int count = 0;
            for(int i = 0; i < palavra.length(); i++){
                if(palavra.charAt(i) >= 'A' && palavra.charAt(i) <= 'Z'){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String palavra = "";
        Boolean control = true;

        while (control) {
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }else{
                System.out.println(NumMaiuscula(palavra));
            }
            
        }


        scanner.close();
    }

}