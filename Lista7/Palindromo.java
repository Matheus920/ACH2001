class Palindromo{
    static boolean palindromo(String s){
        char[] palavraInvertida = s.toCharArray();
        for(int i = 0; i < palavraInvertida.length; i++){
            palavraInvertida[i] = palavraInvertida[palavraInvertida.length-i-1];
        }
        String comparar = new String(palavraInvertida);
        return s.equals(comparar);
    }
    
    public static void main(String[] args){
        System.out.println(palindromo("macaco"));
    }

}
