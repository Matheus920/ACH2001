class Palavras {

static int contaCaracteres(char[][] palavras){
	int caracteres = 0;
	for(char[] palavra : palavras){
		caracteres += palavra.length;
	}
	return caracteres;
}

public static void main(String[] args){
	System.out.println(contaCaracteres(new char[][]{{'a', 'b', 'c'}, {'b', 'd'}}));
}

}
