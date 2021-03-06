#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int retorna_palindromo(char palavras[]){//Como o C++ não tem variáveis do tipo boolean, criei uma função do tipo inteira com a lógica abaixo descrita
	int count = 0;//Contador que conta as palavras iguais às suas posições de trás pra frente (tam - i)
	int resp = 0;//Criando a variavel que será retornada, sendo um para verdadeiro e zero para falso.
	int tamanho_palavras = (strlen(palavras)-2); //Definindo o tamanho do array de char, começando de zero.

	for(int i = 0; i < tamanho_palavras; i++){//Percorrendo o array
		
		if(palavras[i] == palavras[tamanho_palavras - i]){
			count++;
		}
		
	}
	if(count == tamanho_palavras){// Caso todas as letras nas posições i sejam iguais às letras nas posições tam - i, então a palavra é um palíndromo
		resp = 1;	
	}
	return resp;//Retornando verdadeiro(um) ou falso(zero) para se o array é ou não um palíndromo

}

int main(){
	char palavras[1000];//Como no C++ os arrays tem de ser inicializados com tamanhos definidos, por orientação do professor foi colocado um limite de no máximo 1000 caracteres.
	char parada[] = {'F', 'I', 'M'};
	int i = 0;
	int paradouro = 1;
	while(i < 1000 && paradouro == 1){//Criando uma condição onde o loop para sozinho caso o contador exceda o limite permitido de caracteres no array, ou caso a palavra digitada seja igual à palavra armazenada pelo array parada[].
		int counter = 0;
		fgets(palavras,1000, stdin);//Pegando a palavra do pub.in, pela entrada padrão.
		int tam = strlen(palavras);
			
		for(int i = 0; i < 3; i++){
			if(palavras[i] == parada[i]){
				counter++;//Como não existe uma função específica para comparação de arrays de char, utilizei um contador, onde caso a posição i no array da palavra digitada seja igual à posição i do array parada, o contador é iterado.				
			}
		}

		
		if(counter == 3){//Caso o contador seja igual à três, então a palavra digitada é igual à FIM e o programa para.
			return 0;
		}
		else{//Caso o contador não seja igual:
			
			int retorno = retorna_palindromo(palavras);//Variável inteira recebe o retorno da função retorna_palindromo
			
			if(retorno == 1){
				printf("SIM\n");
			}
			else{
				printf("NAO\n");
			}

		}
		i++;//Iterando o contador do while para que não seja excedido o limite de posiçoes do array palavras.
	}


}
