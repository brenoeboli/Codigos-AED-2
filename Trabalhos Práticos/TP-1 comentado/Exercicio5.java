import java.util.Scanner;

public class Exercicio5 {
    public boolean identifica_palindromo(char[] vetor){ //Criando a função que identifica se a String, que foi transformada para um array de char, é um palindromo
        int tam = vetor.length - 1;
        int contador = 0;
        boolean bool = false;//Variavel que diz se o char é um palíndromo
        for(int i = 1; i <= tam; i++){//Percorrendo o vetor de char, onde, caso o elemento na posição i é igual ao elemento na posição contrária, ou seja (tam - i)
            if(vetor[i] == vetor[tam-i]){
                contador++;// Este contador é iterado cada vez que uma posição corresponde à sua contrária posição i-tam
            }
        }
        if(contador == tam){ // Se o contador for igual ao tamanho do vetor, então significa que a palavra passada é um palíndromo
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String termino = "FIM";//Criando a string que guarda a palavra que para o programa
        String recebe_frase = null;
        while(true){ //Criando um loop, aparentemente infinito
            recebe_frase = entrada.nextLine();//recebendo frase do pub.in, com a classe Scanner do pacote util
            int tamanho = recebe_frase.length();
            char[] palavra = new char[tamanho];
            if(recebe_frase.equals(termino)){//Comparando se a palavra digitada é igual à termino. Caso seja, o programa é parado
                System.exit(1);
            } else{ // Caso a frase não seja igual à de término:
                palavra = recebe_frase.toCharArray(); //um array de char recebe a string convertida
                Exercicio5 objeto = new Exercicio5();//Instanciando um novo objeto do tipo Exercicio5
                boolean resultado = objeto.identifica_palindromo(palavra);//Pegando o resultado da função verifica palĩndromo
                if(resultado == true){
                    System.out.println("SIM");
                }
                else{
                    System.out.println("NAO");
                }
            }
        }
    }
}
