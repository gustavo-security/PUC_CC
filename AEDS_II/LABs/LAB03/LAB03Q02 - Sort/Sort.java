import java.util.*;

public class Sort {
    static class Numero {
        int valor;
        int modulo;
        boolean impar;

        Numero(int valor, int M) {
            this.valor = valor;
            this.modulo = valor % M;
            this.impar = (valor % 2 != 0);
        }
    }

    public static int compare(Numero a, Numero b) {
        // 1) Ordena pelo módulo
        if (a.modulo != b.modulo) {
            return Integer.compare(a.modulo, b.modulo);
        }
        // 2) Ímpar vem antes de par
        if (a.impar != b.impar) {
            return a.impar ? -1 : 1;
        }
        // 3) Dois ímpares -> maior primeiro
        if (a.impar && b.impar) {
            return Integer.compare(b.valor, a.valor);
        }
        // 4) Dois pares -> menor primeiro
        return Integer.compare(a.valor, b.valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean control = true;

        while (control) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (N == 0 && M == 0) {
                System.out.println("0 0");
                control = false;
            } else {
                List<Numero> numeros = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    int valor = sc.nextInt();
                    numeros.add(new Numero(valor, M));
                }

                numeros.sort(Sort::compare);

                System.out.println(N + " " + M);
                for (Numero num : numeros) {
                    System.out.println(num.valor);
                }
            }
        }

        sc.close();
    }
}
