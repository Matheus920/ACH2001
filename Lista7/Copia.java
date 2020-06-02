class Copia {
    static String copiaStr(String s){
        return new String(s);
    }

    public static void main(String[] args){
        String s = "oi";
        System.out.println(s);
        System.out.println(copiaStr(s));
        System.out.println(s == copiaStr(s));
    }

}
