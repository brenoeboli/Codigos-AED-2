//Instancia
//A variável em que o objeto é instanciado vira um ponteiro, apontando para o local de memória do objeto
class Retangulo{
	public int width, height;

	public int areaTotal(){
		return width * height;

	}
	public boolean isQuadrado(){
		if(width==height){
			return true;
		}
		return false;

	}

}

public class Main{

	public class static void main(String args[]){
		//Ao não ser inicializada a variavel com uma instancia, o programa levanta uma nullPointerException, ou seja, a variavel é nula. A condição abaixo verifica se a variável foi inicializada corretamente.
		
		if(r1!=null){
			Retangulo r1 = new Retangulo();
			r1.isQuadrado();
		}
		else{
			System.out.println("Variavel não inicializada ");
		}

		
	}
