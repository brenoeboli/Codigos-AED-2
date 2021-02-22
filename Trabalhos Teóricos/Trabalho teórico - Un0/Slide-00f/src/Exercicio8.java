import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio8{
    public static void main(String[] args) throws FileNotFoundException {
        char[] palavra = new char[500];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo a ser codificado");
        String arquivo = entrada.nextLine();
        FileReader leitor = new FileReader(arquivo);
        int ASCII = 0, k = 3;
        char recebe_caractere;
        try{
            leitor.read(palavra);
            for (char c: palavra) {
                if (c != Character.MIN_VALUE) {
                    ASCII = (int) c - k;
                    recebe_caractere = (char) ASCII;
                    System.out.print(recebe_caractere);
                }

            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
