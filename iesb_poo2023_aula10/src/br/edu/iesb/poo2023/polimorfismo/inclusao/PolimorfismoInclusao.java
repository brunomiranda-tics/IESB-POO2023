package br.edu.iesb.poo2023.polimorfismo.inclusao;

public class PolimorfismoInclusao {

	public PolimorfismoInclusao() {
		// TODO Auto-generated constructor stub
	}

	// Exemplo sem usar polimorfismo
	public void executarOperacao(ClasseA classeA) {
		classeA.executar();
	}
	
	public void executarOperacao(ClasseB classeB) {
		classeB.executar();
	}
	
	// Exemplo usando polimorfismo
	public void executarOperacao(ClasseMae classeMae) {
		classeMae.executar();
	}
}
