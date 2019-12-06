package br.ufc.cobraseescadas.Controladores;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.ufc.cobraseescadas.Iterator.IteratorCasas;
import br.ufc.cobraseescadas.Iterator.IteratorJogadores;
import br.ufc.cobraseescadas.interfaces.Iterator;
import br.ufc.cobraseescadas.model.Casa;
import br.ufc.cobraseescadas.model.Dado;
import br.ufc.cobraseescadas.model.Player;
import br.ufc.cobraseescadas.model.Tabuleiro;

public class ControladorJogada {
	
	private IteratorJogadores iteratorJogadores;
	private IteratorCasas iteratorCasas;
	private Player jogadorAtual;
	private int dado;
	
	
	public ControladorJogada(ArrayList<Player> p) {
		iteratorJogadores=new IteratorJogadores(p);
		jogadorAtual=iteratorJogadores.next();
		iteratorCasas = new IteratorCasas(Tabuleiro.getInstance().getCasas());
	}
	
	public int jogarDado() {
		this.dado=Dado.getInstance().rolarDado();
		return dado;
	}
	
	public Player jogada() {
//		System.out.println(jogadorAtual.toString());
		
		Player p=jogadorAtual;
		Casa c= jogadorAtual.getPosicao();
		
		int num= c.getNumero();
		if(num==100) {
			return p;
		}	
		num+=this.dado;		
		if(num==100) {
			
			c = iteratorCasas.next();			
			p=jogadorAtual;
			jogadorAtual.setPosicao(c);
			
			return p;
			
		}else if(num>100) {
			
			num=num-this.dado;
			JOptionPane.showMessageDialog(null, " Você precisa cair na casa 100 para ganhar");
			jogadorAtual=iteratorJogadores.next();
			
			return p;
		
		}
			c = iteratorCasas.next();
			while(c.getNumero()!=num) {
				c=iteratorCasas.next();	
			}		
			jogadorAtual.setPosicao(c);
			c.efeitoCasa(jogadorAtual);
			p=jogadorAtual;
			jogadorAtual=iteratorJogadores.next();
			
			return p;
	}
	
	
	public Player getJogadorAtual() {
		return this.jogadorAtual;
	}
	
	

	
	

}
