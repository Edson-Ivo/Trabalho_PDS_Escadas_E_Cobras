package br.ufc.cobraseescadas.Controladores;

import java.util.ArrayList;

import br.ufc.cobraseescadas.model.Player;

public class ControladorJogador {
	
	private static ControladorJogador controladorJogador=new ControladorJogador();
	private ArrayList<Player> jogadores=new ArrayList<Player>();
	private int quantidadeJogadores;
	
	private ControladorJogador() {
	}
	public static ControladorJogador getInstance() {
		return controladorJogador;
	}
	
	public void cadastrarJogador(Player p) {
		jogadores.add(p);
	}

	public ArrayList<Player> getJogadores() {
		return jogadores;
	}

	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}

	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	
	
	
	
}
