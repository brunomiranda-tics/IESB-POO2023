package br.edu.iesb.poo2023.designpatterns.abstractfactory;

import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Button;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Checkbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.TextField;

public interface GUIFactory {

	public Button createButton();
	public Checkbox createCheckbox();
	public TextField createTextField();
	
}
