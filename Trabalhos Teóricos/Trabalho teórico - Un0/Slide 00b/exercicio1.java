
import java.util.Scanner; //Importando a classe Scanner do pacote util.

public class exercicio1 {//Criando a classe que definira objetos do tipo exercicio1



	public static boolean verifica_array(int[] array, int x){//Função que verifica valor por valor, comparando se o mesmo é igual ao valor digitado, caso seja, o loop para e retorna true.
		
		Scanner ler = new Scanner(System.in);
		
		int tam = array.length;

		boolean bool = false;
		for(int j = 0;j < tam; j++){
			System.out.println("Digite o valor de array["+j+"]");
			array[j] = ler.nextInt();
		}
		outerloop:
		for(int i = 0; i < tam; i++ ){
			if(array[i] == x){
				bool = true;
				break outerloop;
			}
		}
		return bool;
	
	}


	public static void main(String[] args){

		Scanner leia = new Scanner(System.in);// Criando um novo objeto do tipo Scanner.
		
		System.out.println("Digite o valor a ser verificado");
		
		int x = leia.nextInt();//Lendo do teclado o valor a ser verificado pela função verifica_array
		
		System.out.println("Digite o tamanho do array");
		
		int tam = leia.nextInt();
		
		int[] array = new int[tam];
		
		exercicio1 obj1 = new exercicio1();//Criando um novo objeto do tipo exercicio1, denominado "obj1"
		
		boolean bool;

		bool = obj1.verifica_array(array, x);//A variavel bool criada acima, do tipo boolean, recebe o retorno da função "verifica_array", invocada a partir do objeto obj1.

		System.out.println(bool);

		if(bool == true){
			System.out.println("O número "+x+" esta contido no array");
		}
		else{
			System.out.println("numero nao encontrado no array");
		}

	}


}

