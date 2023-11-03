package br.edu.iesb.poo2023.polimorfismo.sobrecaga;

public class PolimorfismoSobrecarga {

	public PolimorfismoSobrecarga() {
		// TODO Auto-generated constructor stub
	}

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
