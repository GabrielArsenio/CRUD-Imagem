package DAO.JPA;

import DAO.ImagemDAO;
import java.util.List;
import model.Imagem;

/**
 *
 * @author gabriel_arsenio
 */
public class ImagemDAOJPA extends DAOJPA<Imagem, Integer> implements ImagemDAO {

    @Override
    public List<Imagem> pesquisarNome(String nome) {
        return getEntityManager().createQuery(
                "select c from Imagem c where c.nome like '%" + nome + "%'")
                .getResultList();
    }
}
