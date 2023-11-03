package br.edu.iesb.poo2023;

import java.util.ArrayList;

public class ManipulaArrayList {

	public ManipulaArrayList() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList cadastrar(ArrayList lista, String nome) {
		
		if (lista != null)
			lista.add(nome);			
				
		return lista;
	}
	
	public ArrayList<ObjetoVO> cadastrar(ArrayList<ObjetoVO> lista, 
			ObjetoVO vo) {
		
		if (lista != null)
			lista.add(vo);			
		
		return lista;
	}
}
