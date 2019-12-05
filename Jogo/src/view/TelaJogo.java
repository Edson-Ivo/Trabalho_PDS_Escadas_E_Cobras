package Telas;

import Tabuleiro.Retorno;
import Jogo.ControladorJogo;

public class TelaJogo extends javax.swing.JFrame {
    Retorno retorno = new Retorno();
    
    public TelaJogo() {
        initComponents();
        retorno = new Retorno();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Tabuleiro = new javax.swing.JLabel();
        Jogador01 = new javax.swing.JLabel();
        Jogador02 = new javax.swing.JLabel();
        Jogador03 = new javax.swing.JLabel();
        Jogador04 = new javax.swing.JLabel();
        txtJogador04 = new javax.swing.JLabel();
        txtJogador01 = new javax.swing.JLabel();
        txtJogador02 = new javax.swing.JLabel();
        txtJogador03 = new javax.swing.JLabel();
        imgDados = new javax.swing.JLabel();
        iniciarJogo = new javax.swing.JButton();
        rodarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Tabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tabuleiro.jpg"))); // NOI18N

        Jogador01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pinoTabuleiro01.png"))); // NOI18N

        Jogador02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pinoTabuleiro02.png"))); // NOI18N

        Jogador03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pinoTabuleiro03.png"))); // NOI18N

        Jogador04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pinoTabuleiro04.png"))); // NOI18N

        txtJogador04.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtJogador04.setText("Jogador 04: Preto");

        txtJogador01.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtJogador01.setText("Jogador 01: Azul");

        txtJogador02.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtJogador02.setText("Jogador 02: Verde");

        txtJogador03.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtJogador03.setText("Jogador 03: Rosa");

        imgDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dados.png"))); // NOI18N

        iniciarJogo.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        iniciarJogo.setText("Iniciar Jogo");
        iniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJogoActionPerformed(evt);
            }
        });

        rodarDados.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        rodarDados.setText("Rodar Dados");
        rodarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rodarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(rodarDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Jogador01, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtJogador04, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgDados)
                                    .addComponent(txtJogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJogador02)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Jogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jogador04, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtJogador01, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Jogador02)
                                    .addComponent(iniciarJogo))
                                .addGap(18, 18, 18)))))
                .addComponent(Tabuleiro))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Tabuleiro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(iniciarJogo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jogador02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jogador01))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Jogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Jogador04)))
                .addGap(18, 18, 18)
                .addComponent(txtJogador01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJogador02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJogador04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(imgDados, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rodarDados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(977, 626));
        setLocationRelativeTo(null);
    }

    public void setPosicao(){
        switch(this.	.QntJogadores()){
            case 2:
                Jogador01.setLocation(retorno.getXJogador(0), retorno.getYJogador(0));
                Jogador02.setLocation(retorno.getXJogador(1), retorno.getYJogador(1));
                break;
            case 3:
                Jogador01.setLocation(retorno.getXJogador(0), retorno.getYJogador(0));
                Jogador02.setLocation(retorno.getXJogador(1), retorno.getYJogador(1));
                Jogador03.setLocation(retorno.getXJogador(2), retorno.getYJogador(2));
                break;
            case 4:
                Jogador01.setLocation(retorno.getXJogador(0), retorno.getYJogador(0));
                Jogador02.setLocation(retorno.getXJogador(1), retorno.getYJogador(1));
                Jogador03.setLocation(retorno.getXJogador(2), retorno.getYJogador(2));
                Jogador04.setLocation(retorno.getXJogador(3), retorno.getYJogador(3));
                break;
            default:
                break;
        }
    }
    
    private void iniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {
        setPosicao();
    }

    private void rodarDadosActionPerformed(java.awt.event.ActionEvent evt) {
        ControladorJogo.getInstance().Jogada();
        setPosicao();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Jogador01;
    private javax.swing.JLabel Jogador02;
    private javax.swing.JLabel Jogador03;
    private javax.swing.JLabel Jogador04;
    private javax.swing.JLabel Tabuleiro;
    private javax.swing.JLabel imgDados;
    private javax.swing.JButton iniciarJogo;
    private javax.swing.JButton rodarDados;
    private javax.swing.JLabel txtJogador01;
    private javax.swing.JLabel txtJogador02;
    private javax.swing.JLabel txtJogador03;
    private javax.swing.JLabel txtJogador04;
}
