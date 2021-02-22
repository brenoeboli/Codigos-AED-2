import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

    public static void manipula_arquivo(String escrita_arquivo, File arquivo){
        Scanner leia = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter(arquivo);
            fw.write(escrita_arquivo);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo à ser criado e o tipo");
        String recebe_nome = leia.nextLine();
        File arquivo = new File(recebe_nome);
        System.out.println("Digite algo a ser escrito no arquivo");
        String escrita_arquivo = leia.nextLine();
        Exercicio1 objeto1 = new Exercicio1();
        objeto1.manipula_arquivo(escrita_arquivo, arquivo);


    }

}
