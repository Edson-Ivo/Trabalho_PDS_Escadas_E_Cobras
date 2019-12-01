package classes;

import java.util.ArrayList;

import interfaces.ICasa;
import interfaces.Iterator;

public class Tabuleiro {
	
	private static Tabuleiro tabuleiro = new Tabuleiro();
	
	ArrayList<ICasa> casas = new ArrayList<ICasa>();
	int quantidade_casa;

	private Tabuleiro() {
	}
	
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	public void inserirCasas(ArrayList<ICasa> icasa) {
		this.casas=icasa;
	}
	
	public ArrayList<ICasa> getCasas() {
		return this.casas;
	}
	

}

