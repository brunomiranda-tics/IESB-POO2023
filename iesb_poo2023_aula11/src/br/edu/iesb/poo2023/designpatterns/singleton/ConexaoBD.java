package br.edu.iesb.poo2023.designpatterns.singleton;

public class ConexaoBD {

	private static ConexaoBD instance = null;
	public String valor;
	
	private ConexaoBD(String valor) {
		this.valor = valor;
	}
	
	public static ConexaoBD getInstance(String valor) {		
		if (instance == null)
			instance = new ConexaoBD(valor);
		
		// aqui entrará a sua conexão com os recursos do BD
		/* 
		 * algoritmo de conexao ao BD.
		 * 
		 * */ 		
		return instance;
	}

}
