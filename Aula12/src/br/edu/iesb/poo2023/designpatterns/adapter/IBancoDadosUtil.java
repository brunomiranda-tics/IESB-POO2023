package br.edu.iesb.poo2023.designpatterns.adapter;

import java.sql.ResultSet;

public interface IBancoDadosUtil {

	public void conectar(String url, String usuario, String senha);
	public void desconectar();
	public ResultSet executarQuery(String query);
}
