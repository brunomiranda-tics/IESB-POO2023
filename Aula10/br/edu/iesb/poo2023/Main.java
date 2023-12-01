package br.edu.iesb.poo2023;

import br.edu.iesb.poo2023.polimorfismo.inclusao.ClasseMae;
import br.edu.iesb.poo2023.polimorfismo.inclusao.PolimorfismoInclusao;
import br.edu.iesb.poo2023.polimorfismo.inclusao.SubClasseA;
import br.edu.iesb.poo2023.polimorfismo.inclusao.SubClasseB;
import br.edu.iesb.poo2023.polimorfismo.inclusao.SubClasseC;
import br.edu.iesb.poo2023.polimorfismo.parametrico.ExecutaPolimorfismoParametrico;
import br.edu.iesb.poo2023.polimorfismo.sobrecaga.PolimorfismoSobrecarga;

/*
*
Instituição: IESB
Disciplina:  Programação Orientada a Objetos (POO)
Objetivo:    Fornecer conhecimentos e prática em desenvolvimento POO.
Professor:   Bruno Miranda [bruno.marcos@iesb.edu.br]
Data:        Nov2023

# Prática: Padrões de Projeto em Java
*/

public class Main {

	public Main() {	}

	public static void main(String[] args) {
				
		// Exemplo do uso do "Polimorfismo paramétrico"
		ExecutaPolimorfismoParametrico pParametrico = new ExecutaPolimorfismoParametrico();
		pParametrico.executar();
		// ---------------------------------------------------------------------
		
		// Exemplo do uso do "Polimorfismo de inclusão"		
		PolimorfismoInclusao pInclusao = new PolimorfismoInclusao();
		pInclusao.executarOperacao(new ClasseMae()); 
		pInclusao.executarOperacao(new SubClasseC()); 
		pInclusao.executarOperacao(new SubClasseB());
		// ---------------------------------------------------------------------

		// Exemplo do uso do "Polimorfismo de sobrecarga (Overloading)"
		PolimorfismoSobrecarga pSobrecarga = new PolimorfismoSobrecarga();
		pSobrecarga.soma(3.5, 5.9);      // parâmetros double
		pSobrecarga.soma(10, 100);       // parâmetros int
		pSobrecarga.soma("26", "26");    // parâmetros String
		
		// Exemplo do uso do "Polimorfismo de substituição (Overriding)"
		ClasseMae mae = new ClasseMae();
		mae.executar();       // método original na classe mãe
		
		SubClasseA filhaA = new SubClasseA();
		filhaA.executar();    // método sobrescrito na classe filha A
		
		SubClasseB filhaB = new SubClasseB();
		filhaB.executar();    // método sobrescrito na classe filha B
		
		SubClasseC filhaC = new SubClasseC();
		filhaC.executar();    // método sobrescrito na classe filha C		
	}
}
