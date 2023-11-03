package br.edu.iesb.poo2023.polimorfismo.parametrico;

import java.util.Iterator;
import java.util.List;

public class PolimorfismoParametrico {

	public PolimorfismoParametrico() {
		// TODO Auto-generated constructor stub
	}

	public <T> void executar(List<T> lista) {		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			System.out.println(t);			
		}		
	}
}
