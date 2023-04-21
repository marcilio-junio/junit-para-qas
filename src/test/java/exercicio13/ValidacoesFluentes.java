package exercicio13;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ValidacoesFluentes {

	@SuppressWarnings("deprecation")
	@Test
	public void validacaoEqualsTo(){
		String produto = "TV 40 polegadas";
		assertThat(produto, equalTo("TV 40 polegadas"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void validacaoIs(){
		int codigo = 50 ;
		assertThat(codigo, is(50));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void validacaoAnyof(){
		String resultadoObtido = "A cor selecionada foi vermelha." ;
		assertThat(resultadoObtido, anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void validacaoHasItems(){
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("Iphone 8 Plus 64GB");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 geracao");
		assertThat(listaProdutos, hasItem("Adaptador USB-C VGA"));
	}
}
