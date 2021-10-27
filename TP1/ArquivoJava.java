import java.io.RandomAccessFile;

public class ArquivoJava{


    public static void main(String[] args) throws Exception {

        //Abrir arquivo.txt com a função de escrita
        RandomAccessFile arquivo = new RandomAccessFile("exemplo.txt", "rw");
        int vInicial = 0;
        double vGravados = 0;

        vInicial = MyIO.readInt();
        for(int i = 0; i < vInicial; i++){
            vGravados = MyIO.readDouble();
            arquivo.writeDouble(vGravados);
        }
        
        arquivo.close();

        int seek = (vInicial * Double.BYTES);

        RandomAccessFile arquivo2 = new RandomAccessFile("exemplo.txt", "r");
        for(int i = 0; i < vInicial; i++){
            seek-= Double.BYTES;
            arquivo2.seek(seek);
            MyIO.println(arquivo2.readDouble());
        }

        arquivo2.close();

    }



}