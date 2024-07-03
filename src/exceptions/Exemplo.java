package exceptions;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.*;  ---> importação genérica

public class Exemplo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo.txt");
            BufferedReader fileInput = new BufferedReader(file);

            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e);
        } finally {
            System.out.println("Execução do bloco finally, que sempre executa!");
        }
    }
}
