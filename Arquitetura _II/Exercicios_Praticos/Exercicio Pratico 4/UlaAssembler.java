import java.io.*;
import java.util.*;

public class UlaAssembler {

    // Retorna um Map com as instruções e seus respectivos códigos hexadecimais
    public static Map<String, String> carregarTabelaInstrucoes() {
        Map<String, String> tabela = new HashMap<>();
        tabela.put("zeroL", "0");
        tabela.put("umL", "1");
        tabela.put("copiaA", "2");
        tabela.put("copiaB", "3");
        tabela.put("nA", "4");
        tabela.put("nB", "5");
        tabela.put("AenB", "6");
        tabela.put("nAeB", "7");
        tabela.put("AxB", "8");
        tabela.put("nAxnB", "9");
        tabela.put("nAxnBn", "A");
        tabela.put("AeB", "B");
        tabela.put("AeBn", "C");
        tabela.put("AoBn", "D");
        tabela.put("AoB", "E");
        tabela.put("nAonBnB", "F");
        return tabela;
    }

    // Extrai valor de X ou Y (número ou letra A-F)
    public static String extrairValor(String linha, int numeroLinha, String variavel) {
        try {
            String valor = linha.split("=")[1].replace(";", "").trim();

            // Se for número
            if (valor.matches("\\d+")) {
                int valorInt = Integer.parseInt(valor);
                return Integer.toHexString(valorInt).toUpperCase();
            }

            // Se for hex de A até F
            if (valor.matches("[A-Fa-f]+")) {
                return valor.toUpperCase();
            }

        } catch (Exception e) {
            System.out.println("Erro na linha " + numeroLinha +
                               ": Valor inválido em " + variavel + ": " + linha);
        }
        return null;
    }

    // Processa o arquivo .ula e gera .hex
    public static void processarArquivoULA() {
        String arquivoEntrada = "testeula.ula";
        String arquivoSaida = "testeula.hex";

        Map<String, String> tabelaInstrucoes = carregarTabelaInstrucoes();
        boolean inicio = false;
        String valorX = null;
        String valorY = null;

        try (BufferedReader entrada = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter saida = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String linha;
            int numeroLinha = 0;

            while ((linha = entrada.readLine()) != null) {
                numeroLinha++;
                linha = linha.trim();

                if (linha.equals("inicio:")) {
                    inicio = true;
                    continue;
                }
                if (linha.equals("fim.")) {
                    break;
                }
                if (!inicio || linha.isEmpty()) {
                    continue;
                }

                if (linha.startsWith("X=")) {
                    valorX = extrairValor(linha, numeroLinha, "X");
                    continue;
                }
                if (linha.startsWith("Y=")) {
                    valorY = extrairValor(linha, numeroLinha, "Y");
                    continue;
                }
                if (linha.startsWith("W=")) {
                    String codigoInstrucao = linha.split("=")[1].replace(";", "").trim();

                    if (!tabelaInstrucoes.containsKey(codigoInstrucao)) {
                        System.out.println("Erro na linha " + numeroLinha +
                                           ": Instrução desconhecida: " + codigoInstrucao);
                        continue;
                    }

                    String valorW = tabelaInstrucoes.get(codigoInstrucao);

                    if (valorX != null && valorY != null) {
                        String linhaHex = valorX + valorY + valorW;
                        saida.write(linhaHex);
                        saida.newLine();
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processarArquivoULA();
    }
}
