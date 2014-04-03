package view;

import controller.ImagemController;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Imagem;

/**
 *
 * @author gabriel_arsenio
 */
public class InserirImagemGUI extends javax.swing.JFrame {

    private int linhaSelecionada;
    private int codigoImagem;
    private DefaultTableModel modelo;
    String caminhoImagem;

    public InserirImagemGUI(DefaultTableModel modelo) {
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
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);

        this.modelo = modelo;
        lbTextoCodigo.setText("");
    }

    public InserirImagemGUI(int linhaSelecionada, int codigoImagem, DefaultTableModel modelo) {
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
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirImagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);

        this.linhaSelecionada = linhaSelecionada;
        this.codigoImagem = codigoImagem;
        this.modelo = modelo;

        ImagemController ic = new ImagemController();
        Imagem img = ic.listarImagemById(codigoImagem);

        caminhoImagem = ic.ByteParaImagem(img.getNome(), img.getImagem());
        ImageIcon imagem = new ImageIcon(caminhoImagem);
        imagem = ajustaImagem(imagem);

        lbCodigo.setText(String.valueOf(img.getCodigo()));
        lbImagem.setIcon(imagem);
        lbNome.setText(img.getNome());
        new File(caminhoImagem).delete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletor = new javax.swing.JFileChooser();
        painelFundoInserir = new javax.swing.JPanel();
        painelImagem = new javax.swing.JPanel();
        lbImagem = new javax.swing.JLabel();
        btSelecionar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        lbTextoCodigo = new javax.swing.JLabel();

        seletor.setFileFilter(new FileNameExtensionFilter("Imagens GIF, JPG e JPEG", "jpg", "gif", "jpeg"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelImagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagem", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painelImagem.setLayout(new java.awt.BorderLayout());

        lbImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelImagem.add(lbImagem, java.awt.BorderLayout.CENTER);

        btSelecionar.setText("Procurar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btVoltar.setText("< Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lbTextoCodigo.setText("CÓDIGO");

        javax.swing.GroupLayout painelFundoInserirLayout = new javax.swing.GroupLayout(painelFundoInserir);
        painelFundoInserir.setLayout(painelFundoInserirLayout);
        painelFundoInserirLayout.setHorizontalGroup(
            painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFundoInserirLayout.createSequentialGroup()
                        .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar))
                    .addGroup(painelFundoInserirLayout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTextoCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        painelFundoInserirLayout.setVerticalGroup(
            painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltar)
                    .addGroup(painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTextoCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelFundoInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSelecionar)
                        .addComponent(btSalvar))
                    .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(painelFundoInserir, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        seletor.showOpenDialog(this);
        try {
            ImageIcon imagem = new javax.swing.ImageIcon(
                    seletor.getSelectedFile().getPath());

            ajustaImagem(imagem);

            lbImagem.setIcon(imagem);
            lbNome.setText(seletor.getSelectedFile().getName());
            caminhoImagem = seletor.getSelectedFile().getPath();
            btSalvar.setEnabled(true);
        } catch (NullPointerException nuex) {
            JOptionPane.showMessageDialog(null, "Escolha uma imagem!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null, "Erro ao inserir imagem. \n" + ex.getMessage());
        }
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        boolean insereAtualiza; //true = insere; false = atualiza
        if (lbImagem.getIcon() != null) {
            ImagemController im = new ImagemController();

            Imagem img = new Imagem();
            if (!lbCodigo.getText().equals("")) {
                img.setCodigo(Integer.parseInt(lbCodigo.getText()));
                insereAtualiza = false;
            } else {
                insereAtualiza = true;
            }
            img.setNome(lbNome.getText());
            img.setImagem(im.imagemParaByte(caminhoImagem));

            img = im.salvar(img);

            if (insereAtualiza == false) {
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{img.getCodigo(), img.getNome()});
            } else {
                modelo.addRow(new Object[]{img.getCodigo(), img.getNome()});
            }
            resetarFrame();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem.");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        resetarFrame();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTextoCodigo;
    private javax.swing.JPanel painelFundoInserir;
    private javax.swing.JPanel painelImagem;
    private javax.swing.JFileChooser seletor;
    // End of variables declaration//GEN-END:variables

    private void resetarFrame() {
        lbImagem.setIcon(null);
        lbNome.setText(null);
    }

    private ImageIcon ajustaImagem(ImageIcon imagem) {
        //Ajusta largura
        if (imagem.getIconWidth() > lbImagem.getWidth()) {

            imagem.setImage(imagem.getImage().getScaledInstance(
                    lbImagem.getWidth(), imagem.getIconHeight(), 100));
        }

        //Ajusta altura
        if (imagem.getIconHeight() > lbImagem.getHeight()) {

            imagem.setImage(imagem.getImage().getScaledInstance(
                    imagem.getIconWidth(), lbImagem.getHeight(), 100));
        }

        return imagem;
    }
}
