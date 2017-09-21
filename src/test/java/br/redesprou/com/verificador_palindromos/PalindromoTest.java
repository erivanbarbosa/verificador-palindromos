package br.redesprou.com.verificador_palindromos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.redesprou.com.verificador_palindromos.Palindromo;

public class PalindromoTest {

	@Test
	public void test() {
		Palindromo palindromo = new Palindromo();
		
		String text1 = "Socorram-me subi no onibus em Marrocos";
		String text2 = "Anotaram a data da maratona";
		String textCharacter = "A";
		String textVazio = "";
		String textNaoPalindromo = "Flamengo";
		
		assertTrue(palindromo.ehPalindromo(text1));
		assertTrue(palindromo.ehPalindromo(text2));
		assertTrue(palindromo.ehPalindromo(textCharacter));
		assertFalse(palindromo.ehPalindromo(textVazio));
		assertFalse(palindromo.ehPalindromo(textNaoPalindromo));
	}

}
