class Recursivo {
   public static boolean Maiuscula(char c) {
      return (c >= 'A' && c <= 'Z');
   }

   public static boolean TesteFIM(String s) {
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }

   // funcao recursiva para contagem de letras maiusculas
   public static int isMaiusculas(int resp, int i, String s) {
      int tamanho = s.length();

      if (i < tamanho) {
         if (Maiuscula(s.charAt(i)) == true) {
            resp = resp + 1;
            return isMaiusculas(resp, i + 1, s);
         } else
         {
            return isMaiusculas(resp, i + 1, s);
         }
      }
      return resp;
   }

   public static void main(String[] args) {
      String[] entrada = new String[1000];
      int numEntrada = 0;

      // Ler a entrada de dados
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (TesteFIM(entrada[numEntrada++]) == false);
      numEntrada--;
      // chamar a funcao recursiva
      for (int i = 0; i < numEntrada; i++) {
         MyIO.println(isMaiusculas(0, 0, entrada[i]));
      }
   }
}
