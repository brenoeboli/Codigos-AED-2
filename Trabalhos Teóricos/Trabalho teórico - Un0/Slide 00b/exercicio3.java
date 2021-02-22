import java.util.Scanner;//importando o pacote onde está a classe Scanner

public class exercicio3{
	
	public static void retorna_maior_menor(int[] array){
		int tam = array.length;	
		int maior = array[tam-1];
		int menor = array[0];	
		for(int i = 0; i < tam; i++){
			if(array[i]<menor){//A variável menor vai ir comparando valor por valor, assim quando o loop terminar, ficará com o menor valor armazenado.
				menor = array[i]; 
			}	
		}
		for(int i = 0;i < tam; i++){//O mesmo da variável menor acontece aqui, porém, agora a comparação permite achar a maior variável.
			if(array[i]>maior){
				maior = array[i];
			}

		}	
		System.out.println("O maior elemento do array eh: "+maior);
		System.out.println("O menor elemento do array eh: "+menor);
	}

	public static void main(String[] args){
		exercicio3 objeto1 = new exercicio3();//Cria-se um novo objeto do tipo exercicio3, denominado "ojeto1"
		
		Scanner leia = new Scanner(System.in);//Cria-se um novo objeto da classe Scanner, para armazenar valores do teclado.

		System.out.println("Digite o tamanho do array");
		
		int tam = leia.nextInt();

		int[] array = new int[tam];

		for(int i = 0;i < tam; i++){
			System.out.println("Digite o valor de array["+i+"]: ");
			array[i] = leia.nextInt();
		}
		
		exercicio3.retorna_maior_menor(array);//Chamando a função "verifica_maior_menor", referente ao objeto1, para verificar os valores

	}
}
