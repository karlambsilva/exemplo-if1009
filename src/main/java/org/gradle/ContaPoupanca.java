package org.gradle;


public class ContaPoupanca extends Conta{
	private double taxa;
	
	public ContaPoupanca(String nome, int numeroConta, double saldo, double taxa){
		
		super(nome, numeroConta, saldo);
		this.taxa = taxa;
	}
	
	public void renderJuros(double taxa){
		double juros = getSaldo() * taxa;
		
		this.creditar(juros);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double juros) {
		this.taxa = juros;
	}

}
