package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "./data.txt";
        //este try obtém um InputStream para ler o arquivo dentro de um diretório src (resources)
        //envelopa o inputStream por um BufferReader para facilitar e leitura do arquivo linha por linha
        //o código abaixo está usando try-with-resources --garante o fechamento das instruções do try
        try (InputStream inputStream = Main.class.getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            //verifica do inputStream se é nulo. Se for nulo, indica q o arquivo não foi encontrado
            if (inputStream == null) {
                throw new IOException("Arquivo não encontrado: " + fileName);
            }

            String line;
            //lê o arquivo linha por linha e imprime estas linhas na tela
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
        }

    } catch (IOException e) //tratamento da exceção em tempo de execução --> lançado durante a leitura do arquivo

    {
        System.err.println("Erro ao ler o arquvivo: " + e.getMessage());
        e.getStackTrace(); //imprime a pilha de chamadas --> stack trace
    }
    }
}
