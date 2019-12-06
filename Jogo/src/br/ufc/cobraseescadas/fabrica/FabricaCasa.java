package br.ufc.cobraseescadas.fabrica;

import br.ufc.cobraseescadas.interfaces.IFabricaCasa;
import br.ufc.cobraseescadas.model.Casa;
import br.ufc.cobraseescadas.model.CasaNormal;
import br.ufc.cobraseescadas.model.CasaTrunfo;
import br.ufc.cobraseescadas.model.Cobra;
import br.ufc.cobraseescadas.model.Escada;

public class FabricaCasa implements IFabricaCasa{

	@Override
	public Casa criarCasa(String tipo, int numero) {
		switch(tipo) {
		case "cobra": return new Cobra(numero);
		case "escada":return new Escada(numero);
		case "trunfo":return new CasaTrunfo(numero);
		default: return new CasaNormal(numero);
		}
	}

}

