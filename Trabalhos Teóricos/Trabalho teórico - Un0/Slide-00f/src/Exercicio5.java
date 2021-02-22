import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        String linha;
        System.out.println("Digite o nome do arquivo a ser lido");
        Scanner in = new Scanner(System.in);
        String nome_arquivo_1 = in.nextLine();
        System.out.println("Digite o nome do arquivo a ser escrito por mim");
        String nome_arquivo_2 = in.nextLine();
        try{
            FileReader leitor = new FileReader(nome_arquivo_1);
            BufferedReader entrada = new BufferedReader(leitor);
            FileWriter escrevedouro = new FileWriter(nome_arquivo_2);
            linha = entrada.readLine();
            if(linha != null){
                linha = linha.toUpperCase();
                escrevedouro.write(linha);
                //escrevedouro.write(linha);
            }
            escrevedouro.close();
            leitor.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
