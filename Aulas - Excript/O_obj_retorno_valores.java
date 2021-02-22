//Retornando valores através das funções
//Usamos o return para retornar o valor desejado, então se a funcão é do tipo int, então o retorno deve ser do tipo int também
//Return só é usado no final da função, pois depois do return toda a função eh parada.

class Retangulo{
	public int width, height;

	public int areaTotal(){
		return width*height;
	}
	public boolean isQuadrado(){
		if(width==height){
			return true;
		}
		return false;
	}

}
public class Main{

	public static void main(String args[]) {
			
		Retangulo quadrado = new Retangulo();
		quadrado.width = 100;
		quadrado.height = 120;

		System.out.println(quadrado.areaTotal);
		System.out.println(quadrado.isQuadrado);
	}

}
