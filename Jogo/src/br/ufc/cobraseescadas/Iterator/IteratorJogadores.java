package br.ufc.cobraseescadas.Iterator;

import java.util.ArrayList;

import br.ufc.cobraseescadas.interfaces.Iterator;
import br.ufc.cobraseescadas.model.Player;

public class IteratorJogadores implements Iterator<Object>{
	
	ArrayList<Player> jogadores;
	int posicao=0;
	
	public IteratorJogadores(ArrayList<Player> jogadores){
		this.jogadores=jogadores;
	}
	
	@Override
	public boolean hasNext() {
		if(this.posicao>=this.jogadores.size() || this.jogadores.get(this.posicao)==null) {
			return false;	
		}
		return true;
	}

	@Override
	public Player next() {
		if(this.posicao>=this.jogadores.size() || this.jogadores.get(this.posicao)==null) {
			this.posicao=0;
		}
		Player j=this.jogadores.get(this.posicao);
		posicao++;
		return j;
	}

}
