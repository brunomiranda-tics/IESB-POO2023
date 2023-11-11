package br.edu.iesb.poo2023.designpatterns.abstractfactory;

import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Button;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Checkbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.MacButton;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.MacCheckbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.MacTextField;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.TextField;

public class MacFactory implements GUIFactory {

	public MacFactory() {}

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

	@Override
	public TextField createTextField() {	
		return new MacTextField();
	}	
}
