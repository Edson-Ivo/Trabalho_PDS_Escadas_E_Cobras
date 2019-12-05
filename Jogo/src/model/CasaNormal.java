package model;

public class CasaNormal extends Casa{

	public CasaNormal(int numero, double x, double y) {
		super(numero, x, y);
	}
	
	@Override
	public void efeitoCasa(Player p){
		p.setPosicao(p.getPosicao());
	}

}
