import java.util.Scanner;

public class Aula0015{

	public static void main(String[] args){
		
		/*Constante
		 * caracteristicas: 1 - Os dados nunca serao alterados
		 * 		    2 - O acesso ao endereco de memoria eh protegido
		 * 		    3 - uma const. nunca sera desalocada
		 * 		    4 - Eh declarada uma vez e usamos quantas vezes necessario
		 *
		 *
		int vari = 10 Declara a variave/
		final int constante = 10;Declara uma constante, com o uso da palavra final
		
		Fazendo um programa para determinar a distancia que o som vai percorrer em um determinado espaco de tempo*/

		final double velocidade_som = 340.28/*m/s*/
		
		System.out.println("Digite o tempo que demora para o som ser ouvido" );

		Scanner in = new Scanner(System.in);/*Cria uma nova variavel do tipo scanner, chamada in*/

		int tempo  = in.nextInt();/*in.nexInt se refere a variavel lida do teclado, e in eh um objeto do tipo
		Scanner*/

		System.out.println("A distancia eh de: "+ tempo * velocidade_som +"metros percorridos");
		

		
		
		if(!(in<=0)){


			
	}
}
