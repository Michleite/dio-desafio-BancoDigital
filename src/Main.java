
public class Main {

	public static void main(String[] args) {
		Cliente menino = new Cliente();
		menino.setNome("Menino");
		
		
		Conta cc = new ContaCorrente(menino);
		Conta poupanca = new ContaPoupan�a(menino);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
