package exercicio11;

import org.junit.Ignore;
import org.junit.Test;

public class ignorarTestes {
	
	@Test
	public void teste1(){	
	}
	
	@Test
	@Ignore
	public void testeIgnorado(){
	
	}
	
	@Test
	@Ignore(value = "Teste ignorado pelo Motivo")
	public void testeignoradoComMotivo(){

	}
}
