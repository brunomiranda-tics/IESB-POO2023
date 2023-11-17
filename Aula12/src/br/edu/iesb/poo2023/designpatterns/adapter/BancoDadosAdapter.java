package br.edu.iesb.poo2023.designpatterns.adapter;

import java.sql.ResultSet;

import br.edu.iesb.poo2023.designpatterns.adapter.libfornecedor.IQueryResultLibFornecedorBD;
import br.edu.iesb.poo2023.designpatterns.adapter.libfornecedor.LibFornecedorBD;

public class BancoDadosAdapter implements IBancoDadosUtil {

	private LibFornecedorBD dbBiblioteca; 
	
	public BancoDadosAdapter(LibFornecedorBD dbBiblioteca) {
		this.dbBiblioteca = dbBiblioteca;
	}

	// Nossos códigos adptados
	
	@Override
	public void conectar(String url, String usuario, String senha) {

		// Vejam essa tradução de métodos
		this.dbBiblioteca.connect(url, usuario, senha);		
	}

	@Override
	public void desconectar() {
		
		//Vejam essa tradução de métodos
		this.dbBiblioteca.disconnect();		
	}

	@Override
	public ResultSet executarQuery(String query) {
		//Vejam essa tradução de métodos
		IQueryResultLibFornecedorBD resultLibFornecedorBD = 
				this.dbBiblioteca.execute(query);
		
		ResultSet novoResultSet = null;
		novoResultSet = converterQueryResultToResultSet(resultLibFornecedorBD);
		
		return novoResultSet;
	}

	private ResultSet converterQueryResultToResultSet(
			IQueryResultLibFornecedorBD result) {
		
		// Aqui podemos converter as interfaces
		// QueryResult para ResultSet
		ResultSet novoResultSet = null;
		
		return novoResultSet;
	}	
}
