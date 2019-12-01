package classes;

import interfaces.ICasa;
import interfaces.IEspecialCasa;

public class Escada implements IEspecialCasa{
	
	ICasa casa1;
	ICasa casa2;
	
	@Override
	public void casa1(ICasa casa) {
		this.casa1=casa;
		
	}
	@Override
	public void casa2(ICasa casa) {
		this.casa2=casa;
		
	}

}
