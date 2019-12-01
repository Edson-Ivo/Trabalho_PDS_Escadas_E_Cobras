package classes;

import interfaces.ICasa;

public class Player {
	
	String nome;
    ICasa posicao;
    
   
    void inserirPosicao(ICasa posicao) {
    	this.posicao=posicao;
    }
    
}
