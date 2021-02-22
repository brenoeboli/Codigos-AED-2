/*Foreach(para cada) -> Um laço for para cada elemento da lista.
 * sintaxe: for(<variavel>:<array>)
 * exp: for(int item: lista) -> A cada ciclo será passado um elemento contido no array
 * exp-2: int[] lista = new int[2];]
 * 	lista[0] = 10;
 * 	lista[1] = 20;
 * 	lista[2] = 30;
 * 	foreach(int item : lista)
 * 	Primeiro ciclo: item APONTA para 10;
 * 	Segundo ciclo: item APONTA para 20;
 * 	Terceiro ciclo: item APONTA para 30;
 */

public class Aula{
	public static void main(String[] args){
		int[] nums = new int[10];
		nums[0] = 125;
		nums[1] = 5482;
		nums[2] = 45;
		nums[3] = 457;
		nums[4] = 887;
		nums[5] = 1;
		nums[6] = 4087;
		nums[7] = 1287;
		nums[8] = 5456;
		nums[9] = 789841;
		
		int media = 0;
		/*Achando a média dos valores*/
		for(int item : nums){
			media+=item;
			
		}
		
		media = (float)media/nums.length;/*.length retorna o tamanho de nums*/
		
		
		System.out.println("A média aritmética é: "+media);

		/*Achando o menor valor dentre os passados*/
		int menor = 0;
		for(int item : nums){
			
			if(item < menor || menor==0){
				menor = item;
			}
			
			System.out.println("O menor valor da lista eh: "+menor);

		}
	
}

