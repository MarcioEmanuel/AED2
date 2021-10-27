public class PalindromoRecursivo {

//Metodo FIM
	public static boolean isFim(String palavra){
	
		return(palavra.length() >= 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2)== 'M');
	}

//Metodo Recursivo para concatenar os caracteres na ordem inversa
	public static String palavra(String p, int tamanho, String palindromo){
	

		if(tamanho >= 0){
			palindromo = palindromo + p.charAt(tamanho);
			return palavra(p, tamanho - 1, palindromo);
		
		}else{

			return palindromo;

		}
	}
//Metodo que recebe a string originas e sua copia inversa e verifica se é um palindromo.
	public static boolean isPalindromo(String p, String p1){
		p.toLowerCase();
		if(p.equals(p1.toLowerCase())){
			return true;
		}else{
			return false;
		}
	}

//Main
	public static void main (String[] args){
	
		String[] palavras = new String[10000];
		int qtd = 0;
		String aux;
		String aux2 = "";
//Entrada de dados
		do{
		palavras[qtd] = MyIO.readLine();
		}while(isFim(palavras[qtd++]) == false);
		qtd--;
//Chamada dos metodos
		for(int i = 0; i < qtd; i++){
			aux = palavra(palavras[i], palavras[i].length() - 1, aux2);

			if(isPalindromo(aux, palavras[i]) == true){
			MyIO.println("SIM");
			}else{
			MyIO.println("NAO");
			}
		}
	}

}