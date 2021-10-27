import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

class Classe{
	
	public static boolean isFim(String fim){
		return(fim.length() >= 3 && fim.charAt(0) == 'F' && fim.charAt(1) == 'I' && fim.charAt(2) == 'M');
	}


	public static class Jogador{
	

		private int id;
		private String nome ;
		private int altura;
		private int peso;
		private String universidade;
		private int anoNascimento;
		private String cidadeNascimento;
		private String estadoNascimento;

		private Clone(){
			this.idClone = id;
			this.nomeClone = nome;
			this.alturaClone = altura;
			this.pesoClone = peso;
			this.universidadeClune = universidade;
			this.anoNascimentoClone = anoNascimento;
			this.cidadeNascimentoClone = cidadeNascimento;
			this.estadoNascimentoClone = estadoNascimento;
		}
	
		public void setId(int i){
			id = i;
		}
		
		public int getId(){
			return this.id;
		}

		public void setNome(String n){
			nome = n;
		}

		public String getNome(){
			return this.nome; 
		}

		public void setAltura(int a){
			altura = a;
		}

		public int getAltura(){
			return this.altura;
		}

		public void setPeso(int p){
			peso = p;
		}

		public int getPeso(){
			return this.peso;
		}

		public void setUniversidade(String uni){
			universidade = uni;
		}

		public String getUniversidade(){
			return this.universidade;
		}

		public void setAnoNascimento(int ano){
			anoNascimento = ano;
		}

		public int getAnoNascimento(){
			return this.anoNascimento;
		}

		public void setCidadeNascimento(String c){
			cidadeNascimento = c;
		}

		public String getCidadeNascimento(){
			return this.cidadeNascimento;
		}

		public void setEstadoNascimento(String est){
			estadoNascimento = est;
		}

		public String getEstadoNascimento(){
			return this.estadoNascimento;
		}
		

	}

	public static Jogador leitura(String s) throws IOException{

		Jogador j = new Jogador();
		String[] separado = new String[4000];
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Marcio Emanuel\\Desktop\\AED2.2\\TP2\\players.csv"));
		String lido = "";
		String lidoBR = "";
		int controle = 0;
		String aux[] = s.split(":");
		int valor = Integer.parseInt(aux[0]);
		
		while(controle <= valor + 1){
		lidoBR = br.readLine();
		lido = lidoBR.replace(",,", ",nao informado,");
		if(lido.charAt(lido.length() - 1) == ','){
			lido += "nao informado";
		}
		separado = lido.split(",");

		
		if(lidoBR == "null"){
			controle = valor+2;

		}else if(controle == valor+1){

			j.setId(Integer.parseInt(separado[0]));

			j.setNome(separado[1]);

			j.setAltura(Integer.parseInt(separado[2]));

			j.setPeso(Integer.parseInt(separado[3]));

			j.setUniversidade(separado[4]);

			j.setAnoNascimento(Integer.parseInt(separado[5]));

			j.setCidadeNascimento(separado[6]);

			j.setEstadoNascimento(separado[7]);
		
			controle = valor+2;
		}

		controle++;

		}


		br.close();
		return j;
	}

	public static void imprimir(Jogador jogador) {

		MyIO.println("[" + jogador.getId() + " ## " + jogador.getNome() + " ## " + jogador.getAltura() + " ## " + jogador.getPeso() + " ## " + jogador.getAnoNascimento() + " ## " + jogador.getUniversidade() +  " ## " + jogador.getCidadeNascimento() + " ## " + jogador.getEstadoNascimento() + "]");

	}


	public static void main(String[] args) throws IOException{
		
	String[] id = new String[2048];
	String[] nome = new String[2048];
	int cont = 0;
	int cont2 = 0;
	Jogador j[] = new Jogador[3922];

	do{
	
		id[cont] = MyIO.readLine();

	}while(isFim(id[cont++]) == false);
	cont--;

	do{
	
		nome[cont2] = MyIO.readLine();

	}while(isFim(nome[cont2++]) == false);
	cont2--;

	for(int i = 0; i < cont; i++){

		j[i] = leitura(id[i]);

	}


	long tempo1 = System.currentTimeMillis();

	int comp = 0;

	for(int i = 0; i < cont2; i++){
		int sim = 0;

		for(int y = 0; y < cont ; y++){
			comp++;
			if(nome[i].equals(j[y].getNome())){
				sim++;
				y = cont + 1;
			}
		}
		comp++;
		if(sim > 0){
			MyIO.println("SIM");
		}else{
			MyIO.println("NAO");
		}
		//imprimir(j[i]);
		

	}

	long tempo2 = System.currentTimeMillis();

	try {
		FileWriter arq = new FileWriter("C:\\Users\\Marcio Emanuel\\Desktop\\AED2.2\\TP2\\matricula_sequencial.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.print("686391\t" + (tempo2 - tempo1) + "\t" + comp);
		gravarArq.close();
	} catch (Exception e) {
		MyIO.println(e.getMessage());
	}
}
}

