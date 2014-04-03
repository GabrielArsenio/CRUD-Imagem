package DAO.JPA;

import DAO.DAO;
import UTIL.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_arsenio
 */
public abstract class DAOJPA<T, I> implements DAO<T, I> {

    private JPAUtil conexao;

    @Override
    public T save(T entity) {
        T saved = null;
        try {
            //Abre a transação
            getEntityManager().getTransaction().begin();
            //Persiste a entidade na base de dados
            saved = getEntityManager().merge(entity);
            //Confirma a transação
            getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            //Se a transação for ativa
            if (getEntityManager().getTransaction().isActive() == true) {
                getEntityManager().getTransaction().begin();
            }
            //Desfaz a transação
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar o registro. " + e.getMessage());
        }
        return saved;
    }

    @Override
    public boolean remove(Class<T> classe, I pk) {
        boolean estado = false;
        try {
            T entity = getEntityManager().find(classe, pk);
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(entity);
            getEntityManager().getTransaction().commit();
            estado = true;
        } catch (Exception e) {
            if (getEntityManager().getTransaction().isActive() == false) {
                getEntityManager().getTransaction().begin();
            }
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(null,
                    "Erro ao excluir registro. " + e.getMessage());
        }
        return estado;
    }

    @Override
    public List<T> getAll(Class<T> classe) {
        // 'x' é o alias, nome para a classe
        return getEntityManager().createQuery(
                "select x from " + classe.getSimpleName() + " x").getResultList();
    }

    @Override
    public T getById(Class<T> classe, I pk) {
        try {
            return getEntityManager().find(classe, pk);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar por ID.\n" + e.getMessage());
            return null;
        }
    }

    @Override
    public EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new JPAUtil();
        }
        return conexao.getEmityManager();
    }
}
