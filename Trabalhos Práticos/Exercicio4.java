import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public boolean parada(String palavra) {
        boolean resp = true;
        if (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            resp = false;
        }
        return resp;
    }

    public String troca_caractere(String palavrao, char substituicao, char a_ser_substituido){
        char[] palavra_antes = palavrao.toCharArray();
        int tam = palavra_antes.length;
        String palavra_depois;
        for(int i = 0; i < tam; i++){
            if(palavra_antes[i] == substituicao){
                palavra_antes[i] = a_ser_substituido;
            }
       }
        palavra_depois = String.valueOf(palavra_antes);
        return palavra_depois;
    }

    public static void main(String[] args) {
        Exercicio4 obj1 = new Exercicio4();
        boolean parador = false;
        Random randomico = new Random();
        randomico.setSeed(4);
        char entrada_substituicao;
        char entrada_a_ser_substituido;

        while (parador == false) {
            String entrada = MyIO.readLine();
            if(obj1.parada(entrada) == false){
                parador = true;
            }else {
                entrada_substituicao = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));
                entrada_a_ser_substituido = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));
                String resultado = obj1.troca_caractere(entrada, entrada_substituicao, entrada_a_ser_substituido);
                MyIO.println(resultado);
            }
        }
    }
}
