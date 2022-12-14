/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.systempadaria;


public class InterfaceProdutos extends javax.swing.JFrame {
    TableProdutos produtos = new TableProdutos();

    public InterfaceProdutos() {
        initComponents();
        
        TBProdutos.setModel(produtos);
        
    }

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tbNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuClientesCadastro = new javax.swing.JMenuItem();
        jMenuClientesAlterar = new javax.swing.JMenuItem();
        jMenuClientesExcluir = new javax.swing.JMenuItem();
        jMenuClientesPesquisar = new javax.swing.JMenuItem();
        jMenuClientesExtrato = new javax.swing.JMenuItem();
        jMenuConfig = new javax.swing.JMenu();
        jMenuConfigCadastroUsuario = new javax.swing.JMenuItem();
        jMenuConfigEditarUsuario = new javax.swing.JMenuItem();
        jMenuConfigFonte = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuFinalizarSessao = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Alterar");

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pesquisar");

        jButton4.setText("Cadastrar");

        jLabel1.setText("Nome");

        jLabel2.setText("Codigo");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Valor");

        TBProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TBProdutos);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuInicio.setText("Inicio");
        jMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInicioMouseClicked(evt);
            }
        });
        jMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuInicio);

        jMenuProdutos.setText("Produtos");
        jMenuProdutos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenuProdutosStateChanged(evt);
            }
        });
        jMenuProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProdutosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuProdutos);

        jMenuClientes.setText("Clientes");

        jMenuClientesCadastro.setText("Cadastrar");
        jMenuClientes.add(jMenuClientesCadastro);

        jMenuClientesAlterar.setText("Alterar");
        jMenuClientes.add(jMenuClientesAlterar);

        jMenuClientesExcluir.setText("Excluir ");
        jMenuClientes.add(jMenuClientesExcluir);

        jMenuClientesPesquisar.setText("Pesquisar");
        jMenuClientes.add(jMenuClientesPesquisar);

        jMenuClientesExtrato.setText("Extrato Mensal");
        jMenuClientes.add(jMenuClientesExtrato);

        jMenuBar1.add(jMenuClientes);

        jMenuConfig.setText("Configura????es");

        jMenuConfigCadastroUsuario.setText("Cadastrar Usuario");
        jMenuConfig.add(jMenuConfigCadastroUsuario);

        jMenuConfigEditarUsuario.setText("Editar Usuario");
        jMenuConfig.add(jMenuConfigEditarUsuario);

        jMenuConfigFonte.setText("Fonte");
        jMenuConfig.add(jMenuConfigFonte);

        jMenuBar1.add(jMenuConfig);

        jMenu4.setText("Informa????es");

        jMenuItem13.setText("Informa????es Sistema");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Informa????es Empresa");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenuFinalizarSessao.setText("Finalizar Sess??o");
        jMenuFinalizarSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuFinalizarSessaoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuFinalizarSessao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addGap(12, 12, 12)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbCodigo)
                                .addComponent(tbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbQuantidade)
                                .addComponent(tbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        InterfaceMenu iMenu = new InterfaceMenu();
        this.dispose();
        iMenu.setVisible(true);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioActionPerformed

    }//GEN-LAST:event_jMenuInicioActionPerformed

    private void jMenuProdutosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenuProdutosStateChanged

    }//GEN-LAST:event_jMenuProdutosStateChanged

    private void jMenuProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProdutosMouseClicked
        InterfaceProdutos iLogoProdutos = new InterfaceProdutos();
        this.dispose();
        iLogoProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosMouseClicked

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuFinalizarSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuFinalizarSessaoMouseClicked
        InterfaceLogin iLogoOff = new InterfaceLogin();
        this.dispose();
        iLogoOff.setVisible(true);
    }//GEN-LAST:event_jMenuFinalizarSessaoMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBProdutos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuClientesAlterar;
    private javax.swing.JMenuItem jMenuClientesCadastro;
    private javax.swing.JMenuItem jMenuClientesExcluir;
    private javax.swing.JMenuItem jMenuClientesExtrato;
    private javax.swing.JMenuItem jMenuClientesPesquisar;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JMenuItem jMenuConfigCadastroUsuario;
    private javax.swing.JMenuItem jMenuConfigEditarUsuario;
    private javax.swing.JMenuItem jMenuConfigFonte;
    private javax.swing.JMenu jMenuFinalizarSessao;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbNome;
    private javax.swing.JTextField tbQuantidade;
    private javax.swing.JTextField tbValor;
    // End of variables declaration//GEN-END:variables
}
