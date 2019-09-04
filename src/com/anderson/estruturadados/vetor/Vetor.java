package com.anderson.estruturadados.vetor;

public class Vetor {
	
	// atributos
	private String[] elementos;
	private int tamanho;
	
	// construtor irá inicializar o vetor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 1
	// forma simples de adicionar um elememnto no vetor
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	// Esse algoritmo fuciona mas não é muito eficiente para vetores muito grandes
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 2
	/*public void adiciona(String elemento) throws Exception {
		
		if(tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor está cheio, não é possível adicionar mais elementos");
		}
	}*/
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 3 (melhor opção)
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
}