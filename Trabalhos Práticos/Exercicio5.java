public class Exercicio5{
    public int conta_numeros(String expressao){
        expressao = expressao.replaceAll(" ", "");
        int count = 0;
        while(expressao.charAt(count) == '0' || expressao.charAt(count) == '1'){
            count++;
        }
        return count;
    }
    public String retorna_valores(String expressao){
        int tam = conta_numeros(expressao);
        char[] valores_letras = new char[tam];
        for(int i = 0; i < tam-1; i++){
            if(expressao.charAt(i) == '0' || expressao.charAt(i) == '1'){
                valores_letras[i] = expressao.charAt(i);
            }
        }
        String valores_let = new String(valores_letras);
        return valores_let;
    }
    public void retorna_valor_expressao(String expressao, String valores_let){
        int tam = conta_numeros(expressao);
        int[] valor_inteiro = new int[tam];
        for(int i = 0; i < tam-1; i++){
            valor_inteiro[i] = (int)valores_let.charAt(i);
        }

    }

    public static void main(String[] args) {
        String expressao = MyIO.readLine();
        expressao = expressao.replaceAll(" ", "");
        Exercicio5 obj1 = new Exercicio5();
        obj1.retorna_valor_expressao(expressao);
    }

}
