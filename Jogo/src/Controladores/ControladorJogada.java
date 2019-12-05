package Controladores;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import Iterator.IteratorCasas;
import Iterator.IteratorJogadores;
import interfaces.Iterator;
import model.Casa;
import model.Dado;
import model.Player;
import model.Tabuleiro;

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
		
		//System.out.println(num);
		num+=this.dado;
		//System.out.println(num);
		
		if(num==100) {
			return p;
		}else if(num>100) {
			num=num-this.dado;
//			System.out.println("precisa tirar os exatos 100");
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
	
	
	

	
	

}
