package view;

import controller.ImagemController;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Imagem;

/**
 *
 * @author gabriel_arsenio
 */
public class ListarImagemGUI extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private JTable tabela;
    
    public ListarImagemGUI() {
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
            java.util.logging.Logger.getLogger(ListarImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(ListarImagemGUI.MAXIMIZED_BOTH);
        criaTabela();
        //formWindowGainedFocus(null);// Ignore the gamby
        scrollPainel.setViewportView(tabela);
    }
    
    public JPanel getPainelFundoLista() {
        return painelFundoLista;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletor = new javax.swing.JFileChooser();
        painelFundoLista = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRecuperar = new javax.swing.JButton();
        scrollPainel = new javax.swing.JScrollPane();
        txPesquisa = new javax.swing.JTextField();

        seletor.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRecuperar.setText("Recuperar");
        btRecuperar.setToolTipText("Recupera a imagem do banco de dados e coloca na pasta \"imagens\" dentro da pasta do projeto.");
        btRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarActionPerformed(evt);
            }
        });

        txPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoListaLayout = new javax.swing.GroupLayout(painelFundoLista);
        painelFundoLista.setLayout(painelFundoListaLayout);
        painelFundoListaLayout.setHorizontalGroup(
            painelFundoListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPainel)
                    .addGroup(painelFundoListaLayout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)
                        .addGap(11, 11, 11)
                        .addComponent(btRecuperar)))
                .addContainerGap())
        );
        painelFundoListaLayout.setVerticalGroup(
            painelFundoListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btEditar)
                    .addComponent(btExcluir)
                    .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRecuperar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(painelFundoLista, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        new InserirImagemGUI(modelo).setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed
    
    private void btRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int codigo = (int) tabela.getValueAt(linhaSelecionada, 0);

            ImagemController ic = new ImagemController();
            Imagem img = ic.listarImagemById(codigo);
            ic.ByteParaImagem(img.getImagem(), img.getNome());

            JOptionPane.showMessageDialog(null, " Imagem recuperada com sucesso!\n "
                    + "O arquivo está na pasta 'imagens' dentro da pasta do projeto.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma imagem selecionada.");
        }
    }//GEN-LAST:event_btRecuperarActionPerformed
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int codigo = (int) tabela.getValueAt(linhaSelecionada, 0);
            ImagemController ic = new ImagemController();
            
            if (ic.excluir(codigo)) {
                modelo.removeRow(tabela.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Imagem excluída com sucesso.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma imagem foi selecionada.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed
    
    private void txPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaActionPerformed
        modelo.setNumRows(0);
        ImagemController ic = new ImagemController();
        for (Imagem img : ic.pesquisarNome(txPesquisa.getText())) {
            modelo.addRow(new Object[]{img.getCodigo(), img.getNome()});
        }
    }//GEN-LAST:event_txPesquisaActionPerformed
    
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int codigo = (int) tabela.getValueAt(linhaSelecionada, 0);
            new InserirImagemGUI(linhaSelecionada, codigo, modelo).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma imagem foi selecionada.");
        }
    }//GEN-LAST:event_btEditarActionPerformed
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    }//GEN-LAST:event_formWindowGainedFocus
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRecuperar;
    private javax.swing.JPanel painelFundoLista;
    private javax.swing.JScrollPane scrollPainel;
    private javax.swing.JFileChooser seletor;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {
        tabela = new JTable(modelo);
        modelo.setNumRows(0);
        modelo.setColumnCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        preencherTable();
    }
    
    private void preencherTable() {
        ImagemController im = new ImagemController();
        for (Imagem img : im.listarImagens()) {
            modelo.addRow(new Object[]{img.getCodigo(), img.getNome()});
        }
    }
}
