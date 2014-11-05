package org.gradle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;


public class TestesHamcrest{
	
	Conta contaPessoa1;
	Conta contaPessoa2;
	
	@Before
	public void setup(){
		contaPessoa1 = new Conta("Karine Gomes" , 1234, 50.00);
		contaPessoa2 = new Conta("Karla Silva" , 1235, 500.00);
	}
	
	@Test
	public void creditarValor(){
		this.contaPessoa1.creditar(100.00);
		assertThat("Saldo da conta incorreto", contaPessoa1.getSaldo(), equalTo(150.00));
	}
	
	@Test(expected=OperacaoIlegalException.class)
//	@Test
	public void debitarValor() throws OperacaoIlegalException{
		this.contaPessoa1.debitar(3000.0);
		assertThat("Saldo da conta incorreto", contaPessoa1.getSaldo(), equalTo(20.00));
	}
	
	@Test
	public void encontrarClienteRico(){
		assertThat("A cliente nao possui mais de 1000 no nosso banco", 
				contaPessoa2.getSaldo(), greaterThan(1000.00) );
	}
	
	
	
	
}
