package br.ufc.cobraseescadas.model;

import java.util.ArrayList;

import br.ufc.cobraseescadas.fabrica.FabricaCasa;
import br.ufc.cobraseescadas.interfaces.IFabricaCasa;


public class Tabuleiro{
	
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private ArrayList<Casa> casas = new ArrayList<Casa>();

	private Tabuleiro() {
		IFabricaCasa fabrica = new FabricaCasa(); 
		Casa c1 = fabrica.criarCasa("", 1);
		Casa c2 = fabrica.criarCasa("trunfo", 2);
		Casa c3 = fabrica.criarCasa("escada", 3);
		Casa c4 = fabrica.criarCasa("", 4);
		Casa c5 = fabrica.criarCasa("", 5);
		Casa c6 = fabrica.criarCasa("trunfo", 6);
		Casa c7 = fabrica.criarCasa("", 7);
		Casa c8 = fabrica.criarCasa("escada", 8);
		Casa c9 = fabrica.criarCasa("", 9);
		Casa c10 = fabrica.criarCasa("", 10);
		Casa c11 = fabrica.criarCasa("trunfo", 11);
		Casa c12 = fabrica.criarCasa("", 12);
		Casa c13 = fabrica.criarCasa("", 13);
		Casa c14 = fabrica.criarCasa("", 14);
		Casa c15 = fabrica.criarCasa("", 15);
		Casa c16 = fabrica.criarCasa("trunfo", 16);
		Casa c17 = fabrica.criarCasa("cobra", 17);
		Casa c18 = fabrica.criarCasa("", 18);
		Casa c19 = fabrica.criarCasa("", 19);
		Casa c20 = fabrica.criarCasa("", 20);
		Casa c21 = fabrica.criarCasa("", 21);
		Casa c22 = fabrica.criarCasa("", 22);
		Casa c23 = fabrica.criarCasa("trunfo", 23);
		Casa c24 = fabrica.criarCasa("", 24);
		Casa c25 = fabrica.criarCasa("trunfo", 25);
		Casa c26 = fabrica.criarCasa("", 26);
		Casa c27 = fabrica.criarCasa("", 27);
		Casa c28 = fabrica.criarCasa("escada", 28);
		Casa c29 = fabrica.criarCasa("", 29);
		Casa c30 = fabrica.criarCasa("", 30);
		Casa c31 = fabrica.criarCasa("trunfo", 31);
		Casa c32 = fabrica.criarCasa("", 32);
		Casa c33 = fabrica.criarCasa("", 33);
		Casa c34 = fabrica.criarCasa("", 34);
		Casa c35 = fabrica.criarCasa("trunfo", 35);
		Casa c36 = fabrica.criarCasa("", 36);
		Casa c37 = fabrica.criarCasa("", 37);
		Casa c38 = fabrica.criarCasa("trunfo", 38);
		Casa c39 = fabrica.criarCasa("", 39);
		Casa c40 = fabrica.criarCasa("", 40);
		Casa c41 = fabrica.criarCasa("trunfo", 41);
		Casa c42 = fabrica.criarCasa("", 42);
		Casa c43 = fabrica.criarCasa("", 43);
		Casa c44 = fabrica.criarCasa("", 44);
		Casa c45 = fabrica.criarCasa("", 45);
		Casa c46 = fabrica.criarCasa("", 46);
		Casa c47 = fabrica.criarCasa("", 47);
		Casa c48 = fabrica.criarCasa("", 48);
		Casa c49 = fabrica.criarCasa("", 49);
		Casa c50 = fabrica.criarCasa("", 50);
		Casa c51 = fabrica.criarCasa("", 51);
		Casa c52 = fabrica.criarCasa("cobra", 52);
		Casa c53 = fabrica.criarCasa("trunfo", 53);
		Casa c54 = fabrica.criarCasa("", 54);
		Casa c55 = fabrica.criarCasa("", 55);
		Casa c56 = fabrica.criarCasa("", 56);
		Casa c57 = fabrica.criarCasa("cobra", 57);
		Casa c58 = fabrica.criarCasa("escada", 58);
		Casa c59 = fabrica.criarCasa("trunfo", 59);
		Casa c60 = fabrica.criarCasa("", 60);
		Casa c61 = fabrica.criarCasa("", 61);
		Casa c62 = fabrica.criarCasa("cobra", 62);
		Casa c63 = fabrica.criarCasa("", 63);
		Casa c64 = fabrica.criarCasa("", 64);
		Casa c65 = fabrica.criarCasa("", 65);
		Casa c66 = fabrica.criarCasa("trunfo", 66);
		Casa c67 = fabrica.criarCasa("", 67);
		Casa c68 = fabrica.criarCasa("", 68);
		Casa c69 = fabrica.criarCasa("", 69);
		Casa c70 = fabrica.criarCasa("", 70);
		Casa c71 = fabrica.criarCasa("", 71);
		Casa c72 = fabrica.criarCasa("trunfo", 72);
		Casa c73 = fabrica.criarCasa("", 73);
		Casa c74 = fabrica.criarCasa("", 74);
		Casa c75 = fabrica.criarCasa("escada", 75);
		Casa c76 = fabrica.criarCasa("", 76);
		Casa c77 = fabrica.criarCasa("", 77);
		Casa c78 = fabrica.criarCasa("trunfo", 78);
		Casa c79 = fabrica.criarCasa("", 79);
		Casa c80 = fabrica.criarCasa("escada", 80);
		Casa c81 = fabrica.criarCasa("", 81);
		Casa c82 = fabrica.criarCasa("trunfo", 82);
		Casa c83 = fabrica.criarCasa("", 83);
		Casa c84 = fabrica.criarCasa("", 84);
		Casa c85 = fabrica.criarCasa("", 85);
		Casa c86 = fabrica.criarCasa("", 86);
		Casa c87 = fabrica.criarCasa("trunfo", 87);
		Casa c88 = fabrica.criarCasa("cobra", 88);
		Casa c89 = fabrica.criarCasa("", 89);
		Casa c90 = fabrica.criarCasa("escada", 90);
		Casa c91 = fabrica.criarCasa("", 91);
		Casa c92 = fabrica.criarCasa("", 92);
		Casa c93 = fabrica.criarCasa("", 93);
		Casa c94 = fabrica.criarCasa("trunfo", 94);
		Casa c95 = fabrica.criarCasa("cobra", 35);
		Casa c96 = fabrica.criarCasa("", 96);
		Casa c97 = fabrica.criarCasa("cobra", 97);
		Casa c98 = fabrica.criarCasa("", 98);
		Casa c99 = fabrica.criarCasa("", 99);
		Casa c100 = fabrica.criarCasa("", 100);
		
		c3.inserirCasaEspecial(c21);
		c8.inserirCasaEspecial(c30);
		c17.inserirCasaEspecial(c13);
		c28.inserirCasaEspecial(c84);
		c52.inserirCasaEspecial(c29);
		c57.inserirCasaEspecial(c40);
		c58.inserirCasaEspecial(c77);
		c62.inserirCasaEspecial(c22);
		c75.inserirCasaEspecial(c86);
		c80.inserirCasaEspecial(c100);
		c88.inserirCasaEspecial(c18);
		c90.inserirCasaEspecial(c91);
		c95.inserirCasaEspecial(c51);
		c97.inserirCasaEspecial(c79);
		
		
		
		casas.add(c1);
		casas.add(c2);
		casas.add(c3);
		casas.add(c4);
		casas.add(c5);
		casas.add(c6);
		casas.add(c7);
		casas.add(c8);
		casas.add(c9);
		casas.add(c10);
		casas.add(c11);
		casas.add(c12);
		casas.add(c13);
		casas.add(c14);
		casas.add(c15);
		casas.add(c16);
		casas.add(c17);
		casas.add(c18);
		casas.add(c19);
		casas.add(c20);
		casas.add(c21);
		casas.add(c22);
		casas.add(c23);
		casas.add(c24);
		casas.add(c25);
		casas.add(c26);
		casas.add(c27);
		casas.add(c28);
		casas.add(c29);
		casas.add(c30);
		casas.add(c31);
		casas.add(c32);
		casas.add(c33);
		casas.add(c34);
		casas.add(c35);
		casas.add(c36);
		casas.add(c37);
		casas.add(c38);
		casas.add(c39);
		casas.add(c40);
		casas.add(c41);
		casas.add(c42);
		casas.add(c43);
		casas.add(c44);
		casas.add(c45);
		casas.add(c46);
		casas.add(c47);
		casas.add(c48);
		casas.add(c49);
		casas.add(c50);
		casas.add(c51);
		casas.add(c52);
		casas.add(c53);
		casas.add(c54);
		casas.add(c55);
		casas.add(c56);
		casas.add(c57);
		casas.add(c58);
		casas.add(c59);
		casas.add(c60);
		casas.add(c61);
		casas.add(c62);
		casas.add(c63);
		casas.add(c64);
		casas.add(c65);
		casas.add(c66);
		casas.add(c67);
		casas.add(c68);
		casas.add(c69);
		casas.add(c70);
		casas.add(c71);
		casas.add(c72);
		casas.add(c73);
		casas.add(c74);
		casas.add(c75);
		casas.add(c76);
		casas.add(c77);
		casas.add(c78);
		casas.add(c79);
		casas.add(c80);
		casas.add(c81);
		casas.add(c82);
		casas.add(c83);
		casas.add(c84);
		casas.add(c85);
		casas.add(c86);
		casas.add(c87);
		casas.add(c88);
		casas.add(c89);
		casas.add(c90);
		casas.add(c91);
		casas.add(c92);
		casas.add(c93);
		casas.add(c94);
		casas.add(c95);
		casas.add(c96);
		casas.add(c97);
		casas.add(c98);
		casas.add(c99);
		casas.add(c100);
	
	}
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	public ArrayList<Casa> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	
	

}

