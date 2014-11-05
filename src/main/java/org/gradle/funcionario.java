package org.gradle;

public class Funcionario extends Cliente{
	
	String cargo;
	int cpf;
	
	public Funcionario (String nome, String telefone, int idade, String cargo, int cpf){
		super(nome, telefone, idade);
		this.cargo = cargo;
		this.cpf = cpf;
		
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
