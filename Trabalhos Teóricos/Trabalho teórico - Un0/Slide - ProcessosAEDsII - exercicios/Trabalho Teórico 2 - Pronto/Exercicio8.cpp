#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
	int idades[3];
	int parada = 0;
	
	while(parada == 0){
		scanf("%d", &idades[0]);
		if(idades[0] == 0){
			parada = 1;
		}
		else{
			scanf("%d %d", &idades[1], &idades[2]);
			int soma_filhos = idades[1]+idades[2];
			if(idades[0] >= soma_filhos){
				printf("%d\n", (idades[0] - soma_filhos));
			}
			else{
				parada = 1;
			}
		}

	}

}
