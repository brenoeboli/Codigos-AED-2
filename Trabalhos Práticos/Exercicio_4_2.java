import java.util.Random;
import java.util.Scanner;

public class Exercicio_4_2 {


    public boolean parada(String palavra) {
        boolean resp = true;
        if (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            resp = false;
        }
        return resp;
    }

    public String troca_caractere(String palavrao, char substituicao, char a_ser_substituido) {
        String out = "";
        for (int i = 0; i < palavrao.length(); i++) {
            if (palavrao.charAt(i) == substituicao) {
                out += a_ser_substituido;
            } else {
                out += palavrao.charAt(i);
            }
        }
        return out;
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
            if (obj1.parada(entrada) == false) {
                parador = true;
            } else {
                entrada_substituicao = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));
                entrada_a_ser_substituido = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));
                String resultado = obj1.troca_caractere(entrada, entrada_substituicao, entrada_a_ser_substituido);
                MyIO.println(resultado);
            }
        }
    }
}

