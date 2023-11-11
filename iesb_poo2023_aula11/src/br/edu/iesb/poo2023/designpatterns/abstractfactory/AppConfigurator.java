package br.edu.iesb.poo2023.designpatterns.abstractfactory;

import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.IConfigSO;

public class AppConfigurator {

	public AppConfigurator() {}

	public GUIFactory getConfiguracaoApp(String nomeSistemaOperacional) 
			throws Exception {
		
		GUIFactory factory = null;
		
		if (nomeSistemaOperacional == null || 
				nomeSistemaOperacional.equals("")) {
			
			throw new Exception("Erro! SO nao identificado!");
		}
		
		if (nomeSistemaOperacional.equals(IConfigSO.SO_WINDOWS)) {
			factory = new WinFactory();
		} else if(nomeSistemaOperacional.equals(IConfigSO.SO_MAC)) {
			factory = new MacFactory();
		}
				
		return factory;
	}
}
