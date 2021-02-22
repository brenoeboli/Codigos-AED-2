import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Exercicio3{
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo");
        String nome_arquivo = le.nextLine();
        try{
            FileReader leitura = new FileReader(nome_arquivo);
            char[] letras = new char[500];
            leitura.read(letras);

            for(int i = 0; i < 500; i++){
                letras[i] = Character.toUpperCase(letras[i]);
                System.out.print(letras[i]);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
