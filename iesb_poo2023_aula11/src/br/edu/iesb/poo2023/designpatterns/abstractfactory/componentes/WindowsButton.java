package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class WindowsButton implements Button {

	public WindowsButton() {}

	@Override
	public void desenhar() {
		System.out.println("WindowsButton criado...");
	}
}
