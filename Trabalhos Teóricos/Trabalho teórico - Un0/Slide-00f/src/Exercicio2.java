import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class Exercicio2 {
    public static void main(String[] args){
        Scanner le = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do arquivo");
        nome = le.nextLine();
        try {
            FileReader arquivo = new FileReader(nome);
            char[] letras = new char[500];
            arquivo.read(letras);
            for (char c : letras) {
                System.out.print(c);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        /*String teste = "asdasd";
        teste = teste.toUpperCase();*/

    }
}


