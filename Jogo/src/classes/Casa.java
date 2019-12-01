package classes;

import interfaces.ICasa;
import interfaces.Iterator;;



public class Casa implements ICasa{
	
	int numero;

	@Override
	public void darNumero(int num) {
		this.numero=num;
	}

	@Override
	public int mostarNumero() {
		return this.numero;
	}

}
