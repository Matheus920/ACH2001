class Matrizes {

static int[][] soma3(int[][] matriz1, int[][] matriz2, int[][] matriz3){
	if((matriz1.length != matriz2.length) || (matriz1.length != matriz3.length) ||
		(matriz3.length != matriz2.length)) return null;
	else{
		if((matriz1[0].length != matriz2[0].length) || (matriz1[0].length != matriz3[0].length) ||
		(matriz3[0].length != matriz2[0].length)) return null;
	}

	int[][] soma = new int[matriz1.length][matriz1[0].length];

	for(int i = 0; i < soma.length; i++){
		for(int j = 0; j < soma[i].length; j++){
			soma[i][j] = matriz1[i][j] + matriz2[i][j] + matriz3[i][j];
		}
	}

	return soma;	
}

public static void main (String[] args){
	int[][] matriz1 = {{1, 2}, {2, 1}};
	int[][] matriz2 = {{4, 3}, {3, -2}, {2, 1}};
	int[][] matriz3 = {{0, 3}, {-3, 3}};
	
	int[][] soma = soma3(matriz1, matriz2, matriz3);
	
	if(soma != null){
		for(int i = 0; i < soma.length; i++){
			for(int j = 0; j < soma[i].length; j++){
				System.out.println(soma[i][j]);
			}
		}
	}	
}

}
