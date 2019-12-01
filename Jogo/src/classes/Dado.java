package classes;

import java.util.Random;

public class Dado {
	
	int d12;
	
	public int rolarDado() {
		Random random = new Random(); 
		this.d12=random.nextInt(12);
		return this.d12;
	}
	

}
