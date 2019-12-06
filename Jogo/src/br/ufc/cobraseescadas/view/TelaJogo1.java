package br.ufc.cobraseescadas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufc.cobraseescadas.Controladores.ControladorJogada;
import br.ufc.cobraseescadas.Controladores.ControladorJogador;
import br.ufc.cobraseescadas.model.Player;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogo1 extends JFrame {

	private JPanel contentPane;
	private ControladorJogada controladorJogada=new ControladorJogada(ControladorJogador.getInstance().getJogadores());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo1 frame = new TelaJogo1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public TelaJogo1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel player1 = new JLabel("");
		player1.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Link.png")));
		player1.setBounds(525, 70, 46, 37);
		contentPane.add(player1);
		
		JLabel player2 = new JLabel("");
		player2.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Naruto.png")));
		player2.setBounds(525, 144, 46, 37);
		contentPane.add(player2);
		
		JLabel player3 = new JLabel("");
		player3.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Sasque.png")));
		player3.setBounds(525, 205, 46, 37);
		contentPane.add(player3);
		
		JLabel player4 = new JLabel("");
		player4.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Seya.png")));
		player4.setBounds(525, 267, 46, 55);
		contentPane.add(player4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/tabulero.jpeg")));
		label.setBounds(21, 31, 426, 420);
		contentPane.add(label);
		
		JButton btnRolarDado = new JButton("Rolar Dado");
		btnRolarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, controladorJogada.getJogadorAtual().getNome()+" seu dado deu : "+controladorJogada.jogarDado());
				Player p=controladorJogada.jogada();
				if(p.getPosicao().getNumero()==100) {
					JOptionPane.showMessageDialog(null,"Parabéns jogadaor "+p.getNome()+" você foi o campeão");
					btnRolarDado.setVisible(false);
				}
				System.out.println(p.getNome());
				System.out.println(p.getPosicao().getNumero());
				if(p==ControladorJogador.getInstance().getJogadores().get(0)) {
					switch(p.getPosicao().getNumero()) {
						case 1:player1.setLocation(38, 395);break;
						case 2:player1.setLocation(78,395);break;
						case 3:player1.setLocation(118,395);break;
						case 4:player1.setLocation(158,395);break;
						case 5:player1.setLocation(198,395);break;
						case 6:player1.setLocation(238,395);break;
						case 7:player1.setLocation(278,395);break;
						case 8:player1.setLocation(318,395);break;
						case 9:player1.setLocation(358,395);break;
						case 10:player1.setLocation(398,395);break;
						case 11:player1.setLocation(398, 355);break;
						case 12:player1.setLocation(358,355);break;
						case 13:player1.setLocation(318,355);break;
						case 14:player1.setLocation(278,355);break;
						case 15:player1.setLocation(238,355);break;
						case 16:player1.setLocation(198,355);break;
						case 17:player1.setLocation(158,355);break;
						case 18:player1.setLocation(118,355);break;
						case 19:player1.setLocation(78,355);break;
						case 20:player1.setLocation(38,355);break;
						case 21:player1.setLocation(38, 315);break;
						case 22:player1.setLocation(78,315);break;
						case 23:player1.setLocation(118,315);break;
						case 24:player1.setLocation(158,315);break;
						case 25:player1.setLocation(198,315);break;
						case 26:player1.setLocation(238,315);break;
						case 27:player1.setLocation(278,315);break;
						case 28:player1.setLocation(318,315);break;
						case 29:player1.setLocation(358,315);break;
						case 30:player1.setLocation(398,315);break;
						case 31:player1.setLocation(398, 275);break;
						case 32:player1.setLocation(358,275);break;
						case 33:player1.setLocation(318,275);break;
						case 34:player1.setLocation(278,275);break;
						case 35:player1.setLocation(238,275);break;
						case 36:player1.setLocation(198,275);break;
						case 37:player1.setLocation(158,275);break;
						case 38:player1.setLocation(118,275);break;
						case 39:player1.setLocation(78,275);break;
						case 40:player1.setLocation(38,275);break;
						case 41:player1.setLocation(38, 235);break;
						case 42:player1.setLocation(78,235);break;
						case 43:player1.setLocation(118,235);break;
						case 44:player1.setLocation(158,235);break;
						case 45:player1.setLocation(198,235);break;
						case 46:player1.setLocation(238,235);break;
						case 47:player1.setLocation(278,235);break;
						case 48:player1.setLocation(318,235);break;
						case 49:player1.setLocation(358,235);break;
						case 50:player1.setLocation(398,235);break;
						case 51:player1.setLocation(398, 195);break;
						case 52:player1.setLocation(358,195);break;
						case 53:player1.setLocation(318,195);break;
						case 54:player1.setLocation(278,195);break;
						case 55:player1.setLocation(238,195);break;
						case 56:player1.setLocation(198,195);break;
						case 57:player1.setLocation(158,195);break;
						case 58:player1.setLocation(118,195);break;
						case 59:player1.setLocation(78,195);break;
						case 60:player1.setLocation(38,195);break;
						case 61:player1.setLocation(38, 155);break;
						case 62:player1.setLocation(78,155);break;
						case 63:player1.setLocation(118,155);break;
						case 64:player1.setLocation(158,155);break;
						case 65:player1.setLocation(198,155);break;
						case 66:player1.setLocation(238,155);break;
						case 67:player1.setLocation(278,155);break;
						case 68:player1.setLocation(318,155);break;
						case 69:player1.setLocation(358,155);break;
						case 70:player1.setLocation(398,155);break;
						case 71:player1.setLocation(398, 115);break;
						case 72:player1.setLocation(358,115);break;
						case 73:player1.setLocation(318,115);break;
						case 74:player1.setLocation(278,115);break;
						case 75:player1.setLocation(238,115);break;
						case 76:player1.setLocation(198,115);break;
						case 77:player1.setLocation(158,115);break;
						case 78:player1.setLocation(118,115);break;
						case 79:player1.setLocation(78,115);break;
						case 80:player1.setLocation(38,115);break;
						case 81:player1.setLocation(38, 75);break;
						case 82:player1.setLocation(78,75);break;
						case 83:player1.setLocation(118,75);break;
						case 84:player1.setLocation(158,75);break;
						case 85:player1.setLocation(198,75);break;
						case 86:player1.setLocation(238,75);break;
						case 87:player1.setLocation(278,75);break;
						case 88:player1.setLocation(318,75);break;
						case 89:player1.setLocation(358,75);break;
						case 90:player1.setLocation(398,75);break;
						case 91:player1.setLocation(398,35);break;
						case 92:player1.setLocation(358,35);break;
						case 93:player1.setLocation(318,35);break;
						case 94:player1.setLocation(278,35);break;
						case 95:player1.setLocation(238,35);break;
						case 96:player1.setLocation(198,35);break;
						case 97:player1.setLocation(158,35);break;
						case 98:player1.setLocation(118,35);break;
						case 99:player1.setLocation(78,35);break;
						case 100:player1.setLocation(38,35);break;
					}
					
				}else if(p==ControladorJogador.getInstance().getJogadores().get(1)) {
					switch(p.getPosicao().getNumero()) {
						case 1:player2.setLocation(38, 395);break;
						case 2:player2.setLocation(78,395);break;
						case 3:player2.setLocation(118,395);break;
						case 4:player2.setLocation(158,395);break;
						case 5:player2.setLocation(198,395);break;
						case 6:player2.setLocation(238,395);break;
						case 7:player2.setLocation(278,395);break;
						case 8:player2.setLocation(318,395);break;
						case 9:player2.setLocation(358,395);break;
						case 10:player2.setLocation(398,395);break;
						case 11:player2.setLocation(398, 355);break;
						case 12:player2.setLocation(358,355);break;
						case 13:player2.setLocation(318,355);break;
						case 14:player2.setLocation(278,355);break;
						case 15:player2.setLocation(238,355);break;
						case 16:player2.setLocation(198,355);break;
						case 17:player2.setLocation(158,355);break;
						case 18:player2.setLocation(118,355);break;
						case 19:player2.setLocation(78,355);break;
						case 20:player2.setLocation(38,355);break;
						case 21:player2.setLocation(38, 315);break;
						case 22:player2.setLocation(78,315);break;
						case 23:player2.setLocation(118,315);break;
						case 24:player2.setLocation(158,315);break;
						case 25:player2.setLocation(198,315);break;
						case 26:player2.setLocation(238,315);break;
						case 27:player2.setLocation(278,315);break;
						case 28:player2.setLocation(318,315);break;
						case 29:player2.setLocation(358,315);break;
						case 30:player2.setLocation(398,315);break;
						case 31:player2.setLocation(398, 275);break;
						case 32:player2.setLocation(358,275);break;
						case 33:player2.setLocation(318,275);break;
						case 34:player2.setLocation(278,275);break;
						case 35:player2.setLocation(238,275);break;
						case 36:player2.setLocation(198,275);break;
						case 37:player2.setLocation(158,275);break;
						case 38:player2.setLocation(118,275);break;
						case 39:player2.setLocation(78,275);break;
						case 40:player2.setLocation(38,275);break;
						case 41:player2.setLocation(38, 235);break;
						case 42:player2.setLocation(78,235);break;
						case 43:player2.setLocation(118,235);break;
						case 44:player2.setLocation(158,235);break;
						case 45:player2.setLocation(198,235);break;
						case 46:player2.setLocation(238,235);break;
						case 47:player2.setLocation(278,235);break;
						case 48:player2.setLocation(318,235);break;
						case 49:player2.setLocation(358,235);break;
						case 50:player2.setLocation(398,235);break;
						case 51:player2.setLocation(398, 195);break;
						case 52:player2.setLocation(358,195);break;
						case 53:player2.setLocation(318,195);break;
						case 54:player2.setLocation(278,195);break;
						case 55:player2.setLocation(238,195);break;
						case 56:player2.setLocation(198,195);break;
						case 57:player2.setLocation(158,195);break;
						case 58:player2.setLocation(118,195);break;
						case 59:player2.setLocation(78,195);break;
						case 60:player2.setLocation(38,195);break;
						case 61:player2.setLocation(38, 155);break;
						case 62:player2.setLocation(78,155);break;
						case 63:player2.setLocation(118,155);break;
						case 64:player2.setLocation(158,155);break;
						case 65:player2.setLocation(198,155);break;
						case 66:player2.setLocation(238,155);break;
						case 67:player2.setLocation(278,155);break;
						case 68:player2.setLocation(318,155);break;
						case 69:player2.setLocation(358,155);break;
						case 70:player2.setLocation(398,155);break;
						case 71:player2.setLocation(398, 115);break;
						case 72:player2.setLocation(358,115);break;
						case 73:player2.setLocation(318,115);break;
						case 74:player2.setLocation(278,115);break;
						case 75:player2.setLocation(238,115);break;
						case 76:player2.setLocation(198,115);break;
						case 77:player2.setLocation(158,115);break;
						case 78:player2.setLocation(118,115);break;
						case 79:player2.setLocation(78,115);break;
						case 80:player2.setLocation(38,115);break;
						case 81:player2.setLocation(38, 75);break;
						case 82:player2.setLocation(78,75);break;
						case 83:player2.setLocation(118,75);break;
						case 84:player2.setLocation(158,75);break;
						case 85:player2.setLocation(198,75);break;
						case 86:player2.setLocation(238,75);break;
						case 87:player2.setLocation(278,75);break;
						case 88:player2.setLocation(318,75);break;
						case 89:player2.setLocation(358,75);break;
						case 90:player2.setLocation(398,75);break;
						case 91:player2.setLocation(398,35);break;
						case 92:player2.setLocation(358,35);break;
						case 93:player2.setLocation(318,35);break;
						case 94:player2.setLocation(278,35);break;
						case 95:player2.setLocation(238,35);break;
						case 96:player2.setLocation(198,35);break;
						case 97:player2.setLocation(158,35);break;
						case 98:player2.setLocation(118,35);break;
						case 99:player2.setLocation(78,35);break;
						case 100:player2.setLocation(38,35);break;
					}
				}else if(p==ControladorJogador.getInstance().getJogadores().get(2)) {	
					switch(p.getPosicao().getNumero()) {
						case 1:player3.setLocation(38, 395);break;
						case 2:player3.setLocation(78,395);break;
						case 3:player3.setLocation(118,395);break;
						case 4:player3.setLocation(158,395);break;
						case 5:player3.setLocation(198,395);break;
						case 6:player3.setLocation(238,395);break;
						case 7:player3.setLocation(278,395);break;
						case 8:player3.setLocation(318,395);break;
						case 9:player3.setLocation(358,395);break;
						case 10:player3.setLocation(398,395);break;
						case 11:player3.setLocation(398, 355);break;
						case 12:player3.setLocation(358,355);break;
						case 13:player3.setLocation(318,355);break;
						case 14:player3.setLocation(278,355);break;
						case 15:player3.setLocation(238,355);break;
						case 16:player3.setLocation(198,355);break;
						case 17:player3.setLocation(158,355);break;
						case 18:player3.setLocation(118,355);break;
						case 19:player3.setLocation(78,355);break;
						case 20:player3.setLocation(38,355);break;
						case 21:player3.setLocation(38, 315);break;
						case 22:player3.setLocation(78,315);break;
						case 23:player3.setLocation(118,315);break;
						case 24:player3.setLocation(158,315);break;
						case 25:player3.setLocation(198,315);break;
						case 26:player3.setLocation(238,315);break;
						case 27:player3.setLocation(278,315);break;
						case 28:player3.setLocation(318,315);break;
						case 29:player3.setLocation(358,315);break;
						case 30:player3.setLocation(398,315);break;
						case 31:player3.setLocation(398, 275);break;
						case 32:player3.setLocation(358,275);break;
						case 33:player3.setLocation(318,275);break;
						case 34:player3.setLocation(278,275);break;
						case 35:player3.setLocation(238,275);break;
						case 36:player3.setLocation(198,275);break;
						case 37:player3.setLocation(158,275);break;
						case 38:player3.setLocation(118,275);break;
						case 39:player3.setLocation(78,275);break;
						case 40:player3.setLocation(38,275);break;
						case 41:player3.setLocation(38, 235);break;
						case 42:player3.setLocation(78,235);break;
						case 43:player3.setLocation(118,235);break;
						case 44:player3.setLocation(158,235);break;
						case 45:player3.setLocation(198,235);break;
						case 46:player3.setLocation(238,235);break;
						case 47:player3.setLocation(278,235);break;
						case 48:player3.setLocation(318,235);break;
						case 49:player3.setLocation(358,235);break;
						case 50:player3.setLocation(398,235);break;
						case 51:player3.setLocation(398, 195);break;
						case 52:player3.setLocation(358,195);break;
						case 53:player3.setLocation(318,195);break;
						case 54:player3.setLocation(278,195);break;
						case 55:player3.setLocation(238,195);break;
						case 56:player3.setLocation(198,195);break;
						case 57:player3.setLocation(158,195);break;
						case 58:player3.setLocation(118,195);break;
						case 59:player3.setLocation(78,195);break;
						case 60:player3.setLocation(38,195);break;
						case 61:player3.setLocation(38, 155);break;
						case 62:player3.setLocation(78,155);break;
						case 63:player3.setLocation(118,155);break;
						case 64:player3.setLocation(158,155);break;
						case 65:player3.setLocation(198,155);break;
						case 66:player3.setLocation(238,155);break;
						case 67:player3.setLocation(278,155);break;
						case 68:player3.setLocation(318,155);break;
						case 69:player3.setLocation(358,155);break;
						case 70:player3.setLocation(398,155);break;
						case 71:player3.setLocation(398, 115);break;
						case 72:player3.setLocation(358,115);break;
						case 73:player3.setLocation(318,115);break;
						case 74:player3.setLocation(278,115);break;
						case 75:player3.setLocation(238,115);break;
						case 76:player3.setLocation(198,115);break;
						case 77:player3.setLocation(158,115);break;
						case 78:player3.setLocation(118,115);break;
						case 79:player3.setLocation(78,115);break;
						case 80:player3.setLocation(38,115);break;
						case 81:player3.setLocation(38, 75);break;
						case 82:player3.setLocation(78,75);break;
						case 83:player3.setLocation(118,75);break;
						case 84:player3.setLocation(158,75);break;
						case 85:player3.setLocation(198,75);break;
						case 86:player3.setLocation(238,75);break;
						case 87:player3.setLocation(278,75);break;
						case 88:player3.setLocation(318,75);break;
						case 89:player3.setLocation(358,75);break;
						case 90:player3.setLocation(398,75);break;
						case 91:player3.setLocation(398,35);break;
						case 92:player3.setLocation(358,35);break;
						case 93:player3.setLocation(318,35);break;
						case 94:player3.setLocation(278,35);break;
						case 95:player3.setLocation(238,35);break;
						case 96:player3.setLocation(198,35);break;
						case 97:player3.setLocation(158,35);break;
						case 98:player3.setLocation(118,35);break;
						case 99:player3.setLocation(78,35);break;
						case 100:player3.setLocation(38,35);break;
					}
				}else if(p==ControladorJogador.getInstance().getJogadores().get(3)) {
					switch(p.getPosicao().getNumero()) {
						case 1:player4.setLocation(38, 395);break;
						case 2:player4.setLocation(78,395);break;
						case 3:player4.setLocation(118,395);break;
						case 4:player4.setLocation(158,395);break;
						case 5:player4.setLocation(198,395);break;
						case 6:player4.setLocation(238,395);break;
						case 7:player4.setLocation(278,395);break;
						case 8:player4.setLocation(318,395);break;
						case 9:player4.setLocation(358,395);break;
						case 10:player4.setLocation(398,395);break;
						case 11:player4.setLocation(398, 355);break;
						case 12:player4.setLocation(358,355);break;
						case 13:player4.setLocation(318,355);break;
						case 14:player4.setLocation(278,355);break;
						case 15:player4.setLocation(238,355);break;
						case 16:player4.setLocation(198,355);break;
						case 17:player4.setLocation(158,355);break;
						case 18:player4.setLocation(118,355);break;
						case 19:player4.setLocation(78,355);break;
						case 20:player4.setLocation(38,355);break;
						case 21:player4.setLocation(38, 315);break;
						case 22:player4.setLocation(78,315);break;
						case 23:player4.setLocation(118,315);break;
						case 24:player4.setLocation(158,315);break;
						case 25:player4.setLocation(198,315);break;
						case 26:player4.setLocation(238,315);break;
						case 27:player4.setLocation(278,315);break;
						case 28:player4.setLocation(318,315);break;
						case 29:player4.setLocation(358,315);break;
						case 30:player4.setLocation(398,315);break;
						case 31:player4.setLocation(398, 275);break;
						case 32:player4.setLocation(358,275);break;
						case 33:player4.setLocation(318,275);break;
						case 34:player4.setLocation(278,275);break;
						case 35:player4.setLocation(238,275);break;
						case 36:player4.setLocation(198,275);break;
						case 37:player4.setLocation(158,275);break;
						case 38:player4.setLocation(118,275);break;
						case 39:player4.setLocation(78,275);break;
						case 40:player4.setLocation(38,275);break;
						case 41:player4.setLocation(38, 235);break;
						case 42:player4.setLocation(78,235);break;
						case 43:player4.setLocation(118,235);break;
						case 44:player4.setLocation(158,235);break;
						case 45:player4.setLocation(198,235);break;
						case 46:player4.setLocation(238,235);break;
						case 47:player4.setLocation(278,235);break;
						case 48:player4.setLocation(318,235);break;
						case 49:player4.setLocation(358,235);break;
						case 50:player4.setLocation(398,235);break;
						case 51:player4.setLocation(398, 195);break;
						case 52:player4.setLocation(358,195);break;
						case 53:player4.setLocation(318,195);break;
						case 54:player4.setLocation(278,195);break;
						case 55:player4.setLocation(238,195);break;
						case 56:player4.setLocation(198,195);break;
						case 57:player4.setLocation(158,195);break;
						case 58:player4.setLocation(118,195);break;
						case 59:player4.setLocation(78,195);break;
						case 60:player4.setLocation(38,195);break;
						case 61:player4.setLocation(38, 155);break;
						case 62:player4.setLocation(78,155);break;
						case 63:player4.setLocation(118,155);break;
						case 64:player4.setLocation(158,155);break;
						case 65:player4.setLocation(198,155);break;
						case 66:player4.setLocation(238,155);break;
						case 67:player4.setLocation(278,155);break;
						case 68:player4.setLocation(318,155);break;
						case 69:player4.setLocation(358,155);break;
						case 70:player4.setLocation(398,155);break;
						case 71:player4.setLocation(398, 115);break;
						case 72:player4.setLocation(358,115);break;
						case 73:player4.setLocation(318,115);break;
						case 74:player4.setLocation(278,115);break;
						case 75:player4.setLocation(238,115);break;
						case 76:player4.setLocation(198,115);break;
						case 77:player4.setLocation(158,115);break;
						case 78:player4.setLocation(118,115);break;
						case 79:player4.setLocation(78,115);break;
						case 80:player4.setLocation(38,115);break;
						case 81:player4.setLocation(38, 75);break;
						case 82:player4.setLocation(78,75);break;
						case 83:player4.setLocation(118,75);break;
						case 84:player4.setLocation(158,75);break;
						case 85:player4.setLocation(198,75);break;
						case 86:player4.setLocation(238,75);break;
						case 87:player4.setLocation(278,75);break;
						case 88:player4.setLocation(318,75);break;
						case 89:player4.setLocation(358,75);break;
						case 90:player4.setLocation(398,75);break;
						case 91:player4.setLocation(398,35);break;
						case 92:player4.setLocation(358,35);break;
						case 93:player4.setLocation(318,35);break;
						case 94:player4.setLocation(278,35);break;
						case 95:player4.setLocation(238,35);break;
						case 96:player4.setLocation(198,35);break;
						case 97:player4.setLocation(158,35);break;
						case 98:player4.setLocation(118,35);break;
						case 99:player4.setLocation(78,35);break;
						case 100:player4.setLocation(38,35);break;
					}
				}
			}
		});
		btnRolarDado.setBounds(491, 333, 97, 71);
		contentPane.add(btnRolarDado);
		btnRolarDado.setVisible(false);
		
		JButton btnIniarJogo = new JButton("iniciar jogo");
		btnIniarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnRolarDado.setVisible(true);
				switch(ControladorJogador.getInstance().getQuantidadeJogadores()) {
				case 2:{
					player1.setLocation(38, 395);
					player2.setLocation(38, 395);
					break;
				}
				case 3:{
					player1.setLocation(38, 395);
					player2.setLocation(38, 395);
					player3.setLocation(38, 395);
					break;
				}
				case 4:{
					player1.setLocation(38, 395);
					player2.setLocation(38, 395);
					player3.setLocation(38, 395);
					player4.setLocation(38, 395);
					break;
				}
				
				}
				btnIniarJogo.setVisible(false);
			}
			
		});
		btnIniarJogo.setBounds(491, 415, 99, 23);
		contentPane.add(btnIniarJogo);
		
		JLabel lblJogador = new JLabel("Jogador1(Link)");
		lblJogador.setBounds(491, 59, 103, 14);
		contentPane.add(lblJogador);
		
		JLabel lblJogador_1 = new JLabel("Jogador2(Naruto)");
		lblJogador_1.setBounds(491, 133, 116, 14);
		contentPane.add(lblJogador_1);
		
		JLabel lblJogador_2 = new JLabel("Jogador3(Sasuke)");
		lblJogador_2.setBounds(491, 192, 116, 14);
		contentPane.add(lblJogador_2);
		
		JLabel lblJogador_3 = new JLabel("Jogador4(Seya)");
		lblJogador_3.setBounds(491, 267, 116, 14);
		contentPane.add(lblJogador_3);
	}
}
