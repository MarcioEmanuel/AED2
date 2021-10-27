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

public static boolean tdVogais (String s, int tamanho, int cont){

    if(tamanho > 0){
        if(isVogais(s.charAt(tamanho)) == true){
            cont++;
        }else{
            cont = 0;
            return false;
        }
        return tdVogais(s, tamanho - 1, cont);
    }else{}
    
    if(cont != 0)
    {
        return true;
    }else{
        return false;
    }
}

public static boolean tdConsoantes (String s, int tamanho, int cont)
{

    if(tamanho > 0){
        if(isVogais(s.charAt(tamanho)) == false && s.charAt(tamanho) != '0' && s.charAt(tamanho) != '1' && s.charAt(tamanho) != '2' && s.charAt(tamanho) != '3' && s.charAt(tamanho) != '4' && s.charAt(tamanho) != '5' && s.charAt(tamanho) != '6' && s.charAt(tamanho) != '7' && s.charAt(tamanho) != '8' && s.charAt(tamanho) != '9')
        {
            cont++;
        }else{
            cont = 0;
            return false;
        }
        return tdConsoantes(s, tamanho - 1, cont);
    }else{}
    
    if(cont != 0)
    {
        return true;
    }else{
        return false;
    }
}

public static boolean tdInt (String s, int tamanho, int cont)
{


    if(tamanho > 0)
    {
        if(s.charAt(tamanho) >= '0' && s.charAt(tamanho) <= '9'){

            cont++;

        }else{

            cont = 0;
            return false;
        }
        return tdInt(s, tamanho - 1, cont);
    }else{}

    if(cont != 0)
    {
        return true;
    }else
    {
        return false;
    }
}

public static boolean isReal(String s, int tamanho, int cont, int cont2)
{

    if(tamanho > 0){
        if(s.charAt(tamanho) >= '0' && s.charAt(tamanho) <='9' || s.charAt(tamanho) == '.' || s.charAt(tamanho) == ',')
        {
            cont++;
        }else{
            cont = 0;
            return false;
        }

        if(s.charAt(tamanho) == '.' || s.charAt(tamanho) == ','){
            cont2++;
        }else{}

        return isReal(s, tamanho - 1, cont, cont2);
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
    int qtd = 0;
    boolean resp1, resp2, resp3, resp4;
    
    do {
        palavras[qtd] = MyIO.readLine();   
    } while (isFim(palavras[qtd++]) == false);
    qtd--;

    for(int i = 0; i < qtd; i++)
    {
    int cont = 0;
    int cont2 = 0;
        resp1 = tdVogais(palavras[i], palavras[i].length() - 1, cont);
            if(resp1 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp2 = tdConsoantes(palavras[i], palavras[i].length() - 1, cont);
            if(resp2 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp3 = tdInt(palavras[i], palavras[i].length() - 1, cont);
            if(resp3 == true)
            {
                MyIO.print("SIM ");
            }else
            {
                MyIO.print("NAO ");
            }
        
        resp4 = isReal(palavras[i], palavras[i].length() - 1, cont, cont2);
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