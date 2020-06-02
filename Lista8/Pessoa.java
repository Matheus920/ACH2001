class Pessoa {
    
    String nome;
    int idade;
    Pessoa conjuge;

    Pessoa(String nome, int idadeEmAnos){
        this.nome = nome;
        idade = idadeEmAnos;
        conjuge = null;
    }

    Pessoa(String nome, int idade, Pessoa conjuge){
        this(nome, idade);
        this.conjuge = conjuge;
    }

    static Pessoa buscaPessoa(Pessoa[] pessoas, String nome, int idade){
        Pessoa temp = null;

        for(Pessoa pessoa : pessoas){
            if(pessoa.nome.equals(nome) && pessoa.idade == idade) temp = pessoa;
        }

        return temp;

    }

    public static void main(String[] args) {
        Pessoa[] pessoas = {new Pessoa("Matheus", 18), new Pessoa("Carine", 20), new Pessoa("Carlos", 10)};
        System.out.println(buscaPessoa(pessoas, "Carine", 12));
    }

}
