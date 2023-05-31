package br.edu.ifba.lista;

import br.edu.ifba.basicas.Celula;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;

	private int totalElementos = 0;

	public void adicionarNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeiro, elemento);
		this.primeiro = nova;

		if (this.totalElementos == 0) {
			this.ultimo = nova;
		}

		this.totalElementos++;
	}

	public void adiciona(Object elemento) {
		if (this.totalElementos == 0) {
			adicionarNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultimo.setProxima(nova);
			this.ultimo = nova;
			this.totalElementos++;

		}

	}

	public void adicionarPorPosicao(Object elemento, int posicao) {

		Celula aux = this.primeiro;

		if (posicao > this.totalElementos || posicao < 0) {
			throw new IllegalArgumentException("Posicao fora dos limites!");
		}
		if (posicao == 0) {
			adicionarNoComeco(elemento);
		} else {
			for (int cont = 0; cont < posicao - 1; cont++) {
				aux = aux.getProxima();
			}

			Celula nova = new Celula(aux.getProxima(), elemento);
			aux.setProxima(nova);
			this.totalElementos++;
		}

	}

	public void listar() {

		Celula aux = this.primeiro;
		for (int cont = 0; cont < this.totalElementos - 1; cont++) {
			System.out.print(aux.getElemento() + " - ");
			aux = aux.getProxima();
		}
		System.out.println(aux.getElemento());

	}
	
	public void removerInicio() {
		
		Celula remove = this.primeiro;
		this.primeiro = this.primeiro.getProxima();
		remove.setProxima(null);
		this.totalElementos--;
	}
	
	public void removerFinal() {
		
		Celula anterior = this.primeiro;
		
		for(int cont=0;cont<this.totalElementos-2;cont++) {
			anterior = anterior.getProxima();
		}
			
		anterior.setProxima(null);
		this.ultimo = anterior;
		
		this.totalElementos--;
		
	}
	
	public void removerPorPosicao(int posicao) {
		
		Celula anterior = this.primeiro;
		
		for(int cont=0; cont<posicao-1;cont++) {
			anterior = anterior.getProxima();
		}

		anterior.setProxima(anterior.getProxima().getProxima());
		
		this.totalElementos--;
	}
	
	
	
	

}
