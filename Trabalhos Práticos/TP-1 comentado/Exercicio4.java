import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public boolean parada(String palavra) {//Criando a função que verifica a condição de parada, que recebe uma string como argumento
        boolean resp = true;
        if (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            resp = false;//Caso cada caracter da palavra sejam iguais à F, I, M maiúsculo respectivamente, resp = false
        }
        return resp;
    }

    public String troca_caractere(String palavrao, char substituicao, char a_ser_substituido){//Criando a função que troca os caracteres, recebendo como argumento uma string, o char a ser substituido e o char substituto, ambos gerados pela função Random
        char[] palavra_antes = palavrao.toCharArray(); //Transformando a string em um array de char
        int tam = palavra_antes.length;
        String palavra_depois;
        for(int i = 0; i < tam; i++){//Procurando o char a ser substituido pela string
            if(palavra_antes[i] == substituicao){
                palavra_antes[i] = a_ser_substituido;//Substituindo o char no array
            }
       }
        palavra_depois = String.valueOf(palavra_antes); //Transformando o array em string denovo
        return palavra_depois;
    }

    public static void main(String[] args) {
        Exercicio4 obj1 = new Exercicio4();//Intanciando um novo objeto do tipo Exercicio4
        boolean parador = false;
        Random randomico = new Random();//instanciando um novo objeto do tipo Random
        randomico.setSeed(4);//Setando a seed por fins de correção
        char entrada_substituicao;
        char entrada_a_ser_substituido;

        while (parador == false) {//Parador começa falso, e caso a função parada retornar false, parador recebe true.
            String entrada = MyIO.readLine();//Lendo do pub.in
            if(obj1.parada(entrada) == false){//Comparando entrada do pub.in com a palavra chave para parar o programa (FIM)
                parador = true;
            }else {//Caso a palavra que entrou no programa não seja FIM:
                entrada_substituicao = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));//Lógica de geração da palavra de substituição
                entrada_a_ser_substituido = ((char) ('a' + (Math.abs(randomico.nextInt())) % 26));//Lógica de geração da palavra a ser susbstituida
                String resultado = obj1.troca_caractere(entrada, entrada_substituicao, entrada_a_ser_substituido);//Recebendo a palavra codificada
                MyIO.println(resultado);//Printando a palavra codificada
            }
        }
    }
}
