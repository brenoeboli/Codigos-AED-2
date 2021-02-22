import java.util.Scanner;

public class exercicio2{
	//Criando um método do tipo static boolean, que é publico.
	public static boolean verifica_array(int[] array, int x){//Neste exercício, recebendo um array ordenado, utilizei a lógica demostrada em um vídeo, do professor Max, onde o array é dividido em posições, esquerda(menor valor), direita(maior valor) e meio(maior valor somado ao menor valor, dividido por dois). Os valores inteiros esq(esquerda),dir(direita) e meio serão as posições do array, tomando como referência o meio.  
		
		boolean bool = false;
		
		int dir = array.length-1;//Como estou tomando como referencia o tamanho do array(varia de 0 a x), então considerei que a ultima posição seria x-1.
		
		int esq = 0;//Primeira posição do array, começando sempre com 0, idependente do tamanho.

		int verificador_termino = 0;

		int meio = dir/2;//Como a esq é, inicialmente 0, então para fins de simplificação considerei o meio como sendo dir dividido por 2.
		outerloop://Essencial para indicar qual o loop será quebrado com o comando "break outerloop", então este loop se torna um outerloop.
		while(esq <= dir){//Considera que, se a posição da esquerda passar da posição da direita, então,todos os valores foram verificados e o valor não está contido no array. 
			if(array[meio]==x){//Aqui, é considerado o melhor caso, assim de cara, caso o valor procurado esteja na primeira posição, a variavel bool recebe true e o loop para.
				bool = true;
				break outerloop;
			}
			else if(array[meio] > x){//Aqui, é considerado que se o valor procurado é menor do que o valor do meio do array, então o valor procurado só pode estar "à esquerda"(meno) do valor do meio, então o escopo de procura diminui para menos da metade, já que somente os valores menores que o do meio serão considerados.	
				dir = meio-1;//dir é atualizado para uma posição a menos do que o valor do meio
				meio = dir/2;//O meio também é atualizado para outro calculo ser efetuado, a variavel esq continua na posição zero.
				System.out.println("Entrou no primeiro else if");

			}
			else if(array[meio] < x){//Aqui acontece exatamente o inverso da condição anterior, então o valor procurado só pode ser maior que o valor do meio, assim implicando na atualização da variavel esq, que agora é a posição do meio antigo mais um. Como a esquerda foi atualizada, agora o meio passa a ser a dir, que permanece a mesma do início, o meio é atualizado para a antiga direita, mais a nova esquerda somadas, dividido por dois.
				esq = meio+1;
				meio = (dir+esq)/2;
				System.out.println("Entrou no segundo else if");
			}
			
		}

		return bool;
	}

	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);//Cria um objeto do tipo Scanner, denominado "leia".

		System.out.println("Digite o valor a ser verificado");

		int x = leia.nextInt();//Pegando o valor procurado do teclado

		int tam;

		System.out.println("Digite o tamanho do seu array");
		
		tam = leia.nextInt();

		int[] array = new int[tam];//Criando um novo objeto do tipo int[], ou seja um array de inteiros.
	
		for(int j = 0;j < tam;j++){//Atribuindo os valores ao array criado, com valores do teclado
			System.out.println("Digite o valor de array["+j+"]");
			array[j] = leia.nextInt();
		}

		exercicio2 obj2 = new exercicio2();//Criando um novo objeto do tipo exercicio2, denominado "obj2"
			
		boolean bool;

		bool = obj2.verifica_array(array, x);//Igual no exercicio1, uma variavel do tipo boolean recebe o resultado retornado da função "verifica_array"

		if(bool == true){
			System.out.println("Valor esta dentro do array");
		}
		else{
			System.out.println("Valor nao esta dentro do array");

		}

	}
                
}                  
