package br.edu.iesb.poo2023;

public class ManipulaArrays {

	public ManipulaArrays() {
		// TODO Auto-generated constructor stub
	}

	public void criarArrayTipoPrimitivo() {
		
		String[] strings = {"", "", ""};
		System.out.println("Size array de strings:" + strings.length);
		
		int[] ints = new int[3];
		//intArray = new int[20];
	    ints[0] = 0;
	    ints[1] = 1;
	    ints[2] = 2;
	    //ints[3] = 3;
	    
	    // imprime o endereço de memória do array
	    System.out.println(ints);
	    
	    // imprime a Classe do array por padrão
	    System.out.println(ints.getClass());
	    
	    // imprime o tamanho do array
	    System.out.println(ints.length);
	    
	    int[] intsClone = ints.clone();
	    	    
	    
	}

	public void criarArrayTipoObjeto() {
		ObjetoVO[] objetoVOs = new ObjetoVO[10];
		objetoVOs[0] = new ObjetoVO(); 
		
		ObjetoVO[] objetoVOs2 = {new ObjetoVO()};
		
		
		
	}
}
