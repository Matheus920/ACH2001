class Produto {
    
    int produto;
    int fabricante;

    public Produto(int produto, int fabricante){
        this.produto = produto;
        this.fabricante = fabricante;
    }

    public String toString(){
        return "Código: " + this.produto + " Fabricante: " + this.fabricante;
    }
    
    static void ordena(Produto[] arr){
        for(int j = arr.length-1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(arr[i+1].produto < arr[i].produto){
                    Produto aux = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = aux;
                }
            }
        }        
    }

    static int busca(Produto[] arr, Produto p){
        int fim = arr.length - 1;
        int inicio = 0;
        while(inicio <= fim){
            int meio = inicio+fim/2;
            if(arr[meio].produto == p.produto) return meio;
            else if(arr[meio].produto > p.produto) fim = meio - 1;
            else if(arr[meio].produto < p.produto) inicio = meio + 1;
        }

        return -1;
    }

    public static void main(String[] args){
        Produto[] produtos = {new Produto(1, 3), new Produto(2, 3), new Produto(0, 3), new Produto(4, 1)};
        ordena(produtos);
        for(Produto p : produtos){
            System.out.println(p);
        }
        Produto p = new Produto(7,3);
        System.out.println(busca(produtos, p));
    }

}
