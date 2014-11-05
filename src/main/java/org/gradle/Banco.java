package org.gradle;

import java.util.List;

public class Banco {
	
	private List <Conta> contas;
	private String descricao;
	private String telefone;
	
	public Banco(List<Conta> contas, String descricao, String telefone) {
		this.contas = contas;
		this.descricao = descricao;
		this.telefone = telefone;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
