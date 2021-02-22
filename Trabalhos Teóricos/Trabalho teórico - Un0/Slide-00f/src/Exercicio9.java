import java.io.*;
import java.security.Principal;
import java.util.Scanner;

public class Exercicio9 {
    private String nome_arquivo;

    public void Principal(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public void inseridor() {//Verifica se o arquivo existe, caso não exista, cria um ! Recebe os novos registros como argumento
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Digite o que será adicionado no arquivo");
        String registros = entrada.nextLine();
        try {
            File arquivo = new File(this.nome_arquivo);
            FileWriter inserir = null;

            if (arquivo.exists() == true) {
                inserir = new FileWriter(arquivo, true);//Se existir crie um filewriter que adicione os registros
                BufferedWriter escrevedor = new BufferedWriter(inserir);
                escrevedor.write(registros+"\n");
                System.out.println("Adicionei os registros com sucesso no arquivo: " + arquivo);
                escrevedor.close();

            } else {
                System.err.println("Erro: Arquivo inexistente");
            }




        } catch (Exception e) {
            System.err.println("Tive problemas ao inserir as linhas no arquivo");
        }


    }

    public void removedor() throws FileNotFoundException {
        File pilha = new File(this.nome_arquivo);
        FileReader leitor = new FileReader(pilha);
        BufferedReader leitura = new BufferedReader(leitor);
        String lido;
        String line = "";
        Scanner comparador = new Scanner(pilha);
        try {
            FileWriter limpador = new FileWriter(pilha);
            while(comparador.hasNextLine()){
                lido = leitura.readLine();
                    limpador.write(line);
                    limpador.flush();
                    limpador.close();
                    leitura.close();
                    leitor.close();

            }

        } catch (Exception e) {
            System.err.println("Erro ao limpar o arquivo !");
            System.exit(1);
        }
    }


    public int conta_pilha() throws FileNotFoundException {
        File pilha = new File(this.nome_arquivo);
        Scanner conta_pilha = new Scanner(pilha);
        int i = 0;
        while (conta_pilha.hasNextLine()) {
            i++;
        }
        try {
            conta_pilha.close();
        } catch (Exception e) {
            System.err.println("Erro ao fechar o contador conta_pilha");
            System.exit(1);
        }

        return i;
    }

    public void listador(String nome_arquivo) throws FileNotFoundException {


        try {
            FileReader leitor = new FileReader(nome_arquivo);
            BufferedReader leitura = new BufferedReader(leitor);
            String recebe_conteudo = leitura.readLine();
            if(recebe_conteudo != null) {
                System.out.println(recebe_conteudo);
            }
            else{
                System.out.println("Não tem nada neste arquivo");
            }
            leitura.close();
            leitor.close();

        } catch (Exception e) {
            System.err.println("Tive problemas ao listar os arquivos de: " + nome_arquivo);
            System.exit(1);
        }

    }

    public void para_programa() {
        System.out.println("Fechando programa...");
        System.exit(1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(System.in);
        Exercicio9 arquivo = new Exercicio9();
        System.out.println("Digite o nome do arquivo a ser modificado");
        String nomeArquivo = teclado.nextLine();
        arquivo.Principal(nomeArquivo);
        while (true) {

            System.out.println("MENU DE ESCOLHAS");
            System.out.println("-----------------------");
            System.out.println("Digite 1 para inserir algo ao arquivo: " + nomeArquivo);
            System.out.println("-----------------------");
            System.out.println("Digite 2 para remover algo do arquivo: " + nomeArquivo);
            System.out.println("-----------------------");
            System.out.println("Digite 3 para listar algo os ítens do arquivo: " + nomeArquivo);
            System.out.println("-----------------------");
            System.out.println("Digite 4 para parar o programa e salvar");
            int leitura = teclado.nextInt();
            if (leitura != (int)leitura) {
                System.err.println("Erro, você não digitou um numero");
            } else {
                if(leitura == 1){
                    arquivo.inseridor();
                }
                else if(leitura == 2){
                    arquivo.removedor();
                    System.out.println("Arquivo limpo com sucesso !");

                }
                else if(leitura == 3){
                    arquivo.listador(nomeArquivo);
                }
                else if(leitura == 4){
                    arquivo.para_programa();
                }
                else{
                    System.err.println("Opção inválida");
                }
            }
        }
    }
}
