//ATRIBUTOS DE CLASSES - COMO DEFINIR VARIAVEIS DENTRO DA CLASSE(Caracteristica do objeto)
// [modificador] [tipo] nome = [valor]; -> definicao de um atributo


class Mobile{
	
	public boolean ligado;
	private boolean displayLigado;//Propiedade de encapsulamento
	int volume = 0;

	

}

public class Main {

	public static void main(String[] args){
		
		Mobile mobile; //Definindo um objeto do tipo Mobile
		mobile = (new Mobile()); //Instanciando o mobile, java cria uma instancia mobile e atribui a variavel mobile, do tipo Mobile
		mobile.volume = 5; //Variavel publica
		mobile.ligado = true;

	}
}


