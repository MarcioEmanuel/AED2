class CifrasDeCesarRec {
    public static boolean isFim(String x) {
        return (x.length() >= 3 && x.charAt(0) == 'F' && x.charAt(1) == 'I' && x.charAt(2) == 'M');
    }

    public static String Cesar(int chave, String x, int tamanho, StringBuilder criptografia, int qtd)
    {
        if(tamanho >= 0)
        {
            int criptografiaASCII = ((int) x.charAt(qtd)) + (chave);

            criptografia.append((char)criptografiaASCII);

            return(Cesar(3, x, tamanho-1, criptografia, qtd+1));
        }else{
            return criptografia.toString();
        }

    }

    public static void main(String[] args) {
        String[] palavra = new String[1000];
        int cont = 0;
        String resp = new String();

        do {
            palavra[cont] = MyIO.readLine();
        } while (isFim(palavra[cont++]) == false);
        cont--;

        for (int i = 0; i < cont; i++) {
            int qtd = 0;
            StringBuilder criptografia = new StringBuilder();
            int tamanho = palavra[i].length();
            resp = (Cesar(3, palavra[i], tamanho - 1, criptografia, qtd));
            MyIO.println(resp);
        }
    }
}