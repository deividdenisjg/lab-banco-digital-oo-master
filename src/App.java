import controller.ContaCorrente;
import controller.ContaPoupanca;
import model.Cliente;
import model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente deivid = new Cliente();
		deivid.setNome("Deivid");
		
		Conta cc = new ContaCorrente(deivid);
		Conta poupanca = new ContaPoupanca(deivid);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
