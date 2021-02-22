/* 
 * CHAR - 2bytes
 * boolean - 1byte
 * byte - 1byte
 * short - 2byte
 * int - 4byte
 * long - 8byte
 * float - 4byte
 * double - 8byte
 */

public class Aula0018{

	public static void main(String[] args){

		boolean b = true;
		char c = 'a';/*Char por padrao inicia vazio*/
		char c2 = '1';

		/*Por padrao o java atribui 0 a variavel.*/
		byte Byte = 100;//Um byte armazena 255 numeros
				//-128 ate +127
		//Por padrao a variavel eh zero
		//-32768 ateh +32767
		short camisa = 2000;
		

		//-2.147.483.648 ateh +2.147.486.647
		int i = 1;

		long l;

		float f = 4.3f;
		//parecido com o double, a diferenca esta na capacidade de armazenamento e na instancia, para colocar
		//um numero com ponto flutuante em float, especificamos o valor, e depois colocamos f depois do numero
		//Ja o double nao precisa disto, porem ocupa mais armazenamento.


