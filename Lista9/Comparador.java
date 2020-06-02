class Comparador {

    static void bolha(String [] arr){
        for(int j = arr.length-1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(arr[i+1].compareTo(arr[i]) < 0){
                    String aux = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args){
        String[] palavras = {"casa", "boi", "ameixa", "palavra", "camelo", "casa"};
        bolha(palavras);
        for(String a : palavras){
            System.out.print(a + ", ");        
        }        

    }

}
