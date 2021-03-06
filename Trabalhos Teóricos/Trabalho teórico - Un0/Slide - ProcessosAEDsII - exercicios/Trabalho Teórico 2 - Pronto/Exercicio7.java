import java.util.Scanner;

public class Exercicio7 {


    public static void main(String[] args) {
        Scanner verde = new Scanner(System.in);
        boolean parada = false;
        while (parada == false) {
            int idade_monica = verde.nextInt();
            if (idade_monica == 0) {
                parada = true;
            } else {
                int idade_filho_novo = verde.nextInt();
                int idade_filho_meio = verde.nextInt();
                int soma_filhos = idade_filho_novo + idade_filho_meio;
                int idade_filho_velho = idade_monica - soma_filhos;
                if(soma_filhos <= idade_monica){
                    System.out.println(idade_filho_velho);
                }
                else{
                    parada = true;
                }
            }

        }
    }

}
