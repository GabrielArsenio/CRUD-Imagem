package controller;

import DAO.ImagemDAO;
import DAO.JPA.ImagemDAOJPA;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;
import model.Imagem;

/**
 *
 * @author gabriel_arsenio
 */
public class ImagemController {

    public Imagem salvar(Imagem imagem) {
        ImagemDAO dao = new ImagemDAOJPA();
        return dao.save(imagem);
    }

    public boolean excluir(int codigo) {
        ImagemDAO dao = new ImagemDAOJPA();
        return dao.remove(Imagem.class, codigo);
    }

    public List<Imagem> listarImagens() {
        ImagemDAO dao = new ImagemDAOJPA();
        return dao.getAll(Imagem.class);
    }

    public Imagem listarImagemById(int codigo) {
        ImagemDAO dao = new ImagemDAOJPA();
        return dao.getById(Imagem.class, codigo);
    }

    public List<Imagem> pesquisarNome(String nome) {
        ImagemDAO dao = new ImagemDAOJPA();
        return dao.pesquisarNome(nome);
    }

    /* Transforma imagem para byte. Funciona com qualquer arquivo, não
     necessariamente uma imagem. */
    public byte[] imagemParaByte(String caminhoImagem) {
        InputStream entrada;
        byte[] imagemByte = null;
        try {
            entrada = new FileInputStream(caminhoImagem);//Busca a imagem atravéz do caminho
            imagemByte = new byte[entrada.available()];//Retorna o número de bytes do arquivo
            entrada.read(imagemByte);//Faz um paranauê que eu não sei explicar
            entrada.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao converter para Byte.\n" + ex.getMessage());
        }
        return imagemByte;
    }

    public void ByteParaImagem(byte[] imagemByte, String nome) {
        byte[] imgBytes = imagemByte;// Recebe a imagem em bytes
        try {
            /* Define o caminho de saída. De preferência no mesmo formato que entrou. */
            FileOutputStream fos = new FileOutputStream("src\\imagens\\" + nome);
            fos.write(imgBytes);//Começa a "escrever" os bytes do arquivo no local de saída
            FileDescriptor fd = fos.getFD();
            fos.flush();
            fd.sync();
            fos.close();//Finaliza a montagem da imagem            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar imagem.\n" + ex.getMessage());
        }
    }

    public String ByteParaImagem(String nome, byte[] imagemByte) {
        byte[] imgBytes = imagemByte;// Recebe a imagem em bytes
        try {
            /* Define o caminho de saída. De preferência no mesmo formato que entrou. */
            FileOutputStream fos = new FileOutputStream("src\\imagens\\" + nome);
            fos.write(imgBytes);//Começa a "escrever" os bytes do arquivo no local de saída
            FileDescriptor fd = fos.getFD();
            fos.flush();
            fd.sync();
            fos.close();//Finaliza a montagem da imagem
            return "src\\imagens\\" + nome;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar imagem.\n" + ex.getMessage());
            return null;
        }
    }
}
