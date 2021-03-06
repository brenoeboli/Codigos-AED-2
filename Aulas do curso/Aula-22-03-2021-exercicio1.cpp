#include <iostream>

//Quantas movimentações entre elementos do array são realizadas ?

int main(){
	int conta_movimentacao;	
	for(int i = 0; i < (n-1); i++){
		int menor = i;

		for(int j = (i+1); j < n; j++){
			
			if(array[menor] > array[j]){
				menor = j;

			}
			
		}
		swap(menor, i);
		conta_movimentacao++;
	
		
	}


}

//São realizadas M(n) = 3(n-1) movimentações
//Estudar o algorítmo de seleção !!!
//Vídeo para ver de quarta para semana q vem, segunda
