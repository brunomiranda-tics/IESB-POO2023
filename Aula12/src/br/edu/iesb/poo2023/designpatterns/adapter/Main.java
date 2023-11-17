package br.edu.iesb.poo2023.designpatterns.adapter;

import java.sql.ResultSet;

import br.edu.iesb.poo2023.designpatterns.adapter.libfornecedor.LibFornecedorBD;

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

	public Main() { }

	public static void main(String[] args) {

		// Vamos criar a biblioteca externa
		LibFornecedorBD libFornecedorBD = new LibFornecedorBD();
		
		// Vamos criar o Adaptador para a biblioteca externa
		IBancoDadosUtil bancoDadosUtil = new BancoDadosAdapter(libFornecedorBD);
		
		// Vamos conectar ao banco de dados utilizando o Adaptador
		bancoDadosUtil.conectar("jdbc:mysql://127.0.0.1:3306/iesb_datalab", 
				"aluno_poo", "poo2023");
		
		// Vamos agora fazer a nossa consulta ao bd!
		String query = "select * from Alunos";
		ResultSet resultSet = bancoDadosUtil.executarQuery(query);
		
		// Trabalho executado, vamos desconectar do bd.
		bancoDadosUtil.desconectar();
	}
}
