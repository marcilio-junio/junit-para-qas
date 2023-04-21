package exercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidacaoIgualdade {
	
	@Test
	public void validacaoIgualdade_Sucesso(){
		String resultadoObtido = "Registro salvo com Sucesso!";
		assertEquals("Registro salvo com Sucesso!", resultadoObtido);
	}
	
	@Test
	public void validacaoIgualdade_Falha(){
		String resultadoObtido = "Registro excluido com Sucesso!";
		assertEquals("Registro salvo com Sucesso!", resultadoObtido);
	}
}
