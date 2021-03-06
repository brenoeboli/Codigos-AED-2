

public class Exercicio3{

    public static boolean naoParada(String s){//Função que verifica se a condição de parada (FIM) é verdadeira ou não
        boolean resp = true;
        if(s.length()== 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){
            resp = false;
        }
        return resp;
    }


    public static void main(String[] args) { //Na main, eu criei uma variável inteira chamada chave, e adicionei ela ao valor Ascii de cada caracter da String

        int chave = 3;
        String str = MyIO.readLine();

        char palavra_depois;

        while(naoParada(str)){
            for (int i = 0; i <str.length(); i++) {//Percorrendo a String
                palavra_depois = (char) (str.charAt(i) + chave);//Codificando cada caracter da palavra
                MyIO.print((palavra_depois));//Printando cada caracter codificado
            }
            MyIO.print("\n");//Dando um espaço entre cada palavra
            str = MyIO.readLine();//Lendo outra palavra
        }
    }
}
