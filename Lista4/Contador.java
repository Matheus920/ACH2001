class Contador {
	static int contagem1(int[] valores, int x){
		int vezes = 0;		

		for(int i = 0; i < valores.length; i++){
			if(valores[i] == x) vezes++;
		}

		return vezes;
	}

	static int contagem2(int[] valores, int x){
		int vezes = 0;		

		for(int valor : valores) {
			if(valor == x) vezes++;
		}

		return vezes;
	}


	public static void main(String[] args){
		int[] arranjo = {1, 2, 3, 3, 3, 4, 5};
		System.out.println(contagem2(arranjo, 3));
	}

}
