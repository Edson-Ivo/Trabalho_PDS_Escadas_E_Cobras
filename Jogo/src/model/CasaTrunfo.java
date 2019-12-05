package model;

import javax.swing.JOptionPane;

public class CasaTrunfo extends Casa{
	
	private Carta c;
	private int valorCarta;
	
	public CasaTrunfo(int numero, double x, double y) {
		super(numero, x, y);
		this.c=new Carta();
	}
	
	@Override
	public void efeitoCasa(Player p){
		System.out.println("Voce pisou em uma trunfo");
		int num = p.getPosicao().getNumero();
		int carta=c.SortearCarta();
		this.valorCarta=carta;
		if(carta<0) {
			JOptionPane.showMessageDialog(null, "Vish, que azar, vai ter que voltar "+carta*-1+" casas");
			System.out.println("vish, que azar, vai voltar "+carta*-1+" casas");
		}else if(carta>0){
			JOptionPane.showMessageDialog(null, "Casa da sorte! Vai andar "+carta+" casas");
			System.out.println(" que sorte! Vai andar "+carta+" casas");
		}
		if(num<=97 && num>=3) {
		Casa c=Tabuleiro.getInstance().getCasas().get(num+carta-1);
		p.setPosicao(c);
		JOptionPane.showMessageDialog(null, "Você vai para a casa "+c.getNumero());
		System.out.println("vc vai para a casa "+c.getNumero());
		p.getPosicao().efeitoCasa(p);
		}else {
			System.out.println("Mude a posicao da casa Trunfo");
		}	
	}
	

}
