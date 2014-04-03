package app;

import javax.swing.JOptionPane;
import view.ListarImagemGUI;

/**
 *
 * @author gabriel_arsenio
 */
public class Principal {

    public static void main(String[] args) {
        new ListarImagemGUI().setVisible(true);
        JOptionPane.showMessageDialog(null,
                "NOTA: O campo do banco onde será armazenada a imagem suporta arquivos de no máximo 2048 KB. \n"
                + "Existe campos que suportam tamanhos maiores mas não precisaremos de tudo isso para uma simples demonstração.");
    }
}
