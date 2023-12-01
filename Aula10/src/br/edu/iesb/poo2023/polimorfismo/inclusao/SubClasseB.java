package br.edu.iesb.poo2023.polimorfismo.inclusao;

public class SubClasseB extends ClasseMae {

	public SubClasseB() {}

	@Override
	public void executar() {
		System.out.println(this.getClass());
	}	
}
