package br.edu.iesb.poo2023.polimorfismo.parametrico;

import java.util.ArrayList;

public class ExecutaPolimorfismoParametrico {

	public ExecutaPolimorfismoParametrico() {}
	
	public void executar() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Bruno");
		
		new PolimorfismoParametrico().executar(nomes);
		
	}

}
