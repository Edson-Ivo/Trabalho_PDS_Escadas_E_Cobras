package jogo;

import java.util.ArrayList;
import java.util.Random;

import Controladores.ControladorJogada;
import model.Player;

public class Teste {

	public static void main(String[] args) {
		
		boolean x=true;
		ArrayList<Player> jogadores=new ArrayList<Player>();
		Player p1=new Player("jorge");
		Player p2=new Player("and");
		Player p3=new Player("tutu");
		jogadores.add(p1);
		jogadores.add(p2);
		jogadores.add(p3);
		ControladorJogada m = new ControladorJogada(jogadores);
		while(x) {
			
			
			x=m.jogada();
			

		}

	}

}

