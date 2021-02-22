import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        char[] palavra = new char[500];
        char[] palavra_invertida = new char[500];
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo a ser lido");
        String arquivo_normal = in.nextLine();
        System.out.println("Digite o nome do arquivo a receber a ordem invertida");
        String arquivo_invertido = in.nextLine();

        try {
            FileReader leitor = new FileReader(arquivo_normal);
            leitor.read(palavra);
            int i = 0;
            while(palavra[i] != Character.MIN_VALUE){//Contando caracteres
                i++;
            }
            System.out.println("i = "+i);
            for(int j = 0; j <= i; j++){//Invertendo as palavras

                palavra_invertida[j] = palavra[i - j];
                System.out.print(palavra_invertida[j]);

            }

            FileWriter escrevedor = new FileWriter(arquivo_invertido);
            escrevedor.flush();
            for(int k = 0; k <= i; k++) {
                if (palavra_invertida[k] != Character.MIN_VALUE) {
                    escrevedor.write(palavra_invertida[k]);
                }
            }

            escrevedor.close();
            leitor.close();


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
