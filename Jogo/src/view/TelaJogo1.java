package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladores.ControladorJogada;
import Controladores.ControladorJogador;
import model.Player;

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
		player1.setBounds(515, 82, 46, 37);
		contentPane.add(player1);
		
		JLabel player2 = new JLabel("");
		player2.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Naruto.png")));
		player2.setBounds(515, 147, 46, 37);
		contentPane.add(player2);
		
		JLabel player3 = new JLabel("");
		player3.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Sasque.png")));
		player3.setBounds(515, 219, 46, 37);
		contentPane.add(player3);
		
		JLabel player4 = new JLabel("");
		player4.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/Seya.png")));
		player4.setBounds(515, 273, 46, 55);
		contentPane.add(player4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaJogo1.class.getResource("/recursos/img/tabulero.jpeg")));
		label.setBounds(21, 31, 426, 420);
		contentPane.add(label);
		
		JButton btnRolarDado = new JButton("Rolar Dado");
		btnRolarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Seu dado deu : "+controladorJogada.jogarDado());
				Player p=controladorJogada.jogada();
				if(p.getPosicao().getNumero()==100) {
					JOptionPane.showMessageDialog(null,"Parabéns jogadaor "+p.getNome()+" você foi o campeão");
					btnRolarDado.setVisible(false);
				}
				System.out.println(p.getNome());
				System.out.println(p.getPosicao().getNumero());
				if(p==ControladorJogador.getInstance().getJogadores().get(0)) {
					player1.setLocation((int)p.getPosicao().getX(),(int)p.getPosicao().getY());
				}else if(p==ControladorJogador.getInstance().getJogadores().get(1)) {
					player2.setLocation((int)p.getPosicao().getX(),(int)p.getPosicao().getY());
				}else if(p==ControladorJogador.getInstance().getJogadores().get(2)) {
					player3.setLocation((int)p.getPosicao().getX(),(int)p.getPosicao().getY());
				}else if(p==ControladorJogador.getInstance().getJogadores().get(3)) {
					player4.setLocation((int)p.getPosicao().getX(),(int)p.getPosicao().getY());
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
					player1.setLocation((int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getY());
					player2.setLocation((int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getY());
					break;
				}
				case 3:{
					player1.setLocation((int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getY());
					player2.setLocation((int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getY());
					player3.setLocation((int)ControladorJogador.getInstance().getJogadores().get(2).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(2).getPosicao().getY());
					break;
				}
				case 4:{
					player1.setLocation((int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(0).getPosicao().getY());
					player2.setLocation((int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(1).getPosicao().getY());
					player3.setLocation((int)ControladorJogador.getInstance().getJogadores().get(2).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(2).getPosicao().getY());
					player4.setLocation((int)ControladorJogador.getInstance().getJogadores().get(3).getPosicao().getX(),(int)ControladorJogador.getInstance().getJogadores().get(3).getPosicao().getY());
					break;
				}
				
				}
				btnIniarJogo.setVisible(false);
			}
			
		});
		btnIniarJogo.setBounds(491, 415, 99, 23);
		contentPane.add(btnIniarJogo);
		
		JLabel lblJogador = new JLabel("Jogador1");
		lblJogador.setBounds(515, 57, 57, 14);
		contentPane.add(lblJogador);
		
		JLabel lblJogador_1 = new JLabel("Jogador2");
		lblJogador_1.setBounds(515, 130, 57, 14);
		contentPane.add(lblJogador_1);
		
		JLabel lblJogador_2 = new JLabel("jogador3");
		lblJogador_2.setBounds(515, 205, 57, 14);
		contentPane.add(lblJogador_2);
		
		JLabel lblJogador_3 = new JLabel("jogador4");
		lblJogador_3.setBounds(515, 267, 73, 14);
		contentPane.add(lblJogador_3);
	}
}
