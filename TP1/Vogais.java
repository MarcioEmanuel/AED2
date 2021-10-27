import java.util.Scanner;

public class ISRec {

public static boolean isFim(String s)
{
    return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
}

public static boolean isVogais(char s){

    if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
        return true;
    }else{
        return false;
    }

}

public static boolean tdVogais (String s){
    int tamanho = s.length();
    int cont = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
    if(isVogais(s.charAt(i)) == true){
        cont++;
    }else{
        cont = 0;
        return false;
    }
    }
    
    if(cont != 0)
    {
        return true;
    }else{
        return false;
    }
}

public static boolean tdConsoantes (String s)
{
    int tamanho = s.length();
    int cont = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
        if(isVogais(s.charAt(i)) == false && s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '4' && s.charAt(i) != '5' && s.charAt(i) != '6' && s.charAt(i) != '7' && s.charAt(i) != '8' && s.charAt(i) != '9')
        {
            cont++;
        }else{
            cont = 0;
            return false;
        }
    }
    
    if(cont != 0)
    {
        return true;
    }else{
        return false;
    }
}

public static boolean tdInt (String s)
{
    int tamanho = s.length();
    int cont = 0;

    for(int i = 0; i < tamanho; i++)
    {
        if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){

            cont++;

        }else{

            cont = 0;
            i = tamanho - 1;
            return false;
        }

    }

    if(cont != 0)
    {
        return true;
    }else
    {
        return false;
    }
}

public static boolean isReal(String s)
{
    int tamanho = s.length();
    int cont = 0;
    int cont2 = 0;
    int i = 0;

    for(i = 0; i < tamanho; i++)
    {
        if(s.charAt(i) >= '0' && s.charAt(i) <='9' || s.charAt(i) == '.' || s.charAt(i) == ',')
        {
            cont++;
        }else{
            cont = 0;
            return false;
        }

        if(s.charAt(i) == '.' || s.charAt(i) == ','){
            cont2++;
        }else{

        }
    }

    if(cont != 0 && cont2 != 0)
    {
        return true;
    }else
    {
        return false;
    }
}

public static void main(String[] args)
{
    String[] palavras = new String[2000];
    int cont = 0;
    boolean resp1, resp2, resp3, resp4;
    
    do {
        palavras[cont] = MyIO.readLine();   
    } while (isFim(palavras[cont++]) == false);
    cont--;

    for(int i = 0; i < cont; i++)
    {
        resp1 = tdVogais(palavras[i]);
            if(resp1 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp2 = tdConsoantes(palavras[i]);
            if(resp2 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp3 = tdInt(palavras[i]);
            if(resp3 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp4 = isReal(palavras[i]);
            if(resp4 == true)
            {
                MyIO.println("SIM");
            }else
            {
                MyIO.println("NAO");
            }
    }
}

}