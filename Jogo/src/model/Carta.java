package model;

import java.util.Random;

import interfaces.ICarta;

public class Carta implements ICarta{

	@Override
	public int SortearCarta() {
		Random random = new Random(); 
		int s=random.nextInt(3)+1;
		if(s>2) {
			int azar=random.nextInt(2)+1;
			azar=azar*-1;
			return azar;
		}
		int sorte=random.nextInt(2)+1;
		return sorte;		
	}

}
