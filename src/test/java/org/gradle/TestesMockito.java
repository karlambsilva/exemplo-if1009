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
	/**
	 * Este teste cria um mock do tipo Conta e diz que quando pergamos o valor do saldo do mokc Conta (mockedConta)
	 * o mock deve retorna o saldo como 0.0. O teste, entao, realiza um assertEquals para verificar se o saldo do mockedConta
	 * eh realmente 0.0
	 */

	@Test
	public void test03(){
		 //criacao do mock
		Conta mockedConta = mock(Conta.class);
		// definicao de como o mock deve se comportar
		when(mockedConta.getSaldo()).thenReturn(0.0);
		//verificao se o mock esta se comportando como defenido
		assertEquals(0.0, mockedConta.getSaldo(), 0.0);
	}

}
