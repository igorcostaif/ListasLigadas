package br.edu.ifba.principal;

import br.edu.ifba.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista();
		l.adicionarNoComeco("Igor");
		l.adicionarNoComeco("Fulano");
		l.adicionarNoComeco("Sicrano");
		l.adicionarNoComeco("Beltrano");
		l.adiciona("Coisinha");
		l.adicionarPorPosicao("Bichinho", 1);
		
		l.listar();
		l.removerFinal();
		
		l.listar();
		
		l.adiciona("Teste");
		
		l.listar();
		
		l.removerPorPosicao(3);
		
		l.listar();
	}

}
