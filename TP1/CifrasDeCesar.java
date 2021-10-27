class CifrasDeCesar {
    // Testar o fim da entrada de dados do vetor de String
    public static boolean isFim(String x) {
        return (x.length() >= 3 && x.charAt(0) == 'F' && x.charAt(1) == 'I' && x.charAt(2) == 'M');
    }

    public static String Cesar(int chave, String x)
    {
        StringBuilder criptografia = new StringBuilder();
        int tamanho = x.length();

        for(int i = 0; i < tamanho; i++)
        {
            int criptografiaASCII = ((int) x.charAt(i)) + (chave);

            criptografia.append((char)criptografiaASCII);
        }
        return criptografia.toString();
    }

    public static void main(String[] args) {
        String resp = new String();
        String[] palavra = new String[1000];
        int cont = 0;

        do {
            palavra[cont] = MyIO.readLine();
        } while (isFim(palavra[cont++]) == false);
        cont--;

        for (int i = 0; i < cont; i++) {
            resp = (Cesar(3, palavra[i]));
            MyIO.println(resp);
        }
    }
}