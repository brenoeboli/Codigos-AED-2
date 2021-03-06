import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args) {
        Scanner verde = new Scanner(System.in);
        int ultimo_ano = 1986;
        boolean parada = false;
        while (!parada) {
            int ano_atual = verde.nextInt();
            if (ano_atual == 0) {
                parada = true;
            } else {
                int contador = 0;
                int soma_anos = ultimo_ano;
                while(soma_anos <= ano_atual){
                    soma_anos += 76;
                    contador++;
                }
                int resultado = ultimo_ano+(contador*76);
                System.out.println(resultado);
            }
        }
    }
}
