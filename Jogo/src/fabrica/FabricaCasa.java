package fabrica;

import interfaces.IFabricaCasa;
import model.Casa;
import model.CasaNormal;
import model.CasaTrunfo;
import model.Cobra;
import model.Escada;

public class FabricaCasa implements IFabricaCasa{

	@Override
	public Casa criarCasa(String tipo, int numero, double x, double y) {
		switch(tipo) {
		case "cobra": return new Cobra(numero,x,y);
		case "escada":return new Escada(numero, x, y);
		case "trunfo":return new CasaTrunfo(numero,x,y);
		default: return new CasaNormal(numero,x,y);
		}
	}

}

