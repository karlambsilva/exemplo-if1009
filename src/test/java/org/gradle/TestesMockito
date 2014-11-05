package org.gradle;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestesMockito {
	
	/**
	 * Este teste demostrara o uso da funcao verify para mocks.
	 * A funcao verify e importante para validar se determinadas funcoes declaradas no mock 
	 * foram chamadas. 
	 * Exemplo: Nas linhas 21 e 22 declaramos os metodos que serao chamados e os parametros que eles receberao.
	 * Ja nas linhas 26 e 27, validaremos se os metodos informados foram chamados.
	 */
	@Test
	public void test01(){ 
		 
		 Banco mockedBanco = mock(Banco.class);
		
		 //usando o mock object
		 mockedBanco.setDescricao("Banco da Cidade Universitaria");
		 mockedBanco.getDescricao();
	
		 //verificacoes
		 verify(mockedBanco).setDescricao("Banco da Cidade Universitaria");
		 verify(mockedBanco).getDescricao();
	}
	
	/**
	 * Este teste deve falhar, pois estamos passando para o mock a descricao "Banco do Recife"
	 * e logo em seguida, verificamos se ele recebeu alguma chamada ao metodo setDescricao com
	 * o parametro "Banco de Olinda".
	 */
	@Test
	public void test02(){ 
		 
		 Banco mockedBanco = mock(Banco.class);
		
		 //usando o mock object
		 mockedBanco.setDescricao("Banco do Recife");
		 mockedBanco.getDescricao();
	
		 //verificacoes
		 verify(mockedBanco).setDescricao("Banco de Olinda");
		 verify(mockedBanco).getDescricao();
	}

	@Test
	public void test03(){
		 
		Conta mockedConta = mock(Conta.class);
		when(mockedConta.getSaldo()).thenReturn(0.0);
		
		assertEquals(0.0, mockedConta.getSaldo(), 0.0);
	}

}
