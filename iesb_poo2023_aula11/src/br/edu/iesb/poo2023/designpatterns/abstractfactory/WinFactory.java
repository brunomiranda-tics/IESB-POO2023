package br.edu.iesb.poo2023.designpatterns.abstractfactory;

import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Button;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Checkbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.TextField;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.WindowsButton;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.WindowsCheckbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.WindowsTextField;

public class WinFactory implements GUIFactory {

	public WinFactory() {}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

	@Override
	public TextField createTextField() {	
		return new WindowsTextField();
	}	
}
