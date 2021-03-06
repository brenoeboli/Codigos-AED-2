public class Exercicio11{
    public static int isFim(String palavra, int i){
        int tam = palavra.length() - 1;
        if(tam == 2){
            if(palavra.charAt(i) == 'F' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'M'){
                return isFim(palavra.substring(1), i+1) + 1;
            }
            else{
                return isFim(palavra.substring(1), i+1);
            }

        }else{
            return 0;
        }
    }
    public static String replaceAll(String palavra, char a, int i) {
        int tam = palavra.length() - 1;
        char[] caracteres = palavra.toCharArray();
        if (palavra.length() < 0) {
            return "";
        }
        if (caracteres[i] == a) {
            caracteres[i] = " ";
            String palavra_depois = new String(caracteres);
            return replaceAll(palavra_depois, a, i + 1);
        }else{
            return palavra;
        }


    }



    public int conta_palindromo(String palavra, int i) {
        int tam = palavra.length() - 1;
        if(palavra.isEmpty()){
            return 0;
        }
        else{
            if(tam > 1) {
                if (palavra.charAt(i) == palavra.charAt(tam - i)) {
                    MyIO.println("Entrou no if, dentro do else, conta_palindromo");
                    MyIO.println("IF - String.substring("+i+") = "+palavra.substring(i, tam - i));
                    palavra =
                    return conta_palindromo(palavra, i + 1) + 1;
                } else {
                    MyIO.println("ELSE - String.substring("+i+") = "+palavra.substring(i, tam - i));
                    MyIO.println("Entrou no else, dentro do else - conta_palindromo");
                    palavra = palavra.replaceAll(palavra.charAt(i), "");
                    return conta_palindromo(palavra, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Exercicio11 obj1 = new Exercicio11();
        boolean parada = false;
        String palavra = MyIO.readLine();
        int i = 0;
        char breno_0 = 'b';
        char breno_4 = 'o';
        palavra = replaceAll(palavra, breno_0, i);
        palavra = replaceAll(palavra, breno_4, i);
        MyIO.println(palavra);
    }
}
