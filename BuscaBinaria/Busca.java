class Busca {

static int buscaBinaria(int[] array, int valor){
	int primeiraPosicao = 0;
	int ultimaPosicao = array.length - 1;
	
	while(primeiraPosicao <= ultimaPosicao){
		int meio = (primeiraPosicao + ultimaPosicao) / 2;
		if(array[meio] == valor) return meio;
		else {
			if(array[meio] < valor) primeiraPosicao = meio + 1;
			else ultimaPosicao = meio - 1;
		}
	}

	return -1;

}

public static void main(String[] args){
	System.out.println(buscaBinaria(new int[]{2, 3, 5, 6}, 7));

}

}
