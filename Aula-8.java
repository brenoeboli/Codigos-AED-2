import java.util.Scanner;

public class Aula0008{

	public static void main(String[] args){

		System.out.println("Informe a idade do seu cachorro: ");
		
		Scanner in = new Scanner(System.in);

		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro*7

		System.out.println("O seu cachorr "+idadeCachorro+"anos");

	}
}
