package view;

import br.edu.fateczl.arvoreint.Arvore;

public class Principal {

	public static void main(String[] args) throws Exception{
		int[] vetor = {7,8,3,4,2,1,6,5};
		Arvore arvore = new Arvore();
		for(int i: vetor) {
			arvore.insert(i);
		}
		arvore.remove(7);
		arvore.remove(6);
		arvore.prefixSearch();
		System.out.println("");
		arvore.infixSearch();
		System.out.println("");
		arvore.postfixSearch();
	}

}
