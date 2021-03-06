import java.util.Scanner;

public class TesteCiframento{

    String palavra = new String();

    public void set_palavra(String palavra){
        this.palavra = palavra;
    }
    public String get_palavra(){
        return this.palavra;
    }
    public void Codifica(String palavras){
        char[] vetor = palavras.toCharArray();
        char[] vetor_2 = new char[vetor.length];
        int tam = vetor.length;
        int ASCII = 0;
        for(int i = 0; i < tam; i++){
            ASCII = (int) vetor[i] + 3;
            vetor_2[i] = (char)ASCII;
        }
        String palavrao = vetor_2.toString();
        set_palavra(palavrao);
    }


    public static void main(String[] args) {
        TesteCiframento teste1 = new TesteCiframento();
        Scanner entrada = new Scanner(System.in);
        boolean parada = false;
        String fim = "FIM";
        while(parada == false){
            String str = entrada.nextLine();
            if(str.equals(fim)){
                parada = true;
            }
            else{
                teste1.Codifica(str);
                String retorno = teste1.get_palavra();
                System.out.println(retorno);
            }
        }
    }
}
