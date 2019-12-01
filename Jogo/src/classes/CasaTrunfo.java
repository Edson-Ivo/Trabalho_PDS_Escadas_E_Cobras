package classes;

import interfaces.ICasa;
import interfaces.ICasaTrunfo;

public class CasaTrunfo implements ICasaTrunfo{
	
	ICasa icasa;

	@Override
	public void inserirCasa(ICasa icasa) {
		this.icasa=icasa;
		
	}

}
