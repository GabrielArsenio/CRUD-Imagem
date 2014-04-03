package DAO;

import java.util.List;
import model.Imagem;

/**
 *
 * @author gabriel_arsenio
 */
public interface ImagemDAO extends DAO<Imagem, Integer> {

    List<Imagem> pesquisarNome(String nome);
}
