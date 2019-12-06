package br.ufc.cobraseescadas.model;

public class CasaNormal extends Casa{

	public CasaNormal(int numero) {
		super(numero);
	}
	
	@Override
	public void efeitoCasa(Player p){
		p.setPosicao(p.getPosicao());
	}

}
