package org.gradle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Mais exemplos de como usar o Hamcrest estao disponiveis na pagina do framework
 * Documentation - https://code.google.com/p/hamcrest/wiki/Tutorial
 */
public class TestesHamcrest{
	
	Conta contaPessoa1;
	Conta contaPessoa2;
	
	@Before
	public void setup(){
		contaPessoa1 = new Conta("Pessoa 1" , 1234, 50.00);
		contaPessoa2 = new Conta("Pessoa 2" , 1235, 500.00);
	}
	
	/**
	 * Este teste usara o metodo equalTo para validar se o saldo da contaPessoa1 
	 * e igual a 150.0
	 */
	@Test
	public void creditarValor(){
		this.contaPessoa1.creditar(100.00);
		assertThat("Saldo da conta incorreto", contaPessoa1.getSaldo(), equalTo(150.00));
	}
	
	/**
	 * Esse test verificara se a excecao foi realmente levantada
	 * @throws OperacaoIlegalException
	 */
	@Test(expected=OperacaoIlegalException.class)
//	@Test
	public void debitarValor() throws OperacaoIlegalException{
		this.contaPessoa1.debitar(3000.0);
//		assertThat("Saldo da conta incorreto", contaPessoa1.getSaldo(), equalTo(20.00));
	}
	
	/**
	 * Esse teste usara o metodo GreaterThan para verificar se a contaPessoa2 
	 * possui um saldo maior que 1000.0 
	 */
	@Test
	public void encontrarClienteRico(){
		assertThat("A cliente nao possui mais de 1000 no nosso banco", 
				contaPessoa2.getSaldo(), greaterThan(1000.00) );
	}
	
	/**
	 * Esse teste usara o metodo GreaterThan para verificar se a contaPessoa2 
	 * possui um saldo maior que 1000.0 
	 */
	@Test
	public void validarNome(){
		assertThat("A cliente nao possui mais de 1000 no nosso banco", 
				contaPessoa2.getSaldo(), greaterThan(1000.00) );
	}
	
	
}
