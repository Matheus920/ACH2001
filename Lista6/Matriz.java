class Matriz {

static int maiorValor(int[][] m){
    int maior = m[0][0];

    for(int[] linha : m){
        for(int valor : linha){
            if(valor > maior)   maior = valor;
        }
    }

    return maior;
}

static int somaDiagonal(int[][] m){
    int soma = 0;
    
    for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
            if(i == j) soma += m[i][j];
        }
    }

    return soma;

}

static boolean simetrica(int[][] m){
    for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
            if(m[i][j] != m[j][i]) return false;
        }
    }

    return true;
}

public static void main(String[] args){
    int[][] matriz = {{2, 3, 4}, {3, 1, 1}, {4, 1, -4, 5}};
    System.out.println(simetrica(matriz));
}

}
