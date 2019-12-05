package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladores.ControladorJogador;
import model.Player;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenu extends JFrame {

	private JPanel contentPane;
	private JTextField nmrJogadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemVindosAo = new JLabel("Bem vindos ao Cobras e Escadas ");
		lblBemVindosAo.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lblBemVindosAo.setBounds(44, 11, 364, 64);
		contentPane.add(lblBemVindosAo);
		
		nmrJogadores = new JTextField();
		nmrJogadores.setBounds(151, 178, 120, 20);
		contentPane.add(nmrJogadores);
		nmrJogadores.setColumns(10);
		
		JLabel lblInsiraONumero = new JLabel("Insira o numero de jogadores");
		lblInsiraONumero.setBounds(140, 153, 196, 14);
		contentPane.add(lblInsiraONumero);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int qtd=Integer.parseInt(nmrJogadores.getText());
				if(qtd<5 && qtd>1) {
					ControladorJogador.getInstance().setQuantidadeJogadores(qtd);
					for(int i=0;i<qtd;i++) {
						Player p = new Player("player"+i);
						ControladorJogador.getInstance().cadastrarJogador(p);
					}
					TelaJogo1 telajogo=new TelaJogo1();
					telajogo.setVisible(true);
					contentPane.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null, "Você precisa colocar 2 a 4 jogadores!","Quantidade inválida",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(161, 209, 105, 41);
		contentPane.add(btnNewButton);
	}
}
