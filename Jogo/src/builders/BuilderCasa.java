package builders;

import classes.Casa;
import interfaces.ICasa;
import interfaces.ICasaBuilder;

public class BuilderCasa implements ICasaBuilder{
	
	private ICasa casa;
	
	public BuilderCasa() {
		this.casa=new Casa();
	}
	
	public static BuilderCasa builder() {
		return new BuilderCasa();
	}

	@Override
	public ICasaBuilder darNumero(int num) {
		this.casa.darNumero(num);
		return this;
	}

	@Override
	public ICasa get() {
		// TODO Auto-generated method stub
		return this.casa;
	}
	

}
