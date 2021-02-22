#include <iostream>
using namespace std;
void retorna_verdade(String palavra){
	char *ch_prt = (char*) calloc(str.length+1, sizeof(char*));
	strcpy(ch_prt, palavra.c_str());
	cout<<ch_prt;
	return 1;
};

int main(void){
	String palavra;
	cout<<"Digite uma palavra";
	cin>>palavra;
	retorna_verdade(palavra);
	//String termino = "FIM";
	/*while(palavra != termino){
		
	}*/
	return 0;
};

