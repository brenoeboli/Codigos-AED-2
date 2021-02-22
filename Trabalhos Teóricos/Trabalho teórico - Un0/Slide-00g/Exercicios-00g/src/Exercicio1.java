import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nota = new int[5];
        int i = 0;
        int soma = 0;
        while(i < 5){
            System.out.println("Digite a nota do aluno "+(i+1));
            nota[i] = entrada.nextInt();
            soma += nota[i];
            i++;
        }
        soma = soma/5;
        System.out.println("A media da soma dos alunos é: "+soma);
    }
}


