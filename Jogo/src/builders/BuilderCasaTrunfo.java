package builders;

import classes.CasaTrunfo;
import interfaces.ICasa;

import interfaces.ICasaTrunfo;
import interfaces.ICasaTrunfoBuilder;

public class BuilderCasaTrunfo implements ICasaTrunfoBuilder{

private ICasaTrunfo casa;
	
	public BuilderCasaTrunfo() {
		this.casa=new CasaTrunfo();
	}
	
	public static BuilderCasaTrunfo builder() {
		return new BuilderCasaTrunfo();
	}

	@Override
	public ICasaTrunfoBuilder inserirCasa(ICasa icasa) {
		this.casa.inserirCasa(icasa);
		return this;
	}

	@Override
	public ICasaTrunfo get() {
		// TODO Auto-generated method stub
		return this.casa;
	}

}
