/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.model.Cliente;

/**
 * @author Adler
 *
 */
public class ClienteDAO {

	private EntityManager em;
	
	public ClienteDAO() {
		DAO dao = new DAO();
		em = dao.getEntity();
	}
//Buscar por ID
public Cliente getById(final int id) {
	return em.find(Cliente.class, id);
	}

//Salvar
public void save(Cliente c) {
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
	}

//Atualizar
public void atualizar(Cliente c) {
	em.getTransaction().begin();
	em.merge(c);
	em.getTransaction().commit();
	}

//Remover o objeto por atributo
public void remover(Cliente c) {
	em.getTransaction().begin();
	Cliente clienteRemover = getById(c.getIdCliente());
	em.remove(clienteRemover);
	em.getTransaction().commit();
	}

//Consultar
@SuppressWarnings("unchecked")
public List<Cliente> getAll(){
	return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}

}
