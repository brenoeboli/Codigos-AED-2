
public class IsEmJava{

    public static boolean isNotFim(String s){//Função que compara a string de entrada, caso seja igual a fim retorna true, se não retorna false
        boolean resp = true;
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){
            resp = false;
        }
        return resp;
    }
    public String modifica_string(String str){//Modificando a string de entrada para fins de simplificação
        str = str.replaceAll(" ", "");
        return str;
    }

    public boolean IsVogal(String str){//Função que conta se cada cada caracter da string é uma vogal, fazendo comparações.
        boolean resp = false;
        int tam = str.length();
        int count = 0;
        if(tam > 0) { //Garantindo que o tamanho da string seja positivo, para evitar erros por mim desconhecidos
            for (int i = 0; i < tam; i++) {//Percorrendo a string
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
            }
            if (count == tam ) {//Caso todas as letras sejam igual a alguma vogal, então resp recebe true

                resp = true;
            }
        }
        return resp;
    }


    public boolean IsConsoante(String str){//Função que verifica se a string digitada contém somente consoantes, utiliza da mesma lógica da IsVogal, porém com mais comparações
        boolean resp = false;
        int tam = str.length();
        int count = 0;
        if(tam > 0) {//Mesmo motivo da outra função, evitar erros desconhecidos por mim.
            for (int i = 0; i < tam; i++) {//Percorrendo a string
                if (str.charAt(i) == 'b' || str.charAt(i) == 'c' || str.charAt(i) == 'd' || str.charAt(i) == 'f' || str.charAt(i) == 'g'
                        || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l' || str.charAt(i) == 'm'
                        || str.charAt(i) == 'n' || str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 't'
                        || str.charAt(i) == 'v' || str.charAt(i) == 'x' || str.charAt(i) == 'z' || str.charAt(i) == 'w' || str.charAt(i) == 's') {
                    count++;//Contando quantas consoantes tem na string

                }
            }
            if (count == tam ) {//Se toda a string for composta por consoantes
                resp = true;//Retorna true
            }
        }

        return resp;
    }

    public boolean IsInteiro(String str){ //Função que verifica se o a string é composta por números inteiros, para isto, é comparado os intervalos de char passados para a String, se cada letra(char) da string estiver entre 0 e 9 e nenhum dos chars for um ponto ou uma vírgula, retorna true

        boolean resp = false;
        int tam = str.length();
        int count = 0;
        if(tam > 0) {//Percorrendo a string e procurando por intervalos de 0 à nove inclusive, e procurando por pontos e vírgulas
            for (int i = 0; i < tam; i++) {
                if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') && (str.charAt(i) != '.' && str.charAt(i) != ',')) {
                    count++;//Contando a quantidade de caracteres que obedece à condição descrita acima
                }
            }
            if(count == tam){//Caso todos os caracteres obedeçam, então é uma string composta somente por inteiros
                resp = true;
            }
        }

        return resp;
    }


    public boolean IsReal(String str) {//Esta função conta a quantidade de caracteres que obedecem a condição de número real, ou seja, possuem um ponto OU vírgula dentre seus caractéres e o intervalo de números varia de 0 à nove para cada char da string
        boolean resp = false;
        int tam = str.length() ;
        int count = 0;
        int conta_ponto_virgula = 0;
        if(tam > 0) {//Percorrendo a string
            for (int i = 0; i < tam; i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == '.' || str.charAt(i) == ',') {
                    count++;//Contando a quantidade de caracteres que obedecem à condição descrita acima
                }
                if (str.charAt(i) == '.' || str.charAt(i) == ',') {//Contando a quantidade de pontos e vírgulas, sendo que um real só tem um ponto OU uma vírgula
                    conta_ponto_virgula++;
                }
            }
        }

        return resp;
    }



    public static void main(String[] args) {
        boolean bool = false;
        IsEmJava objeto = new IsEmJava();//Criando um novo objeto do tipo IsJava
        int i = 0;
        while(bool == false) {//Criando um loop "infinito"
            String str = MyIO.readLine();//Lendo uma string de entrada
            str = objeto.modifica_string(str);// Modificando a string para fins de simplificação
            if(isNotFim(str) == false){//Verificando se a condição de parada do programa é verdadeira ou não
                bool = true;//Se for bool recebe true e o programa não roda mais
            }
            else {//Caso a condição seja falsa é verificado se cada função retorna verdadeiro ou falso, mostrando o resultado de cada uma como SIM ou NAO
                if (objeto.IsVogal(str)) {
                    MyIO.print("SIM ");
                    //MyIO.print("\n");
                }
                else{
                    MyIO.print("NAO ");
                    //MyIO.print("\n");
                }
                if (objeto.IsConsoante(str)) {
                    MyIO.print("SIM ");
                    //MyIO.print("\n");
                }
                else{
                    MyIO.print("NAO ");
                    //MyIO.print("\n");
                }
                if (objeto.IsInteiro(str)) {
                    MyIO.print("SIM ");
                    //MyIO.print("\n");
                }
                else{
                    MyIO.print("NAO ");
                    //MyIO.print("\n");
                }
                if (objeto.IsReal(str)) {
                    MyIO.print("SIM ");
                    //MyIO.print("\n");
                }
                else{
                    MyIO.print("NAO ");
                    //MyIO.print("\");
                }
                MyIO.print("\n");//Printando um espaço para cada linha de ebtrada
            }
            i++;
        }
    }
}
