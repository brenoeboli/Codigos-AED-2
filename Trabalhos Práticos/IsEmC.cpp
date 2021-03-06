#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int acha_tamanho_vetor(char vetor[]){
	int i = 0;
	while(vetor[i] != '\n'){
		i++;
	}
	
	return i;
}


int isNotFim(char vetor[]){
	int resposta = 1;
	int tam = acha_tamanho_vetor(vetor) - 1;
	int count = 0;
	char fim[] = {'F', 'I', 'M'};
	if(tam == 3){
		
		for(int i = 0; i < tam; i++){
			if(vetor[i] == fim[i]){
				count++;
			}
		}

	}
	if(count == 3){
		resposta = 0;
	}	
	
	return resposta;
}

char * replaceAllEspacos(char *vetor[]){
	int tam = acha_tamanho_vetor(vetor) - 1;
	for(int i = 0; i < tam; i++){
		if(vetor[i] == ' '){
			vetor[i] = vetor[i+1]; 
		}
	}
	return vetor;
}

int IsVogal(char vetor[]){
	int tam = acha_tamanho_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){
		for(int i = 0; i < tam; i++){
			if(vetor[i] == 'a' || vetor[i] == 'e' || vetor[i] == 'i' || vetor[i] == 'o' || vetor[i] == 'u'){
				count++;	
			}				
		}
		
		if(count == tam){
			resp = 1;
		}
	}
	else if(tam == 0){
		if(vetor[i] == 'a' || vetor[i] == 'e' || vetor[i] == 'i' || vetor[i] == 'o' || vetor[i] == 'u'){
			resp = 1;
		}
	}

	return resp;

}

int IsConsoante(char[] vetor){
	int tam = acha_tam_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){
		for(int i = 0; i < tam; i++){
			if(vetor[i] == 'a' || vetor[i] == 'e' || vetor[i] == 'i' || vetor[i] == 'o' || vetor[i] == 'u'){
				count++;	
			}
		}

		if(count == tam){
			resp = 1;
		}
	}
	else if(tam == 0){
		
	}
}


			

