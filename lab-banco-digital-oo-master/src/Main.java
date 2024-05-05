
public class Main {

	public static void main(String[] args) {
		Cliente teste = new Cliente("Teste", "11100011100", 25);
		
		Conta cc = new ContaCorrente(teste);
		Conta poupanca = new ContaPoupanca(teste);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
