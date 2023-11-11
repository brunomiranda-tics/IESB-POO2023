package br.edu.iesb.poo2023.designpatterns.abstractfactory;

import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Button;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.Checkbox;
import br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes.TextField;

public class App {

	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;
	private TextField textField;
	
	public App(GUIFactory factory) {
		this.factory = factory;
	}

	public void criarUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
		this.textField = factory.createTextField();
	}
	
	public void desenharGUI() {
		this.button.desenhar();
		this.checkbox.desenhar();
		this.textField.desenhar();
	}	
}
