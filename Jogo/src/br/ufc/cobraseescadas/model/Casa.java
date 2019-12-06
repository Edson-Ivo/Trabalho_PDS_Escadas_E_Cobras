package br.ufc.cobraseescadas.model;

public abstract class Casa{
	
	private int numero;
	// Tirei os eixos ;)
	
	public void efeitoCasa(Player p){
	}
	public void inserirCasaEspecial(Casa c){
	}
	
	Casa(int numero){
		this.numero=numero;
	}
	 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


}
