import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero n");
        n = entrada.nextInt();
        int numero = 1;
        System.out.println(numero);
        while(i < n){
            if((i % 2) == 0){
                numero += 7;
                System.out.println(numero);
            }else if((i % 2) != 0){
                numero +=4;
                System.out.println(numero);
            }
            i++;
        }
    }
}
