
public class Gerente extends Pessoa implements InterfaceGerente{
	private static final String tipo = "G";
	private Cliente[] clientes;
	private int numClientes;

	/* Construtor da Classe Gerente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Gerente(String nome, int cpf){
		super(nome, cpf);
		clientes = new Cliente[20];
		numClientes = 0;
	}

	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	
	/* Metodo para imprimir informacoes sobre os clientes gerenciados pelo gerente atual
	 */
	void imprimirClientes(){
		Cliente atual;
		System.out.println("\tNumero de clientes: " + numClientes);
		for (int c=0; c < numClientes; c++){
			atual = clientes[c];
			System.out.println("\t" + (c+1) + "\t" + atual.retornaTipo() + "\t" + atual.nome + "\t" + atual.cpf + "\t" + atual.getValorContaCorrente() + "\t" + atual.getValorDaDivida() + "\t" + atual.negativado());
		}
	}

    /*
        Método para pesquisar clientes com base no CPF, 
        que retorna a posição do cliente caso seja encontrado 
        e -1 caso ele não seja encontrado.
    */

    int pesquisarCliente(Cliente cliente){
        for(int i = 0; i < numClientes; i++){
            if(clientes[i].cpf == cliente.cpf) return i;
        }

        return -1;
    }


	/* Metodo para adicionar um cliente no arranjo de clientes do gerente atual.
	 * Caso o numero de clientes seja igual a 20, nao deve adicionar e deve retornar false.
	 * Caso contrario, ha duas situacoes: 
	 *   1a: o cliente ja consta no arranjo de clientes (verifique isso usando o numero do cpf),
	 *       neste caso o cliente nao deve ser reinserido e o metodo deve retornar false; 
	 *   1a: o cliente passado como parametro nao consta no arranjo de clientes: o cliente 
	 *       deve ser adicionado na posicao numClientes, o atributo numClientes deve ser 
	 *       incrementado em 1 e o metodo deve retornar true. 
	 */
	public boolean adicionarCliente(Cliente cliente) {

        // Caso o número de clientes seja igual a 20, não adiciona e retorna false.
		if(numClientes == 20) return false;
        
        /* 
            Se o método pesquisarCliente retornar qualquer outro número que não -1,
            significa que o cliente já foi inserido anteriormente, então não precisa
            ser reinserido.         
        */
        else if(pesquisarCliente(cliente) != -1) return false;
        
        // Caso contrário, o cliente está apto para ser inserido e a variável numClientes é atualizada.
        else {
            clientes[numClientes] = cliente;
            numClientes++;
            return true;
        }
                
	}

	
	/* Metodo para cobrar os emprestimos de todos os clientes do gerente atual.
	 * Para cada um dos clientes presentes no arranjo clientes, este metodo deve:
	 *   - nao fazer nada para o cliente, caso seu valorDaDivida seja igual a zero
	 *   - caso contrario, ha duas situacoes:
	 *     1a) se o valorContaCorrente do cliente for maior ou igual ao valorDaDivida, deve
	 *         fazer o cliente pagar a divida, isto e, o valorContaCorrente sera atualizado, 
	 *         descontando-se o valor da divida e o valorDaDivida sera zerado.
	 *     2a) se o valorContaCorrente do cliente for menor do que o valorDaDivida, 
	 *         deve fazer o cliente pagar parte da divida, isto e, o valorDaDivida 
	 *         sera atualizado, tendo seu valor diminuido pelo valorContaCorrente e 
	 *         o valorContaCorrente sera zerado.
	 */
	public void cobrarTodosEmprestimos() {
		
        // Executa para cada cliente dentro do array clientes	
		for(int i = 0; i < numClientes; i++){
            Cliente temp = clientes[i];
            // Caso o valor da dívida seja diferente de 0, realiza outras verificações
            if(temp.getValorDaDivida() != 0){
                // Se o valor da conta corrente for maior do que a dívida, quita a dívida.
                if(temp.getValorContaCorrente() >= temp.getValorDaDivida()){
                    temp.setValorContaCorrente(temp.getValorContaCorrente() - temp.getValorDaDivida());
                    temp.setValorDaDivida(0);
                // Caso contrário, paga o que é possível até zerar a conta corrente.
                } else {
                    temp.setValorDaDivida(temp.getValorDaDivida() - temp.getValorContaCorrente());
                    temp.setValorContaCorrente(0);
                }
            }
        }

	}



}
