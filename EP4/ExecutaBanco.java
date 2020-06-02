
public class ExecutaBanco {
	public static void main(String[] args){
		
		System.out.println("ATENCAO: Nem todas as caracteristicas do enunciado sao testadas neste exemplo.");
		System.out.println("         Cabe a cada aluno testar cuidadosamente seu EP.\n");
		
		System.out.println("*** Instanciando Clientes **************************************");
		Cliente c1 = new Cliente("Cliente A", 22222, 10000);
		Cliente c2 = new ClienteEspecial("Cliente B", 33333, 2000);
		Cliente c3 = new Cliente("Cliente C", 44444, 30000);
		Cliente c4 = new Cliente("Cliente D1", 055555, 10);
        Cliente c5 = new Cliente("Cliente D", 55555, 10);
        Cliente c6 = new Cliente("Cliente E", 155555, 10);
Cliente c7 = new Cliente("Cliente F", 55355, 10);
Cliente c8 = new Cliente("Cliente G", 52555, 10);
Cliente c9 = new Cliente("Cliente H", 515555, 10);
Cliente c10 = new Cliente("Cliente I", 545555, 10);
Cliente c11 = new Cliente("Cliente J", 555555, 10);
Cliente c12 = new Cliente("Cliente K", 555255, 10);
Cliente c13 = new Cliente("Cliente L", 52554255, 10);
Cliente c14 = new Cliente("Cliente M", 5553455, 10);
Cliente c15 = new Cliente("Cliente N", 555545, 10);
Cliente c16 = new Cliente("Cliente O", 51555405, 10);
Cliente c17 = new Cliente("Cliente P", 5545455, 10);
Cliente c18 = new Cliente("Cliente Q", 555505, 10);
Cliente c19 = new Cliente("Cliente R", 5521555, 10);
Cliente c20 = new Cliente("Cliente S", 55545255, 10);
Cliente c21 = new Cliente("Cliente T", 5555345, 10);


		System.out.println("*** Instanciando Gerentes **************************************");
		Gerente ger1 = new Gerente("Gerente 1", 12345);
		Gerente ger2 = new Gerente("Gerente 2", 12121);
		Gerente ger3 = new Gerente("Gerente 3", 1821821);
		Gerente ger4 = new Gerente("Gerente 4", 14212121);
		Gerente ger5 = new Gerente("Gerente 5", 1231213);
		Gerente ger6 = new Gerente("Gerente 6", 1112121);
		Gerente ger7 = new Gerente("Gerente 7", 12332121);
		Gerente ger8 = new Gerente("Gerente 8", 121231);
		Gerente ger9 = new Gerente("Gerente 9", 102121);
		Gerente ger10 = new Gerente("Gerente 10", 142121);
		Gerente ger11 = new Gerente("Gerente 11", 132121);
		
		System.out.println("*** Instanciando um Banco **************************************");
		Banco meuBanco = new Banco();
		
		
		
		System.out.println("*** Adicionando Clientes ao Gerente 1 **************************");
		
		if (ger1.adicionarCliente(c1)) System.out.println("Cliente '"  +c1.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c1.nome + "' nao pode ser adicionado.");
		
		if (ger1.adicionarCliente(c2)) System.out.println("Cliente '"  +c2.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c2.nome + "' nao pode ser adicionado.");
		
		if (ger1.adicionarCliente(c2)) System.out.println("Cliente '"  +c2.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c2.nome + "' nao pode ser adicionado.");
		
		if (ger1.adicionarCliente(c3)) System.out.println("Cliente '"  + c3.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c3.nome + "' nao pode ser adicionado.");
        
        if (ger1.adicionarCliente(c4)) System.out.println("Cliente '"  + c4.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c4.nome + "' nao pode ser adicionado.");

        if (ger1.adicionarCliente(c5)) System.out.println("Cliente '"  + c5.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c5.nome + "' nao pode ser adicionado.");
        
        if (ger1.adicionarCliente(c6)) System.out.println("Cliente '"  + c6.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c6.nome + "' nao pode ser adicionado.");
    

        if (ger1.adicionarCliente(c7)) System.out.println("Cliente '"  + c7.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c7.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c8)) System.out.println("Cliente '"  + c8.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c8.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c9)) System.out.println("Cliente '"  + c9.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c9.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c10)) System.out.println("Cliente '"  + c10.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c10.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c11)) System.out.println("Cliente '"  + c11.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c11.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c12)) System.out.println("Cliente '"  + c12.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c12.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c13)) System.out.println("Cliente '"  + c13.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c13.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c14)) System.out.println("Cliente '"  + c14.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c14.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c15)) System.out.println("Cliente '"  + c15.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c15.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c16)) System.out.println("Cliente '"  + c16.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c16.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c17)) System.out.println("Cliente '"  + c17.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c17.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c18)) System.out.println("Cliente '"  + c18.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c18.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c19)) System.out.println("Cliente '"  + c19.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c19.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c20)) System.out.println("Cliente '"  + c20.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c20.nome + "' nao pode ser adicionado.");
if (ger1.adicionarCliente(c21)) System.out.println("Cliente '"  + c21.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c21.nome + "' nao pode ser adicionado.");
		
		System.out.println("*** Adicionando Clientes ao Gerente 2 **************************");
		
		if (ger2.adicionarCliente(c3)) System.out.println("Cliente '"  + c3.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c3.nome + "' nao pode ser adicionado.");
		
		if (ger2.adicionarCliente(c4)) System.out.println("Cliente '"  + c4.nome + "' adicionado corretamente.");
		else System.out.println("Cliente '"  + c4.nome + "' nao pode ser adicionado.");
		
		System.out.println("*** Adicionando Gerentes ao Banco ******************************");
		
		meuBanco.adicionarGerente(ger1);
		meuBanco.adicionarGerente(ger2);
meuBanco.adicionarGerente(ger3);
meuBanco.adicionarGerente(ger4);
meuBanco.adicionarGerente(ger5);
meuBanco.adicionarGerente(ger6);
meuBanco.adicionarGerente(ger7);
meuBanco.adicionarGerente(ger8);
meuBanco.adicionarGerente(ger9);
meuBanco.adicionarGerente(ger10);
meuBanco.adicionarGerente(ger11);
		
		meuBanco.imprimir();
		
		
		System.out.println("*** Testando o metodo obterEmprestimo **************************");
		
		if (c4.obterEmprestimo(20000))  System.out.println("Cliente '"  + c4.nome + "' obteve o emprestimo solicitado.");
		else  System.out.println("Cliente '"  + c4.nome + "' nao obteve o emprestimo solicitado.");
		

		if (c4.obterEmprestimo(20000))  System.out.println("Cliente '"  + c4.nome + "' obteve o emprestimo solicitado.");
		else  System.out.println("Cliente '"  + c4.nome + "' nao obteve o emprestimo solicitado.");

		
		if (c2.obterEmprestimo(20000))  System.out.println("Cliente '"  + c2.nome + "' obteve o emprestimo solicitado.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao obteve o emprestimo solicitado.");


		if (c2.obterEmprestimo(20000))  System.out.println("Cliente '"  + c2.nome + "' obteve o emprestimo solicitado.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao obteve o emprestimo solicitado.");


		if (c2.obterEmprestimo(-10))  System.out.println("Cliente '"  + c2.nome + "' obteve o emprestimo solicitado.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao obteve o emprestimo solicitado.");


		
		meuBanco.imprimir();
		
		System.out.println("*** Testando o metodo realizarSaque ****************************");
		
		if (c2.realizarSaque(12345))  System.out.println("Cliente '"  + c2.nome + "' realizou saque solicitado.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao pode realizar o saque solicitado.");

		if (c2.realizarSaque(-10))  System.out.println("Cliente '"  + c2.nome + "' realizou saque solicitado.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao pode realizar o saque solicitado.");

		if (c1.realizarSaque(10000))  System.out.println("Cliente '"  + c1.nome + "' realizou saque solicitado.");
		else  System.out.println("Cliente '"  + c1.nome + "' nao pode realizar o saque solicitado.");


		if (c1.realizarSaque(1))  System.out.println("Cliente '"  + c1.nome + "' realizou saque solicitado.");
		else  System.out.println("Cliente '"  + c1.nome + "' nao pode realizar o saque solicitado.");

		
		meuBanco.imprimir();
		
		
		
		System.out.println("*** Testando o metodo pagarEmprestimo **************************");
		if (c1.pagarEmprestimo(100))  System.out.println("Cliente '"  + c1.nome + "' pagou (parte de) sua divida.");
		else  System.out.println("Cliente '"  + c1.nome + "' nao pode pagar (parte de) sua divida.");


		if (c2.pagarEmprestimo(0))  System.out.println("Cliente '"  + c2.nome + "' pagou (parte de) sua divida.");
		else  System.out.println("Cliente '"  + c2.nome + "' nao pode pagar (parte de) sua divida.");
		
		if (c3.pagarEmprestimo(100))  System.out.println("Cliente '"  + c3.nome + "' pagou (parte de) sua divida.");
		else  System.out.println("Cliente '"  + c3.nome + "' nao pode pagar (parte de) sua divida.");

		if (c4.pagarEmprestimo(100))  System.out.println("Cliente '"  + c4.nome + "' pagou (parte de) sua divida.");
		else  System.out.println("Cliente '"  + c4.nome + "' nao pode pagar (parte de) sua divida.");

		
		
		meuBanco.imprimir();
		
		System.out.println("*** Testando o metodo cobrarTodosEmprestimos *******************");
		
		ger1.cobrarTodosEmprestimos();
		meuBanco.imprimir();
		
		ger2.cobrarTodosEmprestimos();
		meuBanco.imprimir();
		
		
		System.out.println("\nATENCAO: Nem todas as caracteristicas do enunciado sao testadas neste exemplo.");
		System.out.println("         Cabe a cada aluno testar cuidadosamente seu EP.\n");
		
		
	}
}
