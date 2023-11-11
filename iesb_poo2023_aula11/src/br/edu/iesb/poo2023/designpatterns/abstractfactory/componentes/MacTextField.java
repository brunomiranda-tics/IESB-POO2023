package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class MacTextField implements TextField {

	public MacTextField() {	}

	@Override
	public void desenhar() {	
		System.out.println("MacTextField criado...");
	}

}
