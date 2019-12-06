package br.ufc.cobraseescadas.model;

import java.util.Random;

public class Dado {

	private static Dado dado = new Dado();
	private int d12;
	
	private Dado() {}
	
	public static Dado getInstance() {
		return dado;
	}
	
	public int rolarDado() {
		Random random = new Random(); 
		this.d12=random.nextInt(11);
		return this.d12+1;
	}
	

}
