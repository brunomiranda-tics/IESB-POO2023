package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class WindowsCheckbox implements Checkbox {

	public WindowsCheckbox() {}

	@Override
	public void desenhar() {
		System.out.println("WindowsCheckbox criado...");
	}
}
