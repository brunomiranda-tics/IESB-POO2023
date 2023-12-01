package br.edu.iesb.poo2023.polimorfismo.inclusao;

public class PolimorfismoInclusao {

	public PolimorfismoInclusao() {	}

	// Exemplo sem usar polimorfismo
	/*
	 * Nesse caso, os métodos possuem rigidez os parâmetros.
	 */
	public void executarOperacao(ClasseA classeA) {
		classeA.executar();
	}
	
	public void executarOperacao(ClasseB classeB) {
		classeB.executar();
	}
	// --------------------------------------------------------------
	
	// Exemplo usando polimorfismo de inclusão
	/*
	 * Nesse caso, os métodos não possuem rigidez os parâmetros,
	 * ou seja, podem receber qualquer variável do tipo mãe ou filha
	 * na estrutura de classes.
	 */
	public void executarOperacao(ClasseMae classeMae) {
		classeMae.executar();
	}
}
