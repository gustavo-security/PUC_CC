import java.util.Scanner;


public class LAB02Q02_SequenciaEspelho{

    public static String InverteNum(int num){
        String resultado = "";
        int digito = 0;

        while (num > 0) {
            digito = num %10;
            resultado += digito;
            num /= 10;
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String c = "";

        while(scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            for(int i = a; i <= b; i++){
                System.out.print(i);
            }
            for(int i = b; i >= a; i--){
                c = InverteNum(i);
                System.out.print(c);
            }

            System.out.println();
        }

        scanner.close();

    }

}