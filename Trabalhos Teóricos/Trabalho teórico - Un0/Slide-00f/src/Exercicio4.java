import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;

public class Exercicio4{
    public static void main(String[] args){
        //char[] vetor_1 = new char[500];
        String linha;
        System.out.println("Digite o nome do primeiro arquivo");
        Scanner leia = new Scanner(System.in);
        String arquivo_1 = leia.nextLine();
        System.out.println("Digite o nome do segundo arquivo");
        String arquivo_2 = leia.nextLine();
        try{
            FileReader leitor_file = new FileReader(arquivo_1);//Cria um objeto do tipo FileReader e sua instancia recebe como argumento o arquivo a ser lido
            BufferedReader in = new BufferedReader(leitor_file);
            FileWriter escrevedor = new FileWriter(arquivo_2);
            linha = in.readLine();
            int i = 0;
            if(linha != null) {
                escrevedor.write(linha);
            }
            escrevedor.close();
            leitor_file.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
