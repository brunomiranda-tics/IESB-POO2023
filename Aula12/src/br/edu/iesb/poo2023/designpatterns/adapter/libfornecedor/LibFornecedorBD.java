package br.edu.iesb.poo2023.designpatterns.adapter.libfornecedor;

import java.sql.ResultSet;

public class LibFornecedorBD {

	public LibFornecedorBD() {}

	public void connect(String url, String user, String password) {
		// codigo do fornecedor da biblioteca
	}
	
	public void disconnect() {
		// codigo do fornecedor da biblioteca
	}
	
	public IQueryResultLibFornecedorBD execute(String query) {
		// codigo do fornecedor da biblioteca		
		
		return null;
	}	
}
