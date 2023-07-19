package br.com.alexlopes.cenaflix3.gui.podcast;

import br.com.alexlopes.cenaflix3.dao.PodcastDAO;
import br.com.alexlopes.cenaflix3.model.Podcast;
import br.com.alexlopes.cenaflix3.model.Usuario;
import br.com.alexlopes.cenaflix3.util.Janelas;
import br.com.alexlopes.cenaflix3.util.Mensagem;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
/**
 * Classe responsavel da tela CadastrarPodcast
 * @author AlexLopes
 */
public class CadastrarPodcast extends javax.swing.JFrame {

    private PodcastDAO dao = new PodcastDAO();
    private Usuario usuario;

    public CadastrarPodcast() {
        initComponents();
        txtProdutor.requestFocus();
    }

    public CadastrarPodcast(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        txtProdutor.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/fundoClaro.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtNomeEpisodio = new javax.swing.JTextField();
        txtNumeroEpisodio = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtURL = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CenaFlix");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cadastrar Podcast");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Produtor:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número do Epsódio:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome do Epsódio:");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Duração:");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("URL:");

        txtProdutor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtProdutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutorKeyPressed(evt);
            }
        });

        txtNomeEpisodio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNomeEpisodio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEpisodioKeyPressed(evt);
            }
        });

        txtNumeroEpisodio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNumeroEpisodio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroEpisodioKeyPressed(evt);
            }
        });

        txtDuracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDuracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDuracaoKeyPressed(evt);
            }
        });

        txtURL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtURLKeyPressed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoListagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoListagem.setText("Ver Listagem");
        botaoListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(251, 251, 251))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Podcast pod = new Podcast();
        try {

            if (validacao()) {
                int numero = 0;
                numero = Integer.parseInt(txtNumeroEpisodio.getText());

                pod.setProdutor(txtProdutor.getText());
                pod.setNomeepisodio(txtNomeEpisodio.getText());
                pod.setNumeroepisodio(numero);
                pod.setDuracao(txtDuracao.getText());
                pod.setUrl(txtURL.getText());
                dao.cadastrar(pod);
                Mensagem.mensagemExito("Podcast Cadastrado com Sucesso!");
                limparTela();
            }

        } catch (NumberFormatException e) {
            Mensagem.mensagemErro("Não foi possivel cadastrar o Podcast!");
            System.out.println(e);
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListagemActionPerformed
        this.dispose();
        Janelas.irListagem2(usuario);
    }//GEN-LAST:event_botaoListagemActionPerformed

    private void txtProdutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtNomeEpisodio.requestFocus();
        }
    }//GEN-LAST:event_txtProdutorKeyPressed

    private void txtNomeEpisodioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEpisodioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtNumeroEpisodio.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtProdutor.requestFocus();
        }
    }//GEN-LAST:event_txtNomeEpisodioKeyPressed

    private void txtNumeroEpisodioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEpisodioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtDuracao.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtNomeEpisodio.requestFocus();
        }
    }//GEN-LAST:event_txtNumeroEpisodioKeyPressed

    private void txtDuracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtURL.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtNumeroEpisodio.requestFocus();
        }
    }//GEN-LAST:event_txtDuracaoKeyPressed

    private void txtURLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtURLKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            java.awt.event.ActionEvent evts = null;
            botaoCadastrarActionPerformed(evts);
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtDuracao.requestFocus();
        }
    }//GEN-LAST:event_txtURLKeyPressed

    private boolean validacao() {
        if (txtProdutor.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Produtor não pode estar vazio");
            return false;
        }
        if (txtNomeEpisodio.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Nome do Episódio Produtor não pode estar vazio");
            return false;
        }
        if (txtNumeroEpisodio.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Numero do Episodio não pode estar vazio");
            return false;
        }
        if (txtDuracao.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Duração não pode estar vazio");
            return false;
        }
        if (txtURL.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo URL não pode estar vazio");
            return false;
        }
        return true;
    }

    private void limparTela() {
        txtProdutor.setText(null);
        txtNomeEpisodio.setText(null);
        txtNumeroEpisodio.setText(null);
        txtDuracao.setText(null);
        txtURL.setText(null);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarPodcast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPodcast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPodcast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPodcast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPodcast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JTextField txtNumeroEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
