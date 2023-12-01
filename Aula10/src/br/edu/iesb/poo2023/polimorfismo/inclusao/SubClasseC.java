package br.edu.iesb.poo2023.polimorfismo.inclusao;

public class SubClasseC extends ClasseMae {

	public SubClasseC() {}

	@Override
	public void executar() {
		super.executar();
		System.out.println(this.getClass());
	}
	
	

}
