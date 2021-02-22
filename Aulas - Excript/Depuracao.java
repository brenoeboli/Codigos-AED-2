/*Depuração é, a monitoração do programa, acompanhando a execução do programa, e entender. É uma ótima técnica para debugar.*/

import java.util.Scanner;
public class Aula0012{
	public static void main(String[] args){

		double nota1, nota2, nota3, nota4;

		System.out.println("Digite a sua nota: ");
		nota1 = in.nextDouble();

		System.out.println("Digite a sua 2 nota: ");
		nota2 = in.nextDouble();

		System.out.println("Digite a sua 3 nota: ");
		nota3 = in.nextDouble();

		System.out.println("Digite a sua 4 nota: ");
		nota4 = in.nextDouble();

		double soma = nota1+nota2+nota3+nota4;

		soma = soma/4;

		System.out.println("A sua media eh: "+soma);

		if(soma >= 7){
			System.out.println( "Voce foi aprovado" );
		}
		else{
			System.out.println( "Voce foi reprovado");

		}

		
	}
}	
