import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Personagens {

    public static boolean isFim(String s) {
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public class Personagem {
        private String nome;
        private int idade;
        private int altura;
        private double peso;
        private String corDoCabelo;
        private String corDaPele;
        private String corDosOlhos;
        private String anoDoNascimento;
        private String genero;
        private String homeWord;

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return this.idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getAltura() {
            return this.altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public double getPeso() {
            return this.peso;
        }

        public void setPeso(double peso) {
            this.nome = peso;
        }

        public String getCorDoCabelo() {
            return this.corDoCabelo;
        }

        public void setCorDoCabelo(String corDoCabelo) {
            this.corDoCabelo = corDoCabelo;
        }

        public String getCorDaPele() {
            return this.corDaPele;
        }

        public void setCorDaPele(String corDaPele) {
            this.corDaPele = corDaPele;
        }

        public String getCorDosOlhos() {
            return this.corDosOlhos;
        }

        public void setCorDosOlhos(String corDosOlhos) {
            this.corDosOlhos = corDosOlhos;
        }

        public String getAnoDoNascimento() {
            return this.anoDoNascimento;
        }

        public void setAnoDeNascimento(String anoDoNascimento) {
            this.anoDoNascimento = anoDoNascimento;
        }

        public String getGenero() {
            return this.genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getHomeWord() {
            return this.homeWord;
        }

        public void setHomeWord(String homeWord) {
            this.homeWord = homeWord;
        }
    }

    /*protected Personagem clone() {
        Personage novo = new Perssonagem();
        novo.nome = this.nome;
        novo.altura = this.altura;
        novo.corDoCabelo = this.corDoCabelo;
        novo.corDaPele = this.corDaPele;
        novo.corDosOlhos = this.corDosOlhos;
        novo.anoNascimento = this.anoNascimento;
        novo.genero = this.genero;
        novo.homeworld = this.homeworld;
        return novo;
    }*/

    public static void leitura(String s) {

        try {
            FileReader ler = new FileReader(s);
            BufferedReader buffer = new BufferedReader(ler);
            String arq = "";
            String linha = buffer.readLine();
            while (linha != null) {
                arq += linha;
                linha = buffer.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        buffer.close();
        ler.close();

        Personagem p1 = new Personagem();
        String saida;

        saida = arq.substring(arq.indexOf("name") + 8);
        saida = saida.substring(saida.indexOf("',"));
        p1.setNome = saida;

        saida = arq.substring(arq.indexOf("height") + 10);
        saida = saida.substring(arq.indexOf("',"));
        if (saida.equals("unknown")) {
            p1.altura = 0;
        } else {
            p1.altura = Integer.parseInt(saida);
        }

        saida = arq.substring(arq.indexOf("mass") + 8);
        saida = saida.substring(arq.indexOf("',"));
        if (saida.equals("unknown")) {
            p1.setPeso = 0;
        } else {
            p1.setPeso = Integer.parseDouble(saida.replace(",", ""));
        }

        saida = arq.substring(arq.indexOf("hair_color") + 14);
        saida = saida.substring(saida.indexOf("',"));
        p1.setCorDoCabelo = saida;

        saida = arq.substring(arq.indexOf("skin_color") + 14);
        saida = saida.substring(saida.indexOf("',"));
        p1.setCorDaPele = saida;

        saida = arq.substring(arq.indexOf("eye_color") + 13);
        saida = saida.substring(saida.indexOf("',"));
        p1.setCorDosOlhos = saida;

        saida = arq.substring(arq.indexOf("birth_year") + 14);
        saida = saida.substring(saida.indexOf("',"));
        p1.setAnoDoNascimento = saida;

        saida = arq.substring(arq.indexOf("gender") + 10);
        saida = saida.substring(saida.indexOf("',"));
        p1.setGenero = saida;

        saida = arq.substring(arq.indexOf("homeworld") + 13);
        saida = saida.substring(saida.indexOf("',"));
        p1.setHomeWord = saida;

    }

    public static String isString() {
        DecimalFormat df = new DecimalFormat("#0.##");
        String resp = " ## " + p1.getNome + " ## " + p1.getAltura + " ## ";
        resp += df.format(p1.getPeso) + " ## " + p1.getCorDoCabelo + " ## ";
        resp += p1.getCorDaPele + " ## " + p1.getCorDosOlhos + " ## ";
        resp += p1.getAnoDoNascimento + " ## " + p1.getGenero + " ## ";
        resp += p1.getHomeWord + " ## ";
        return resp;
    }

    public static void main(String[] args) {

        String[] entrada = new String[2048];
        int cont = 0;
        do {

            entrada[cont] = MyIO.readLine();

        } while (isFim(entrada[cont++]) == false);
        cont--;

        for (int i = 0; i < cont; i++) {
            leitura(entrada[i]);
        }

        System.out.println(isString());

    }
}