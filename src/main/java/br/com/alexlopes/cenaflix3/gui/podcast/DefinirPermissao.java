package br.com.alexlopes.cenaflix3.gui.podcast;

import br.com.alexlopes.cenaflix3.dao.UsuarioDAO;
import br.com.alexlopes.cenaflix3.model.Usuario;
import br.com.alexlopes.cenaflix3.util.Mensagem;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Classe responsavel da tela DefinirPermissao
 * @author AlexLopes
 */
public class DefinirPermissao extends javax.swing.JFrame {

    private Usuario usuario;
    private UsuarioDAO dao = new UsuarioDAO();

    public DefinirPermissao() {
        initComponents();
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
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        combobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        botaoRedefinir = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoRedefinir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Definir Permissões");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");

        txtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        areaTexto.setBackground(new java.awt.Color(255, 255, 255));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        areaTexto.setForeground(new java.awt.Color(0, 0, 0));
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        combobox.setBackground(new java.awt.Color(255, 255, 255));
        combobox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        combobox.setForeground(new java.awt.Color(0, 0, 0));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Operador", "Administrador" }));
        combobox.setSelectedIndex(-1);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Definir nova Permissão:");

        botaoRedefinir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoRedefinir.setText("Redefinir");
        botaoRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRedefinirActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoRedefinir1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoRedefinir1.setText("Pesquisar");
        botaoRedefinir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRedefinir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRedefinir1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRedefinir1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoRedefinir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRedefinir1ActionPerformed
        usuario = dao.buscarPorNome(txtPesquisar.getText());
        areaTexto.setText("\nUsuario: " + usuario.getNome() + "\n\nPermissão: " + usuario.getPermissao());
    }//GEN-LAST:event_botaoRedefinir1ActionPerformed


    private void botaoRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRedefinirActionPerformed
        try {
            if (combobox.getSelectedIndex() != -1) {

                String a = null;
                if (combobox.getSelectedIndex() == 0) {
                    a = "Usuário";
                }
                if (combobox.getSelectedIndex() == 1) {
                    a = "Operador";
                }
                if (combobox.getSelectedIndex() == 2) {
                    a = "Administrador";
                }
                if (a != null) {
                    int option = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar a permissão?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        dao.alterarPermissaoUsuario(usuario.getId(), a);
                    } else {
                        limparTela();
                    }
                } else {
                    Mensagem.mensagemAlerta("Por favor, selecione a nova permissão!");
                }
            }
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_botaoRedefinirActionPerformed

    private void limparTela() {
        txtPesquisar.setText(null);
        areaTexto.setText(null);
        combobox.setSelectedIndex(-1);
    }


    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            java.awt.event.ActionEvent evts = null;
            botaoRedefinir1ActionPerformed(evts);
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

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
            java.util.logging.Logger.getLogger(DefinirPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirPermissao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botaoRedefinir;
    private javax.swing.JButton botaoRedefinir1;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
