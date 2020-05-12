class SelectionSort {

    static int[] selectionSort(int[] m){
        int[] result = m;
        for(int i = 0; i < result.length; i++){
            int posMenor = i;
            for(int j = i+1; j < result.length; j++){
                if(result[j] < result[posMenor]) posMenor = j;
            }            
            if(result[posMenor] < result[i]){
                int aux = result[posMenor];
                result[posMenor] = result[i];
                result[i] = aux;
            }
        }
        return result;         

    }

    public static void main(String[] args){
        int[] naoOrdenado = {2, 5, 3, 1, 0, -9, 8, 7};
        int[] ordenado = selectionSort(naoOrdenado);
        for(int i : ordenado){
            System.out.print(i + " ");
        }
    }

}
