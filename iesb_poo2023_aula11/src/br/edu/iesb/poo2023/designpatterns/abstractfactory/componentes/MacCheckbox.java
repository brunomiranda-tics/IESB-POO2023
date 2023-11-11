package br.edu.iesb.poo2023.designpatterns.abstractfactory.componentes;

public class MacCheckbox implements Checkbox {

	public MacCheckbox() {}

	@Override
	public void desenhar() {
		System.out.println("MacCheckbox criado...");		
	}	
}
