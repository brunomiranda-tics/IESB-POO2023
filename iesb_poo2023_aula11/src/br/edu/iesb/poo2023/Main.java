package br.edu.iesb.poo2023;

/*
*
Instituição: IESB
Disciplina:  Programação Orientada a Objetos (POO)
Objetivo:    Fornecer conhecimentos e prática em desenvolvimento POO.
Professor:   Bruno Miranda [bruno.marcos@iesb.edu.br]
Data:        Nov2023

# Prática: Padrões de Projeto em Java
*/

import br.edu.iesb.poo2023.designpatterns.abstractfactory.App;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.AppConfigurator;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.GUIFactory;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.IConfigSO;
import br.edu.iesb.poo2023.designpatterns.singleton.ConexaoBD;

public class Main {

	public Main() {	}

	public static void main(String[] args) throws Exception {
		
		/* Design Pattern: Singleton */
		
		// Opção 1: não é possível, pois o construtor não está visível
		//ConexaoBD conn = new ConexaoBD();
				
		// Opção 2: utilizar o método de instância
		
		// Cria diversas conexões do objeto desejado
		ConexaoBD conn1 = ConexaoBD.getInstance("Primeira conexao");
		ConexaoBD conn2 = ConexaoBD.getInstance("Segunda conexao");
		ConexaoBD conn3 = ConexaoBD.getInstance("Terceira conexao");
		
		// Vamos testar o objeto Singleton?		
		System.out.println(conn1.valor);
		System.out.println(conn2.valor);
		System.out.println(conn3.valor);
			
		/* ------------------------------------------------------------ */
		
		/* Design Pattern: Abstract Factory */
		GUIFactory factory = null;
		AppConfigurator configurator = new AppConfigurator();
		App app = null;
		
		//factory = configurator.getConfiguracaoApp(IConfigSO.SO_MAC);
		//app = new App(factory);
		
		// cria a interface da aplicação (GUI)
		//app.criarUI();
		
		// desenha os componentes da tela
		//app.desenharGUI();
		/* ------------------------------------------------------------ */

	}
}
