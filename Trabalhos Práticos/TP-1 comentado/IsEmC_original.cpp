#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int acha_tam_vetor(char vetor[]){//Função pra achar onde acabam as letras do vetor de caractere
	int i = 0;
	while(vetor[i] != '\0'){
		i++;
	}
	
	
	return i - 1;
}


int isNotFim(char vetor[]){//Função que verifica se a palavra de entrada é igual à FIM
	int resposta = 0;
	int tam = acha_tam_vetor(vetor);
	int count = 0;
	char fim[] = {'F', 'I', 'M'};
	if(tam == 3){
		for(int i = 0; i < (tam - 1); i++){
			if(vetor[i] == fim[i]){
				count++;
			}
		}

	}
	if(count == tam - 1){
		resposta = 1;
	}	
	
	return resposta;
}

void replaceAllEspacos(char vetor[]){//Função que modifica array  para não conter espaços, assim evitando erros de contagem de tamanho dos arrays
	int tam = acha_tam_vetor(vetor) - 1;
	for(int i = 0; i < tam; i++){
		if(vetor[i] == ' '){//Caso o valor na posição i seja vazio, ele será substituido pelo seu próximo
			vetor[i] = vetor[i+1]; 
		}
	}

}

int IsVogal(char vetor[]){
	int tam = acha_tam_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){//Como tam = length - 1, se length for igual à zero, tam seria negativo, então aqui tam deve ser positivo e diferente de zero, pois se o array contém um char, tam seria igual à zero e count, que inicialmente é zero seria igual à tam, assim passando resp para 1 sem nem verificar se realmente aquele caracter é uma vogal
		for(int i = 0; i < tam; i++){//Usando a mesma lógica em java para comparar valores do array com as vogais
			if(vetor[i] == 'a' || vetor[i] == 'e' || vetor[i] == 'i' || vetor[i] == 'o' || vetor[i] == 'u'){
				count++;	
			}				
		}
		
		if(count == tam){//Verficando se a string possui só vogais
			resp = 1;
		}
	}
	else if(tam == 0){//Caso tam seja igual à zero, significa que o array possui uma letra só, dispensando a necessidade de um loop e um contador
		if(vetor[0] == 'a' || vetor[0] == 'e' || vetor[0] == 'i' || vetor[0] == 'o' || vetor[0] == 'u'){
			resp = 1;
		}
	}

	return resp;//Retornando resp(1 é para true, 0 é para false)

}

int IsConsoante(char vetor[]){//Utilizando a mesma lógica de IsVogal, porém com comparaçoes entre consoantes agora
	int tam = acha_tam_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){
		for(int i = 0; i < tam; i++){
			if(vetor[i] == 'b' || vetor[i] == 'c' || vetor[i] == 'd' || vetor[i] == 'f' || vetor[i] == 'g'  || vetor[i] == 'h' || vetor[i] == 'j' || vetor[i] == 'k' || vetor[i] == 'l' || vetor[i] == 'm' || vetor[i] == 'n' || vetor[i] == 'p' || vetor[i] == 'q' || vetor[i] == 'r' || vetor[i] == 's' || vetor[i] == 't' || vetor[i] == 'v' || vetor[i] == 'x' || vetor[i] == 'y' || vetor[i] == 'z' || vetor[i] == 'w' ) {
				count++;	
			}
		}

		if(count == tam){
			resp = 1;
		}
	}
	else if(tam == 0){
			if(vetor[0] == 'b' || vetor[0] == 'c' || vetor[0] == 'd' || vetor[0] == 'f' || vetor[0] == 'g'  || vetor[0] == 'h' || vetor[0] == 'j' || vetor[0] == 'k' || vetor[0] == 'l' || vetor[0] == 'm' || vetor[0] == 'n' || vetor[0] == 'p' || vetor[0] == 'q' || vetor[0] == 'r' || vetor[0] == 's' || vetor[0] == 't' || vetor[0] == 'v' || vetor[0] == 'x' || vetor[0] == 'y' || vetor[0] == 'z' || vetor[0] == 'w') {
				resp = 1;
			
			}
		}
	return resp;
}
	
	

	




int IsInteiro(char vetor[]){
	int tam = acha_tam_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){
		for(int i = 0; i < tam; i++){
			if((vetor[i] >= '0' && vetor[i] <='9') && (vetor[i] != '.' && vetor[i] != ',')){
				count++;
			}
		}
		if(count == tam){
			resp = 1;
		}
		
	}
	else if(tam == 0){
		if((vetor[0] >= '0' && vetor[0] <='9') && (vetor[0] != '.' && vetor[0] != ',')){
				resp = 1;
		}

	}

	return resp;
	
}	

int IsReal(char vetor[]){
	int tam = acha_tam_vetor(vetor) - 1;
	int resp = 0;
	int count = 0;
	if(tam > 0){
		for(int i = 0; i < tam; i++){
			if((vetor[i] >= '0' && vetor[i] <='9') && (vetor[i] != '.' && vetor[i] != ',')){
				count++;
			}
		}
		if(count == tam){
			resp = 1;
		}
		
	}
	else if(tam == 0){
		if((vetor[0] >= '0' && vetor[0] <='9') && (vetor[0] != '.' && vetor[0] != ',')){
				resp = 1;
		}

	}
	return resp;

}

int main(){
	char vetor[1000];
	char *ptr_vet = vetor;
	int i = 0;
	while( i < 1000){
		fgets(vetor, 1000, stdin);
		replaceAllEspacos(ptr_vet);
		if(isNotFim(vetor) == 1){
			return 0;
		}
		else{
			if(IsVogal(ptr_vet) == 1){
				printf("SIM ");
			}
			else{ 
				printf("NAO ");
			}
			if(IsConsoante(ptr_vet) == 1){
				printf("SIM ");

			}
			else{
				printf("NAO ");
			}
			if(IsInteiro(ptr_vet) == 1){
				printf("SIM ");
			}
			else{
				printf("NAO ");
			}
			if(IsReal(ptr_vet) == 1){
				printf("SIM ");
			}
			else{
				printf("NAO");
			}
			printf("\n");

		}
		
	}

}


			

