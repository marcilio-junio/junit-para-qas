package exercicio1;

import org.junit.Test;

public class PrimeiroTeste {

	@Test
	public void teste1(){
		System.out.println("Teste1 executado");
	}
	
	@Test
	public void teste2(){
		System.out.println("Teste2 executado");
	}
	
	public void naoEUmTest(){
		System.out.println("Esta mensagem não deve aparecer!");
	}
}
