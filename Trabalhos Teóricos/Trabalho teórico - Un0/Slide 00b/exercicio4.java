import java.util.Scanner;//importando a classe Scanner do pacote util do java

public class exercicio4{
	public static boolean verifica_par(int tam){//Funçãp que verifica se o tamanho do array eh par ou impar
		boolean bool = false;
		if(tam%2 == 0){
			bool = true;
		}
		return bool;
	}
	public static void mostra_maior_menor_par(int[] array){//As funções serão separadas em dois grupos, inicialmente, arrays de tamanho par e arrays de tamanho ímpar. Esta função sera usada apenas paraa arrays de tamanho par.
		int tam = array.length;
		int grupo = tam/2;
		int[] esq = new int[grupo];
		int[] dir = new int[grupo];
		int esq_soma = 0;
		int dir_soma = 0;
		int maior = 0;
		int menor = array[tam-1];
		for(int i = 0; i < grupo; i++){//O array passado para a função é separado em dois grupos, esquerda, para os valores menor ou igual ao do meio, e esquerda para os valores maiores que o do meio.
			
			esq[i] = array[i];//Armazena os valores do grupo da esquerda
			esq_soma += esq[i];//Armazena a soma dos valores do grupo da esquerda
			dir[i] = array[i + grupo];//Armazena os valores do grupo da direita
			dir_soma += dir[i];//Armazena a soma dos valores do grupo da direita.


			
		}
		
		esq_soma = esq_soma/grupo;//Tirando a media dos valores pertencentes ao grupo da esquerda.
		dir_soma = dir_soma/grupo;//Tirando a media dos valores pertencentes ao grupo da direita.

		if(esq_soma > dir_soma || esq_soma == dir_soma){//Aqui, a primeira e a segunda possibilidade sao consideradas, ou seja, se a media da soma do grupo da esquerda for maior que a media do grupo da direita, entao o maior valor esta no grupo da esquerda e o menor valor no grupo da direita. Caso as medias se igualem, os numeros, mesmo que mudem de ordem, serao iguais nos dois grupos, entao, a analise de qualquer um dos grupos para menor e maior estara correta. Ja que a quantidade de valores inteiros pertencente nos dois grupos será a mesma.			

			for(int i = 0; i < grupo;i++){//Procurando a maior no grupo da esquerda
				
				if(esq[i] > maior){
					maior = esq[i];
				}


			}
			
			for(int i = 0; i < grupo; i++){//Procurando a menor no grupo da direita
				
				if(dir[i] < menor){
					menor = dir[i];
				}
					
			}	
			
		
		}
		
		else{//Caso a media da esquerda seja menor que a da direita, então, como os grupos contem o mesmo numero de variaveis, a maior deverá se encontrar na direita e a menor na esquerda.

			for(int i = 0; i < grupo; i++){//Procurando o maior valor no grupo da direita
				
					if(maior < dir[i]){
						maior = dir[i];
					}


				}

			for(int i = 0; i < grupo; i++){//Procurando o menor valor no grupo da esquerda

				if(menor > esq[i]){
					menor = esq[i];
				}

			}


		}

		System.out.println("O maior valor eh: "+maior);
		System.out.println("O menor valor eh: "+menor);

		
	}

	public static void mostra_maior_menor_impar(int[] array){//Caso o tamanho do array seja impar, esta função sera utilizada para realizar a separação de forma diferente
		int tam = array.length;
		int grupo = tam/2;
		int[] dir = new int[grupo];
		int[] esq = new int[grupo];
		int meio = array[grupo];//Uma variavel, na verdade um grupo, foi adicionado, para separar os grupos de valores como esquerda, meio e direita.
		int esq_soma = 0;
		int dir_soma = 0;

		for(int i = 0; i < grupo; i++){
			esq[i] = array[i];//Separando os valores do grupo da esquerda, ou seja, menor que do meio.
			esq_soma += esq[i];//Somando os valores do grupo da esquerda.
			dir[i] = array[(grupo+i)+1];//Separando os valores da direita, excluindo o do meio, que são maiores que o do meio
			dir_soma += dir[i];//Somando os valores do grupo da direita
		}

		dir_soma = dir_soma/grupo; //Tirando a media do grupo da direita
		esq_soma = esq_soma/grupo;//Tirando a media do grupo da esquerda
		int maior = 0;
		int menor = array[tam-1];
		if(meio > dir_soma && meio>esq_soma){
			maior = meio;//Considerando a melhor possibilidade que eh de o maior numero estar no meio, então o programa só procura o menor
			if(dir_soma > esq_soma){//Caso a media do grupo da direita seja maior, então o menor numero devera estar no grupo da esquerda
				for(int i = 0; i < grupo; i++){
					
					if(menor > esq[i]){
						
						menor = esq[i];

					}
				}
				
				System.out.println("O maior valor eh: "+maior);
				System.out.println("O menor valor eh: "+menor);
				System.exit(1);//Parando o programa, pois os dois valores já foram encontrados e mostrados ao usuário, assim nenhuma condição desnecessária é verificada
			}

			else{//Considerando agora, que o menor esteja no grupo da direita
				
				for(int j = 0; j < grupo; j++){
					
					if(menor > dir[j]){
					
						menor = dir[j];

					}
				
				}
			
				System.out.println("O maior valor eh: "+maior);
				System.out.println("O menor valor eh: "+menor);
				System.exit(1);//parando o programa para não rodar condições desnecessárias, já que os valores já foram encontrados e mostrados.
			}
		

		}
		else if(meio < dir_soma && meio < esq_soma){
			menor = meio;//Considerando a melhor possibilidade do menor valor estar no meio, então o programa só procura o maior valor
			if(dir_soma > esq_soma){//Considerando que o maior valor esta na direita, ja que a media do grupo da direita seria maior que a do grupo da esquerda
				for(int i = 0; i < grupo; i++){
				
					if(maior < dir[i]){
						maior = dir[i];
					}
				
				}
				System.out.println("O maior valor eh: "+maior);
				System.out.println("O menor valor eh: "+menor);
				System.exit(1);
			}
			else{//Considerando que o maior valor agora, esta no grupo da esquerda
				
				for(int i = 0; i < grupo; i++){
					
					if(maior < esq[i]){
						maior = esq[i];

					}

				}
				System.out.println("O maior valor eh: "+maior);
				System.out.println("O menor valor eh: "+menor);
				System.exit(1);
			}


		}
		else if(dir_soma > esq_soma){//Considerando que o maior esteja no grupo da direita e o menor no grupo da esquerda, ja que a possibilidade dos dois estarem no meio foram excluidas
			for(int i = 0; i < grupo; i++){//Procurando o maior valor no grupo da direita
				
				if(maior < dir[i]){
					maior = dir[i];
				}

                           
			}

			for(int i = 0; i < grupo; i++){//Procurando o menor valor no grupo da esquerda

				if(menor > esq[i]){
					menor = esq[i];
				}

			}		

		
		}
		else if(esq_soma > dir_soma){//Considerando que o maior valor esteja no grupo da esquerda e o maior no grupo da direita, ja que a possibilidade dos dois estarem no meio foram excluidas
			for(int i = 0; i < grupo;i++){//Procurando a maior no grupo da esquerda
				
				if(esq[i] > maior){
					maior = esq[i];
				}


			}
			
			for(int i = 0; i < grupo; i++){//Procurando a menor no grupo da direita
				
				if(dir[i] < menor){
					menor = dir[i];
				}
					
			}	
			
			

		}
		
		System.out.println("O maior valor eh: "+maior);
		System.out.println("O menor valor eh: "+menor);
		System.exit(1);
	}

	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o numero do seu array: ");
		int tam = leia.nextInt();
		int[] array = new int[tam];
		exercicio4 objeto1 = new exercicio4();//Cria um objeto do tipo exercicio4
		boolean bool = objeto1.verifica_par(tam);
		for(int i = 0; i < tam; i++){
			
			System.out.println("Digite um valor para array["+i+"]");
			array[i] = leia.nextInt();		
			
		}
		if(bool==true){
			objeto1.mostra_maior_menor_par(array);
		}
		else{
			objeto1.mostra_maior_menor_impar(array);
		}

	}

		
}
