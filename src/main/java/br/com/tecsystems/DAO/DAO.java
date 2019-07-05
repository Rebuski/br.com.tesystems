/**
 * 
 */
package br.com.tecsystems.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tecsystems.jpa.Conexao;

/**
 * @author Adler
 *
 */
public class DAO {
	

	private EntityManager em = null;
	
	public DAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("assistenciaJPA");
		if(em == null) {
			if(em == null) {
				em = emf.createEntityManager();
			}
		}
	}

	public EntityManager getEntity() {
		return em;
	}
	
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		conexao.getEntity();
	}
	
}
