package controller;

import model.Cliente;
import model.Conta;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

}
