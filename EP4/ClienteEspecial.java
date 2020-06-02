
public class ClienteEspecial extends Cliente{
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
    // É necessário sobrescrever o método da classe pai, já que o valor de dívida máxima é diferenciado nesse caso.
	public boolean obterEmprestimo(int valor) {
	    // Se o valor solicitado for menor ou igual a zero, retorna false.
        if(valor <= 0) return false;

        // Se o valor pedido  em conjunto com o valor atual da dívida exceder o valor máximo, retorna false.
        else if(valor + getValorDaDivida() > dividaMaxima) return false;
		
        // Transação aprovada, valores de dívida e conta atualizados.
        else {
            setValorDaDivida(getValorDaDivida() + valor);
            setValorContaCorrente(getValorContaCorrente() + valor);
            return true;        
        }
	}
	
}
