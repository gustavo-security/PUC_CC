import java.util.Scanner;
import java.io.*;
import java.util.Locale;

public class TP01Q08_ArquivoemJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Para ponto como separador decimal
        int n = scanner.nextInt();

        try {
            File arquivo = new File("arquivo.txt");

            FileWriter escrever = new FileWriter(arquivo);

            // Escreve os números no arquivo
            for (int i = 0; i < n; i++) {
                double numero = scanner.nextDouble();
                if (numero == (int) numero) {
                    escrever.write((int) numero + "\n");
                } else {
                    escrever.write(numero + "\n");
                }
            }

            escrever.close();
            scanner.close();

            // Lê os números do arquivo de trás para frente
            RandomAccessFile file = new RandomAccessFile("arquivo.txt", "r");
            long length = file.length();
            long position = length - 1;
            StringBuilder line = new StringBuilder();

            // Lê o arquivo de trás para frente
            while (position >= 0) {
                file.seek(position);
                char c = (char) file.readByte(); // Lê um caractere

                // Quando encontrar uma nova linha, imprima o número
                if (c == '\n') {
                    // Imprime a linha atual se não estiver vazia
                    if (line.length() > 0) {
                        System.out.println(line.reverse().toString());
                        line.setLength(0); // Limpa o StringBuilder para a próxima linha
                    }
                } else {
                    line.append(c); // Adiciona o caractere à linha
                }
                position--;
            }

            // Se o arquivo não terminar em uma nova linha, imprime o último número
            if (line.length() > 0) {
                System.out.println(line.reverse().toString());
            }

            file.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}