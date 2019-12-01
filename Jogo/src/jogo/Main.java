package jogo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import builders.BuilderCasa;
import builders.BuilderCasaTrunfo;
import builders.BuilderCobra;
import builders.BuilderEscada;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

import classes.*;
import interfaces.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Window janela = new Window(800,765);
//		GameImage plano= new GameImage("src//recursos//img/tabuleiro.jpeg");
//		Keyboard tecla = janela.getKeyboard();
//		
//		while(true) {
//			plano.draw();
//			janela.update();
//			
//			if(tecla.keyDown(Keyboard.ENTER_KEY)) {
//				JOptionPane.showMessageDialog(null,"Eae bro");
//			}
//		}
		
		
		
		ArrayList<ICasa> aux = new ArrayList<ICasa>();
		
		for(int i=1;i<=100;i++) {
			
			ICasa casa = new BuilderCasa().darNumero(i).get();
			aux.add(casa);
			
		}
		
		Tabuleiro.getInstance().inserirCasas(aux);
		
		
		
		IEspecialCasa cobra1 = new BuilderCobra().builder()
				  .casa1(Tabuleiro.getInstance().getCasas().get(44))
				  .casa2(Tabuleiro.getInstance().getCasas().get(22))
				  .get();
		
		
		IEspecialCasa cobra2 = new BuilderCobra().builder()
				  .casa1(Tabuleiro.getInstance().getCasas().get(86))
				  .casa2(Tabuleiro.getInstance().getCasas().get(53))
				  .get();
		

		IEspecialCasa cobra3 = new BuilderCobra().builder()
				  .casa1(Tabuleiro.getInstance().getCasas().get(69))
				  .casa2(Tabuleiro.getInstance().getCasas().get(12))
				  .get();
		
		IEspecialCasa cobra4 = new BuilderCobra().builder()
				  .casa1(Tabuleiro.getInstance().getCasas().get(12))
				  .casa2(Tabuleiro.getInstance().getCasas().get(1))
				  .get();
		
		IEspecialCasa cobra5 = new BuilderCobra()
				  .casa1(Tabuleiro.getInstance().getCasas().get(99))
				  .casa2(Tabuleiro.getInstance().getCasas().get(77))
				  .get();
		
		
		IEspecialCasa escada1 = new BuilderEscada().builder()
				.casa1(Tabuleiro.getInstance().getCasas().get(3))
				.casa2(Tabuleiro.getInstance().getCasas().get(13))
				.get();
		
		IEspecialCasa escada2 = new BuilderEscada().builder()
				.casa1(Tabuleiro.getInstance().getCasas().get(54))
				.casa2(Tabuleiro.getInstance().getCasas().get(67))
				.get();
		
		IEspecialCasa escada3 = new BuilderEscada().builder()
				.casa1(Tabuleiro.getInstance().getCasas().get(23))
				.casa2(Tabuleiro.getInstance().getCasas().get(43))
				.get();
		
		IEspecialCasa escada4 = new BuilderEscada().builder()
				.casa1(Tabuleiro.getInstance().getCasas().get(32))
				.casa2(Tabuleiro.getInstance().getCasas().get(35))
				.get();
		
		IEspecialCasa escada5 = new BuilderEscada().builder()
				.casa1(Tabuleiro.getInstance().getCasas().get(76))
				.casa2(Tabuleiro.getInstance().getCasas().get(89))
				.get();
		
		ICasaTrunfo trunfo1 = new BuilderCasaTrunfo().builder()
				.inserirCasa(Tabuleiro.getInstance().getCasas().get(42))
				.get();

		ICasaTrunfo trunfo2 = new BuilderCasaTrunfo().builder()
				.inserirCasa(Tabuleiro.getInstance().getCasas().get(66))
				.get();

		ICasaTrunfo trunfo3 = new BuilderCasaTrunfo().builder()
				.inserirCasa(Tabuleiro.getInstance().getCasas().get(81))
				.get();
		
		ICasaTrunfo trunfo4 = new BuilderCasaTrunfo().builder()
				.inserirCasa(Tabuleiro.getInstance().getCasas().get(27))
				.get();
	}

}
