class Comparador {

    static boolean comparaTextos(String texto1, char[] texto2){
        String temp = new String(texto2);
        return texto1.equals(temp);
    }

    public static void main(String[] args){
        String teste1 = "teste";
        char[] teste2 = {'t', 'e', 's', 't', 'e'};
        System.out.println(comparaTextos(teste1, teste2));
    }

}
