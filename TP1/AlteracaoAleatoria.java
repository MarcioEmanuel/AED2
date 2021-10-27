import java.util.Random;

class AlteracaoAleatoria{

	public static boolean isFim(String s){
		return(s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
	}

	public static String Alterar(String s, char l1, char l2){
	
		for(int i = 0; i < s.length(); i++){
			
			s = s.replace(l1, l2);
			
		}
		return s;
	}

	public static void main(String[] args){
		
		String[] palavras = new String[3000];
		int cont = 0;

		do{	
			palavras[cont] = MyIO.readLine();

		}while(isFim(palavras[cont++]) == false);
		cont--;
		Random gerador = new Random();
		gerador.setSeed(4);

		for(int i = 0; i < cont; i++){
			char l1 = ((char)('a' + Math.abs(gerador.nextInt()) % 26));
			char l2 = ((char)('a' + Math.abs(gerador.nextInt()) % 26));
			MyIO.println(Alterar(palavras[i], l1, l2));
		}
	}

}
