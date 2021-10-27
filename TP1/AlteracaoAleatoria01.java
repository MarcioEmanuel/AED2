import java.util.Random;

class AlteracaoAleatoria01{

	public static boolean isFim(String s){
		return(s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
	}

	public static boolean igual(char s, char l1){
		if(s == l1){
			return true;
		}else{
			return false;
		}
	}

	public static String Alterar(String s){
	
		Random gerador = new Random();
		gerador.setSeed(4);
		StringBuilder alterada = new StringBuilder();
		char l1 = ((char)('a' + Math.abs(gerador.nextInt()) % 26));
		char l2 = ((char)('a' + Math.abs(gerador.nextInt()) % 26));

		for(int i = 0; i < s.length(); i++){
			if(igual(s.charAt(i), l1) == true){
				alterada.append((char)l2);
			}else{
				alterada.append((char)s.charAt(i));
			}
		}
		return alterada.toString();
	}

	public static void main(String[] args){
		
		String[] palavras = new String[3000];
		int cont = 0;

		do{	
			palavras[cont] = MyIO.readLine();

		}while(isFim(palavras[cont++]) == false);
		cont--;

		for(int i = 0; i < cont; i++){
		
			MyIO.println((Alterar(palavras[i])));
		}
	}

}
