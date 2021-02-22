//Parametros são valores recebidos e diz respeito à aquilo que o método usará no processamento de informação.
//exp: tipo nome(tipo parametro1; tipo parametro2){
//	corpo();
//};
//
//Para invocar, colocamos: nome(argumento1, argumento2)
//Parametros se referem à um nome de variável passada, com tipo, dentro da definição do método, enquanto os argumentos são os valores passados quando o método é INVOCADO
//Exemplo:
class Calculo{

	void soma(int num1, int num2){
		System.out.println(num1 + num2);

	}
}


public class Main{// Dentro de um arquivo java, só pode existir uma classe publica.

	public static void main(Strings args[]){
		Calculo cal = new Calculo();
		cal.soma(5, 25);
	}

}
