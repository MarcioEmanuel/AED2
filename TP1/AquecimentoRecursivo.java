import Java.util.Scanner;

public class AquecimentoRecursivo{

	public static boolean Maiuscula(char c){
		return (c >= 'A' && c <= 'Z');
	}

	public static boolean isFim(String palavra){
		return (palavra.length()>=3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M');
	}

	public static int isMaiuscula(int qtdMaiuscula, int index, String palavra){

		if(index < palavra.length()){
			if(Maiuscula(palavra.charAt(index)) == true){
				qtdMaiuscula = qtdMaiuscula + 1;
				return isMaiuscula(qtdMaiuscula, index + 1, palavra);
			}else{
				return isMaiuscula(qtdMaiuscula, index + 1, palavra);
			}
		}
		return qtdMaiuscula;
	}
	

	public static void main(String[] args){
		String[] palavras = new String[1000];
		int numPalavras = 0;

	//Ler entrada de dados
		do{
		palavras[numPalavras] = MyIO.readLine();
		}while(isFim(palavras[numPalavras++]) == false);
	numPalavras--;
	//Chamar a Funçao recursiva
		for(int i = 0; i < numPalavras; i++){
			MyIO.println(isMaiuscula(0, 0, palavras[i]));
		}
	}
}
