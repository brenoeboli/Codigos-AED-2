import java.util.Scanner;

public class Exercicio3{
    public void mostra_impar(int n){
        int i = 0;
        if(n > 0) {
            while (i < n) {
                if ((i % 2) != 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        else if (n == 0){
            System.err.println("Nenhum numero impar encontrado");
        }
        else{
            System.out.println("Todo numero negativo é impar, então: ");
            while (i > n) {
                if ((i % 2) != 0) {
                    System.out.println(i);
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        Exercicio3 objeto1 = new Exercicio3();
        objeto1.mostra_impar(n);
    }
}
