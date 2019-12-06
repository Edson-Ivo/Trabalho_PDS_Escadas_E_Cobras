package br.ufc.cobraseescadas.model;

import javax.swing.JOptionPane;

public class Escada extends Casa{
	
	private Casa topo;

   public Escada(int numero) {
		super(numero);
	}
	
	@Override
	public void inserirCasaEspecial(Casa c){
		this.topo=c;
	}
	
	@Override
	public void efeitoCasa(Player p){
		p.setPosicao(topo);
		JOptionPane.showMessageDialog(null, "Voce pisou em uma escada, vc vai para a casa "+topo.getNumero());
		System.out.println("Voce pisou em uma escada, vc vai para a casa "+topo.getNumero());
		topo.efeitoCasa(p);
	}

}
