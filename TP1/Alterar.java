import java.util.Scanner;
import java.util.Random;

class Alterar{
    public static boolean isFim(String s) {
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

public static boolean isEquals(char l1,char s)
    {
            if(s == l1)
        {
            return true;
        }else
        {
            return false;
        }

    }

public static String isRand(String s) {
        int tamanho = s.length();
        String resp = new String();
        
        Random gerador = new Random();
        gerador.setSeed(4);
        
        char l1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        char l2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

        for(int i = 0; i < tamanho; i++)
        {
            if(isEquals(l1, s.charAt(i)) == true)
            {
                resp += l2;
            }else
            {
                resp += s.charAt(i);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String[] palavras = new String[2052];
        String resp = new String();
        int cont = 0;

        do {
            palavras[cont] = MyIO.readLine();
        } while (isFim(palavras[cont++]) == false);
        cont--;

        for (int i = 0; i < cont; i++) {
            MyIO.println(isRand(palavras[i]));
        }
    }
}
