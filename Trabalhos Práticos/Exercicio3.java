

public class Exercicio3{

    public static boolean naoParada(String s){
        boolean resp = true;
        if(s.length()== 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){
            resp = false;
        }
        return resp;
    }


    public static void main(String[] args) {

        int chave = 3;
        String str = MyIO.readLine();

        char palavra_depois;

        while(naoParada(str)){
            for (int i = 0; i <str.length(); i++) {
                palavra_depois = (char) (str.charAt(i) + chave);
               MyIO.print((palavra_depois));
            }
            MyIO.print("\n");
            str = MyIO.readLine();
        }
    }
}
