package br.com.alexlopes.cenaflix3.gui.login;

import br.com.alexlopes.cenaflix3.dao.UsuarioDAO;
import br.com.alexlopes.cenaflix3.model.Usuario;
import br.com.alexlopes.cenaflix3.util.ClasseEmail;
import br.com.alexlopes.cenaflix3.util.Janelas;
import br.com.alexlopes.cenaflix3.util.Mensagem;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe responsavel da tela Cadastrar Login
 *
 * @author AlexLopes
 */
public class Cadastrar extends javax.swing.JFrame {

    private boolean senhaVisivel = false;
    private UsuarioDAO dao = new UsuarioDAO();

    public Cadastrar() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarSaida();
            }
        });
    }

    private void confirmarSaida() {
        Object[] options = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/fundoClaro.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mostrarSenha = new javax.swing.JLabel();
        mostrarConfirmar = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(778, 529));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cadastre-se");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Senha:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(0, 0, 0));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirmar Senha:");

        mostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/mostrarSenha.png"))); // NOI18N
        mostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseClicked(evt);
            }
        });

        mostrarConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/mostrarSenha.png"))); // NOI18N
        mostrarConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarConfirmarMouseClicked(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        txtConfirmarSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCPF.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarSenha))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarConfirmar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarConfirmar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jDesktopPane3.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(680, 680, 680))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        Janelas.irEntrar();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Usuario usuario = new Usuario();
        try {
            char[] senhaChars = txtSenha.getPassword();
            String senha = new String(senhaChars);
            usuario.setNome(txtNome.getText());
            usuario.setCpf(txtCPF.getText());
            usuario.setEmail(txtEmail.getText());
            String senhamd5 = dao.calculateMD5(senhaChars);
            usuario.setSenha(senhamd5);
            if (validacao()) {
                if (dao.verificarBancoDeDadosVazio()) {//SE O BD ESTIVER VAZIO O PRIMEIRO CADASTRO TERÁ A PERMISSÃO DE ADMINISTRADOR
                    usuario.setPermissao("Administrador");
                    if (validarEmail()) {
                        dao.cadastrar(usuario);
                    } else {
                        Mensagem.mensagemErro("Codigo Inválido");
                    }
                } else {
                    usuario.setPermissao("Usuario");
                    if (validarEmail()) {
                        dao.cadastrar(usuario);
                    } else {
                        Mensagem.mensagemErro("Codigo Inválido");
                    }
                }
                this.dispose();
                Janelas.irEntrar();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private boolean validarEmail() {
        ClasseEmail email = new ClasseEmail();
        String to = "epaalterxi.cia@hotmail.com";
        String subject = "Teste email";
        String content = "Pronto";
        String a = email.validarCadastro(to, subject, content);
        String b = JOptionPane.showInputDialog("Abra o seu email e copie o codigo que foi enviado\n"
                + "Digite o codigo enviado para o email:\n ");
        return a.equals(b);
    }

    private boolean validacao() {
        boolean usuarioExiste = dao.verificarExistenciaUsuario(txtNome.getText());
        if (txtNome.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Usuario não pode estar vazio");
            txtNome.requestFocus();
            return false;
        }
        if (txtCPF.getText().equals("   .   .   -  ")) {
            Mensagem.mensagemAlerta("O Campo CPF não pode estar vazio");
            txtCPF.requestFocus();
            return false;
        }
        if (txtEmail.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Email não pode estar vazio");
            txtEmail.requestFocus();
            return false;
        }
        if (txtSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O Campo Senha não pode estar vazio");
            txtSenha.requestFocus();
            return false;
        }
        if (txtConfirmarSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O Campo Confirmar Senha não pode estar vazio");
            txtConfirmarSenha.requestFocus();
            return false;
        }
        if (!Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword())) {
            Mensagem.mensagemAlerta("O Campo Senha e Confirmar Senha não são iguais");
            return false;
        }
        if (usuarioExiste) {
            Mensagem.mensagemAlerta("Este Usuário já está cadastrado");
            return false;
        }
        return true;
    }


    private void mostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaMouseClicked
        txtSenha.setEchoChar('*');
        if (senhaVisivel) {
            txtSenha.setEchoChar('*');
            senhaVisivel = false;
        } else {
            txtSenha.setEchoChar((char) 0);
            senhaVisivel = true;
        }
    }//GEN-LAST:event_mostrarSenhaMouseClicked

    private void mostrarConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarConfirmarMouseClicked
        txtConfirmarSenha.setEchoChar('*');
        if (senhaVisivel) {
            txtConfirmarSenha.setEchoChar('*');
            senhaVisivel = false;
        } else {
            txtConfirmarSenha.setEchoChar((char) 0);
            senhaVisivel = true;
        }
    }//GEN-LAST:event_mostrarConfirmarMouseClicked

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtConfirmarSenha.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            java.awt.event.ActionEvent evts = null;
            botaoCadastrarActionPerformed(evts);
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrarConfirmar;
    private javax.swing.JLabel mostrarSenha;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
