package br.redesprou.com.verificador_palindromos;
public class Palindromo {
  public boolean ehPalindromo(String frase) {
	  if( frase.isEmpty() ) {
		  return false;
	  }
	  
    String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
    for(int i = 0; i < fraseFiltrada.length(); i++) {
      if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt(fraseFiltrada.length() -i - 1)) {
        return false;
      }
    }
    
    return true;
  }
}
