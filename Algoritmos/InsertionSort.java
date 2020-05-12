class InsertionSort {

    static int[] insertionSort(int[] m){
        int[] result = m;
        for(int i = 1; i < result.length; i++){
            int aux = result[i];
            int j = i;
            
            while((j > 0) && (aux < result[j - 1])) {
                result[j] = result[j-1];
                j--;
            }
            
            result[j] = aux;
        }

        return result;

    }

    public static void main(String[] args){
        int[] naoOrdenado = {2, 5, 3, 1, 0, -9, 8, 7};
        int[] ordenado = insertionSort(naoOrdenado);
        for(int i : ordenado){
            System.out.print(i + " ");
        }
    }

}
