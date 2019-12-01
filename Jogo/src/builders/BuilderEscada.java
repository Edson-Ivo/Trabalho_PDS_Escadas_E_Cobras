package builders;

import classes.Escada;
import interfaces.ICasa;
import interfaces.IEspecialCasa;
import interfaces.IEspecialCasaBuilder;

public class BuilderEscada implements IEspecialCasaBuilder{

private IEspecialCasa casaEsp;
	
	public BuilderEscada() {
		this.casaEsp=new Escada();
	}
	
	public static BuilderEscada builder() {
		return new BuilderEscada();
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
