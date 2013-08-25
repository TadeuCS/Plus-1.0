/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Tadeu
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo_atalhos = new javax.swing.JPanel();
        atalho_clientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        atalho_locacao = new javax.swing.JPanel();
        atalho_emprestimos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnl_fundo = new javax.swing.JPanel();
        pnl_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        pnl_barraStatus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_userLogado = new javax.swing.JTextField();
        mb_menus = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        mi_produto = new javax.swing.JMenuItem();
        mi_cliente = new javax.swing.JMenuItem();
        mi_transportador = new javax.swing.JMenuItem();
        mi_veiculo = new javax.swing.JMenuItem();
        mi_usuario = new javax.swing.JMenuItem();
        mi_movimentacao = new javax.swing.JMenu();
        mi_locacao = new javax.swing.JMenuItem();
        mi_relatorios = new javax.swing.JMenu();
        mi_relClieCad = new javax.swing.JMenuItem();
        mi_relEmpr = new javax.swing.JMenuItem();
        mi_relFluxTrans = new javax.swing.JMenuItem();
        mi_configuracao = new javax.swing.JMenu();
        mi_veiculo1 = new javax.swing.JMenuItem();
        mi_veiculo2 = new javax.swing.JMenuItem();
        mi_ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plus 1.0");

        fundo_atalhos.setBackground(new java.awt.Color(204, 204, 204));
        fundo_atalhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atalho_clientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout atalho_clientesLayout = new javax.swing.GroupLayout(atalho_clientes);
        atalho_clientes.setLayout(atalho_clientesLayout);
        atalho_clientesLayout.setHorizontalGroup(
            atalho_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        atalho_clientesLayout.setVerticalGroup(
            atalho_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLIENTES");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOCAÇÃO");

        atalho_locacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout atalho_locacaoLayout = new javax.swing.GroupLayout(atalho_locacao);
        atalho_locacao.setLayout(atalho_locacaoLayout);
        atalho_locacaoLayout.setHorizontalGroup(
            atalho_locacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        atalho_locacaoLayout.setVerticalGroup(
            atalho_locacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        atalho_emprestimos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout atalho_emprestimosLayout = new javax.swing.GroupLayout(atalho_emprestimos);
        atalho_emprestimos.setLayout(atalho_emprestimosLayout);
        atalho_emprestimosLayout.setHorizontalGroup(
            atalho_emprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        atalho_emprestimosLayout.setVerticalGroup(
            atalho_emprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REL.EMPRÉSTIMO");

        javax.swing.GroupLayout fundo_atalhosLayout = new javax.swing.GroupLayout(fundo_atalhos);
        fundo_atalhos.setLayout(fundo_atalhosLayout);
        fundo_atalhosLayout.setHorizontalGroup(
            fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo_atalhosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atalho_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atalho_locacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atalho_emprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundo_atalhosLayout.setVerticalGroup(
            fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo_atalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fundo_atalhosLayout.createSequentialGroup()
                        .addComponent(atalho_emprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(fundo_atalhosLayout.createSequentialGroup()
                        .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atalho_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atalho_locacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fundo_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGap(2, 2, 2))
        );

        pnl_login.setBackground(new java.awt.Color(204, 204, 204));
        pnl_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_login.setToolTipText("Login");

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("Usuário:");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setText("Senha:");

        btn_entrar.setText("Entrar");

        btn_sair.setText("Sair");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loginLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_loginLayout.createSequentialGroup()
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_loginLayout.createSequentialGroup()
                        .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(20, 20, 20))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txt_senha))
                .addGap(42, 42, 42)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_entrar)
                    .addComponent(btn_sair))
                .addGap(28, 28, 28))
        );

        pnl_barraStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel7.setText("Usuário:");

        txt_userLogado.setEditable(false);
        txt_userLogado.setBackground(new java.awt.Color(204, 204, 204));
        txt_userLogado.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnl_barraStatusLayout = new javax.swing.GroupLayout(pnl_barraStatus);
        pnl_barraStatus.setLayout(pnl_barraStatusLayout);
        pnl_barraStatusLayout.setHorizontalGroup(
            pnl_barraStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_userLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_barraStatusLayout.setVerticalGroup(
            pnl_barraStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(txt_userLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pnl_barraStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_barraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mb_menus.setBackground(new java.awt.Color(153, 153, 153));

        menuCadastro.setForeground(new java.awt.Color(51, 51, 51));
        menuCadastro.setText("Cadastro");
        menuCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mi_produto.setText("Produto");
        mi_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_produtoActionPerformed(evt);
            }
        });
        menuCadastro.add(mi_produto);

        mi_cliente.setText("Cliente");
        menuCadastro.add(mi_cliente);

        mi_transportador.setText("Transportador");
        menuCadastro.add(mi_transportador);

        mi_veiculo.setText("Veículo");
        menuCadastro.add(mi_veiculo);

        mi_usuario.setText("Usuario");
        menuCadastro.add(mi_usuario);

        mb_menus.add(menuCadastro);

        mi_movimentacao.setForeground(new java.awt.Color(51, 51, 51));
        mi_movimentacao.setText("Movimentações");
        mi_movimentacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mi_locacao.setText("Locação");
        mi_movimentacao.add(mi_locacao);

        mb_menus.add(mi_movimentacao);

        mi_relatorios.setForeground(new java.awt.Color(51, 51, 51));
        mi_relatorios.setText("Relatórios");
        mi_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mi_relClieCad.setText("Relatório de Clientes Cadastrados");
        mi_relatorios.add(mi_relClieCad);

        mi_relEmpr.setText("Relatório de Empréstimos");
        mi_relEmpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_relEmprActionPerformed(evt);
            }
        });
        mi_relatorios.add(mi_relEmpr);

        mi_relFluxTrans.setText("Relatório de Fluxo de Transportes");
        mi_relatorios.add(mi_relFluxTrans);

        mb_menus.add(mi_relatorios);

        mi_configuracao.setForeground(new java.awt.Color(51, 51, 51));
        mi_configuracao.setText("Configuração");
        mi_configuracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mi_veiculo1.setText("Parametrização");
        mi_configuracao.add(mi_veiculo1);

        mi_veiculo2.setText("Permissões");
        mi_configuracao.add(mi_veiculo2);

        mb_menus.add(mi_configuracao);

        mi_ajuda.setForeground(new java.awt.Color(51, 51, 51));
        mi_ajuda.setText("Ajuda");
        mi_ajuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mb_menus.add(mi_ajuda);

        setJMenuBar(mb_menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo_atalhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo_atalhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_produtoActionPerformed

    private void mi_relEmprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_relEmprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_relEmprActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal p = new Principal();
                p.setExtendedState(JFrame.MAXIMIZED_BOTH);
                p.setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atalho_clientes;
    private javax.swing.JPanel atalho_emprestimos;
    private javax.swing.JPanel atalho_locacao;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPanel fundo_atalhos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar mb_menus;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu mi_ajuda;
    private javax.swing.JMenuItem mi_cliente;
    private javax.swing.JMenu mi_configuracao;
    private javax.swing.JMenuItem mi_locacao;
    private javax.swing.JMenu mi_movimentacao;
    private javax.swing.JMenuItem mi_produto;
    private javax.swing.JMenuItem mi_relClieCad;
    private javax.swing.JMenuItem mi_relEmpr;
    private javax.swing.JMenuItem mi_relFluxTrans;
    private javax.swing.JMenu mi_relatorios;
    private javax.swing.JMenuItem mi_transportador;
    private javax.swing.JMenuItem mi_usuario;
    private javax.swing.JMenuItem mi_veiculo;
    private javax.swing.JMenuItem mi_veiculo1;
    private javax.swing.JMenuItem mi_veiculo2;
    private javax.swing.JPanel pnl_barraStatus;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_userLogado;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
