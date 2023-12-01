package br.edu.iesb.poo2023.polimorfismo.sobrecaga;

public class PolimorfismoSobrecarga {

	public PolimorfismoSobrecarga() {}

	// Exemplo do uso do "Polimorfismo paramétrico"
	/*
	 * Observem que todos os métodos possuem o mesmo nome,
	 * porém, possuem assinaturas diferentes.
	 * 
	 */
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public int soma(String num1, String num2) {
		return (Integer.parseInt(num1) + Integer.parseInt(num2));
	}
}
