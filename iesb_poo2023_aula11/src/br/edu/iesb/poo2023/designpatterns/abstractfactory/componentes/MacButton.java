package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class MacButton implements Button {

	public MacButton() {}

	@Override
	public void desenhar() {
		System.out.println("MacButton criado...");
	}

}
