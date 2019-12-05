package model;

import javax.swing.JOptionPane;

public class Cobra extends Casa{
	
	private Casa rabo;

	public Cobra(int numero, double x, double y) {
		super(numero, x, y);
	}
	
	@Override
	public void inserirCasaEspecial(Casa c){
		this.rabo=c;
	}
	
	@Override
	public void efeitoCasa(Player p){
		p.setPosicao(rabo);
		JOptionPane.showMessageDialog(null, "Voce pisou em uma Cobra, vc vai para a casa "+rabo.getNumero());
		System.out.println("Voce pisou em uma Cobra, vc vai para a casa "+rabo.getNumero());
		rabo.efeitoCasa(p);
	}
	
	
}
