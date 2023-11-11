package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class WindowsTextField implements TextField {

	public WindowsTextField() {	}

	@Override
	public void desenhar() {
		System.out.println("WindowsTextField criado...");
	}
}
