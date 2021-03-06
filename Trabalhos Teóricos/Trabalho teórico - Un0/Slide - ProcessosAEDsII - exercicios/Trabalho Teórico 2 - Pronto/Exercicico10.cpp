#include <stdio.h>
#include <stdlib.h>
int main(){

	int ultimo_ano = 1986;
	int parada = 0;
	while(parada == 0){
		int ano_atual;
		scanf("%d", &ano_atual);
		if(ano_atual == 0){
			parada = 1;
		}
		else{
			
			int contador = 0;
			int soma_anos = ultimo_ano;
			while(soma_anos <= ano_atual){
				soma_anos += 76;
				contador++;
			}
			int resultado = ultimo_ano + (contador*76);
			printf("%d\n", resultado);

		}	
	

	}


}
