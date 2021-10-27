class Selecao extends Geracao {

    /**
     * Construtor.
     */
    public Selecao(){
       super();
    }
 
 
    /**
     * Construtor.
     * @param int tamanho do array de numeros inteiros.
     */
    public Selecao(int tamanho){
       super(tamanho);
    }
 
 
    /**
     * Algoritmo de ordenacao por selecao.
     */
    @Override
    public void sort() {
        int cont = 0;
        int mov = 0;
       for (int i = 0; i < (100 - 1); i++) {
          int menor = i;
          for (int j = (i + 1); j < 100; j++){
            if (array[menor] > array[j]){
                cont= cont + 1;
                menor = j;
                mov = mov + 1;
            }
          }
          swap(menor, i);
          mov = mov + 3;
       }
        System.out.println(cont + " comparações");
        System.out.println(mov + " Movimenteções");
    }
 }