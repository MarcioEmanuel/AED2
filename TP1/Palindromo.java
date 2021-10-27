public class Palindromo {
	
	public static boolean isFim(String palavra){
	
		return(palavra.length() >= 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2)== 'M');
	}


	public static boolean palindromo(String p){
	
		String palindromo = "";

		for(int i = (p.length() - 1); i >= 0; i--){
			palindromo = palindromo + p.charAt(i);
		}

		if(palindromo.equals(p.toLowerCase())){
			return true;
		}else{
			return false;
		}
	}


	public static void main (String[] args){
	
		String[] palavras = new String[10000];
		int qtd = 0;

		do{
		palavras[qtd] = MyIO.readLine();
		
		}while(isFim(palavras[qtd++]) == false);
		qtd--;

		for(int i = 0; i < qtd; i++){
			if(palindromo(palavras[i]) == true){
			MyIO.println("SIM");
			}else{
			MyIO.println("NAO");
			}
		}
	}

}
