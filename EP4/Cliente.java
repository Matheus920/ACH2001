
public class Cliente extends Pessoa implements InterfaceCliente{
	static final int dividaMaxima = 30000;
	static final String tipo = "C";
	private int valorContaCorrente;
	private int valorDaDivida;
	
	/* Construtor da Classe Cliente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Cliente(String nome, int cpf, int valorInicial){
		super(nome, cpf);
		valorContaCorrente = valorInicial;
		valorDaDivida = 0;
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}	
	
	
	protected int getValorContaCorrente() {
		return valorContaCorrente;
	}
	
	protected int getValorDaDivida() {
		return valorDaDivida;
	}
	
	protected void setValorContaCorrente(int valor) {
		valorContaCorrente = valor;
	}
	
	protected void setValorDaDivida(int valor) {
		valorDaDivida = valor;
	}
	

	/* Metodo para o cliente atual obter um emprestimo de acordo com o valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro mais o valor do atributo valorDaDivida for maior do
	 *         que o valor da constante dividaMaxima, o metodo deve retornar false 
	 *     2a) caso contrario, o atributo valorDaDivida deve ser incrementado em valor, o atributo
	 *         valorContaCorrente deve ser incrementado em valor e o metodo deve retornar true
	 */
	public boolean obterEmprestimo(int valor) {
		
        // Se o valor solicitado for menor ou igual a zero, retorna false.
        if(valor <= 0) return false;

        // Se o valor pedido  em conjunto com o valor atual da dívida exceder o valor máximo, retorna false.
        else if(valor + valorDaDivida > dividaMaxima) return false;
		
        // Transação aprovada, valores de dívida e conta atualizados.
        else {
            valorDaDivida += valor;
            valorContaCorrente += valor;
            return true;        
        }
	}
	

	/* Metodo para o cliente atual pagar parte de sua divida de acordo com o valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro for maior do que o valorDaDivida ou for maior do que 
	 *         valorContaCorrente, o metodo deve retornar false 
	 *     2a) caso contrario, o atributo valorDaDivida deve ser decrementado em valor, o atributo
	 *         valorContaCorrente deve ser decrementado em valor e o metodo deve retornar true
	 */
	public boolean pagarEmprestimo(int valor) {
		
        // Se o valor for menor ou igual que zero retorna false.
		if(valor <= 0) return false;
        
        // Caso o valor exceda o valor da dívida ou da conta corrente, retorna false.
        else if(valor > valorDaDivida || valor > valorContaCorrente) return false;
        
        // Caso contrário a transação é aprovada e os valores são atualizados.
        else {
            valorDaDivida -= valor;
            valorContaCorrente -= valor;
            return true;
        }
	}
	
	
	/* Metodo que retorna true caso valorContaCorrente seja menor do que valorDaDivida.
	 * Caso contrario, retorna false.
	 */
	public boolean negativado() {
		
        // Realiza a verificação da negativação.
		return valorContaCorrente < valorDaDivida;
	}
	

	/* Metodo para o cliente atual realizar um saque do valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro for maior do que o valor do atributo valorContaCorrente, o 
	 *         metodo deve retornar false
	 *     2a) caso contrario, o atributo valorContaCorrente deve ser decrementado em valor e o
	 *         metodo deve retornar true
	 */
	public boolean realizarSaque(int valor) {

        //Se o valor for menor ou igual a zero retorna false.		
		if(valor <= 0) return false;
        
        // Se o valor for maior que o valor da conta corrente retorna false.
        else if(valor > valorContaCorrente) return false;

        // Caso contrário, transação é aprovada e os valores são atualizados.
        else {
            valorContaCorrente -= valor;
            return true;
        }
	}
}
