import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.lang.String;

public class HTML{

    public static boolean isFim(String s){
        return(s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isVogal(char c){
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�');
    }

    public static boolean isConsoante(char c){
        return(c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v' || c == 'x' || c == 'z' || c == 'w' || c == 'y');
    }

    public static int quantidades(char c){
        int qtd = 0;
        if(c == 'a'){
            qtd++;
        }
        return qtd;
    }

    public static void connectURL(String nome, String link){
        try {
            int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0, x10 = 0, x11 = 0, x12 = 0, x13 = 0, x14 = 0, x15 = 0, x16 = 0, x17 = 0, x18 = 0, x19 = 0, x20 = 0, x21 = 0, x22 = 0, x23 = 0, x24 = 0, x25 = 0;
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            BufferedReader html = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer htmlCP = new StringBuffer();
            String line;
                
            while ((line = html.readLine()) != null) {
                htmlCP.append(line);
            }

            htmlCP.toString();

            for(int j = 0; j < htmlCP.length(); j++){
                
                if(isVogal(htmlCP.charAt(j)) == true){
                    if(htmlCP.charAt(j) == 'a'){
                        x1++;
                    }else if(htmlCP.charAt(j) == 'e')
                    {
                        x2++;
                    }else if(htmlCP.charAt(j) == 'i')
                    {
                        x3++;
                    }else if(htmlCP.charAt(j) == 'o')
                    {
                        x4++;
                    }else if(htmlCP.charAt(j) == 'u')
                    {
                        x5++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x6++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x7++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x8++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x9++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x10++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x11++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x12++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x13++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x14++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x15++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x16++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x17++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x18++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x19 = x19 + 1;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x20++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x21++;
                    }else if(htmlCP.charAt(j) == '�')
                    {
                        x22++;
                    }
                
                }else if(isConsoante(htmlCP.charAt(j)) == true){
                    x23++;
                }else if(htmlCP.charAt(j) == '<'){
                    if(htmlCP.charAt(j) == '<' && htmlCP.charAt(j+1) == 'B' && htmlCP.charAt(j+2) == 'R' && htmlCP.charAt(j+3) == '>'){
                    x24++;
                    x23 -= 2;
                }else if(htmlCP.charAt(j) == '<'){
                    if(htmlCP.charAt(j) == '<' && htmlCP.charAt(j+1) == 't' && htmlCP.charAt(j+2) == 'a' && htmlCP.charAt(j+3) == 'b' && htmlCP.charAt(j+4) == 'l' && htmlCP.charAt(j+5) == 'e' && htmlCP.charAt(j+6) == '>'){
                    x25++;
                    x1--;
                    x2--;
                    x23 -= 3;
                    }
                }
            }
        }

        System.out.println("a"+ '(' + x1 + ')' + " e" + '(' + x2 + ')' + " i" + '(' + x3 + ')' + " o" + '(' + x4 + ')' + " u" + '(' + x5 + ')' + " �" + '(' + x6 + ')' + " �" + '(' + x7 + ')'+ " �" + '(' + x8 + ')' + " �" + '(' + x9 + ')'+ " �" + '(' + x10 + ')' + " �" + '(' + x11 + ')'+ " �" + '(' + x12 + ')' + " �" + '(' + x13 + ')'+ " �" + '(' + x14 + ')' + " �" + '(' + x15 + ')'+ " �" + '(' + x16 + ')' + " �" + '(' + x17 + ')'+ " �" + '(' + x18 + ')' + " �" + '(' + x19 + ')'+ " �" + '(' + x20 + ')' + " �" + '(' + x21 + ')'+ " �" + '(' + x22 + ')' + " consoante" + '(' + x23 + ')'+ " <br>" + '(' + x24 + ')' + " <table>" + '(' + x25 + ") " + nome);

        html.close();
        }catch (MalformedURLException e) {
            MyIO.printf("URL inserido não encontrado!");
        } catch (IOException e){

        }

    }

    public static void main(String[] args){
        String[] nome = new String[1000];
        String[] link = new String[1000];
        int cont = 0;
        int cont2 = 0;
        int parada = 0;
        
        do {
            nome[cont] = MyIO.readLine();
        if(isFim(nome[cont]) == false){
            link[cont2++] = MyIO.readLine();
            cont++;
        }else{
            parada++;
        }           
        } while (parada == 0);

        for(int i = 0; i < cont; i++){
            
            connectURL(nome[i], link[i]);

        }
    }
}
