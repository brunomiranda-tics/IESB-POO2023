package br.edu.iesb.poo2023.polimorfismo.inclusao;

public class SubClasseA extends ClasseMae {

	public SubClasseA() {}

	@Override
	public void executar() {
		System.out.println(this.getClass());
	}	
}
