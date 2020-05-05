class BubbleSort {
    static int[] bubbleSort(int[] array){
        int[] arrayOrdenado = array;
        int ultimaPosicao = arrayOrdenado.length - 1;
        while(ultimaPosicao > 0){
            for(int i = 0; i < ultimaPosicao; i++){
                if(arrayOrdenado[i] > arrayOrdenado[i+1]){
                    int aux = arrayOrdenado[i+1];
                    arrayOrdenado[i+1] = arrayOrdenado[i];
                    arrayOrdenado[i] = aux;
                }
            }
            ultimaPosicao--;
        }

        return arrayOrdenado;

    }

    public static void main(String args[]){
        int[] teste = {8, 2, 3, 5, 1, 3, 0, 12, -4};
        teste = bubbleSort(teste);

        for(int i : teste){
            System.out.print(i + " ");
        }
    }
}
