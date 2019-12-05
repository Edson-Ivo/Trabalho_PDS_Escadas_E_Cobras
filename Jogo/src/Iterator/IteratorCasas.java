package Iterator;

import java.util.ArrayList;

import interfaces.Iterator;
import model.Casa;

public class IteratorCasas implements Iterator<Object>{
	
	private ArrayList<Casa> casas;
	private int posicao=0;

	public IteratorCasas(ArrayList<Casa> casas){
		this.casas=casas;
	}
	
	@Override
	public boolean hasNext() {
		if(this.posicao>=this.casas.size() || this.casas.get(this.posicao)==null) {
			return false;	
		}
		return true;
	}

	@Override
	public Casa next() {
		if(this.posicao>=this.casas.size() || this.casas.get(this.posicao)==null) {
			this.posicao=0;
		}
		Casa c = this.casas.get(this.posicao);
		posicao++;
		return c;
	}

}
