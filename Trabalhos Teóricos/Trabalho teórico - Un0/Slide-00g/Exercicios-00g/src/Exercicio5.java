import java.util.Scanner;

public class Exercicio5{
    public int calcula_media(int[] vetor, int nota_maxima){
        int i = 0;
        int soma = nota_maxima;
        while(i < 19){//Já tenho uma nota, que é a maxima, então só completo o vetor com as outras notas.
            if(vetor[i] < nota_maxima){
                soma += vetor[i];
            }
            i++;
        }
        soma = soma/20;
        return soma;
    }
    public int retorna_alunos_ruins(int[] vetor, int nota_maxima){
        int media = nota_maxima*(6/10);
        int i = 0;
        int num_alunos_ruins = 0;
        while ( i < 19){
            if(vetor[i] < media){
                num_alunos_ruins++;
            }
            i++;
        }
        return num_alunos_ruins;
    }
    public int retorna_alunos_bons(int[] vetor, int nota_maxima){
        int nov_per_cent = nota_maxima*(9/10);
        int i = 0;
        int num_alunos_bons = 0;
        while(i < 19){
            if(vetor[i] > nov_per_cent){
                num_alunos_bons++;
            }
            i++;
        }
        return num_alunos_bons+1;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota máxima tirada na sala");
        int nota_maxima = teclado.nextInt();
        int[] vetor = new int[19];
        int i = 0;
        while(i < 19){
            System.out.println("Digite a nota do aluno "+(i+1));
            vetor[i] = teclado.nextInt();
            i++;
        }
        Exercicio5 alunos = new Exercicio5();
        int media_turma = alunos.calcula_media(vetor, nota_maxima);
        System.out.println("A media da turma é: "+media_turma);
        int alunos_menor_media = alunos.retorna_alunos_ruins(vetor, nota_maxima);
        System.out.println("O número de alunos menor que a média é: "+alunos_menor_media);
        int alunos_maior_nov = alunos.retorna_alunos_bons(vetor, nota_maxima);
        System.out.println("O número de alunos maior que noventa por cento é: "+alunos_maior_nov);
    }
}
