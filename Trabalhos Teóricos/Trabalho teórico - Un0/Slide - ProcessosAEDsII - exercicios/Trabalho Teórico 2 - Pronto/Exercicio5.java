import java.util.Scanner;

public class Exercicio5 {
    public boolean identifica_palindromo(char[] vetor){
        int tam = vetor.length - 1;
        int contador = 0;
        boolean bool = false;
        for(int i = 1; i <= tam; i++){
            if(vetor[i] == vetor[tam-i]){
                contador++;
            }
        }
        if(contador == tam){
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String termino = "FIM";
        String recebe_frase = null;
        while(true){
            recebe_frase = entrada.nextLine();
            int tamanho = recebe_frase.length();
            char[] palavra = new char[tamanho];
            if(recebe_frase.equals(termino)){
                System.exit(1);
            } else{
                palavra = recebe_frase.toCharArray();
                Exercicio5 objeto = new Exercicio5();
                boolean resultado = objeto.identifica_palindromo(palavra);
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
