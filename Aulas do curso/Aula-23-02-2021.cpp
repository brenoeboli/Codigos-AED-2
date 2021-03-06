#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int retorna_palindromo(char palavras[]){
	int count = 0;
	int resp = 0;
	int tamanho_palavras = (strlen(palavras)-2);

	for(int i = 0; i < tamanho_palavras; i++){
		
		if(palavras[i] == palavras[tamanho_palavras - i]){
			count++;
		}
		
	}
	if(count == tamanho_palavras){
		resp = 1;	
	}
	return resp;

}

int main(){
	char palavras[1000];
	char parada[] = {'F', 'I', 'M'};
	int i = 0;
	int paradouro = 1;
	while(i < 1000 && paradouro == 1){
		int counter = 0;
		fgets(palavras,1000, stdin);
		int tam = strlen(palavras);
			
		for(int i = 0; i < 3; i++){
			if(palavras[i] == parada[i]){
				counter++;				
			}
		}

		
		if(counter == 3){
			return 0;
		}
		else{
			
			int retorno = retorna_palindromo(palavras);
			
			if(retorno == 1){
				printf("SIM\n");
			}
			else{
				printf("NAO\n");
			}

		}
		i++;
	}


}
