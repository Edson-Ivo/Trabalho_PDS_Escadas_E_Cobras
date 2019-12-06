package br.ufc.cobraseescadas.model;

public class Player {
	
	private String nome;
	//private int ordem;
	private Casa posicao;
	
	public Player(String nome) {
		this.nome=nome;
		this.posicao=Tabuleiro.getInstance().getCasas().get(0);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Casa getPosicao() {
		return posicao;
	}
	public void setPosicao(Casa posicao) {
		this.posicao = posicao;
	}
	@Override
	public String toString() {
		return "Player [nome=" + nome + ", posicao=" + posicao + "]";
	}
    
    
    
}
