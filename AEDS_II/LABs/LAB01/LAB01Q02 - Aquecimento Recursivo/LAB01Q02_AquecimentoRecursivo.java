import java.util.Scanner;


public class LAB01Q02_AquecimentoRecursivo{

        public static int NumMaiuscula(String palavra, int index){
        
            int count = 0;

            if(index == palavra.length()){
                return 0;
            }

            if(palavra.charAt(index) >='A' && palavra.charAt(index) <= 'Z'){
                count += 1;
            }

            return count + NumMaiuscula(palavra, index + 1);
        }


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String palavra = "";
        boolean control = true;

        while(control){
            palavra = scanner.nextLine();
            if(palavra.equalsIgnoreCase("FIM")){
                control = false;
            }
            else{
                System.out.println(NumMaiuscula(palavra, 0));
            }
        }
        scanner.close();
    }
}
