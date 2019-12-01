package builders;

import classes.Cobra;
import interfaces.ICasa;
import interfaces.IEspecialCasa;
import interfaces.IEspecialCasaBuilder;

public class BuilderCobra implements IEspecialCasaBuilder{
	
	private IEspecialCasa casaEsp;
	
	public BuilderCobra() {
		this.casaEsp=new Cobra();
	}
	
	public static BuilderCobra builder() {
		return new BuilderCobra();
	}

	@Override
	public IEspecialCasaBuilder casa1(ICasa casa) {
		this.casaEsp.casa1(casa);
		return this;
	}

	@Override
	public IEspecialCasaBuilder casa2(ICasa casa) {
		this.casaEsp.casa2(casa);
		return this;
	}

	@Override
	public IEspecialCasa get() {
		// TODO Auto-generated method stub
		return this.casaEsp;
	}

	

}
