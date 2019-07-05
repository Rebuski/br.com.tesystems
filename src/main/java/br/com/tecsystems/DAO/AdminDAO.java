/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.Admin;
import br.com.tecsystems.model.Pessoa;



/**	
 * @author Adler
 *
 */
public class AdminDAO {				

	 public Admin save(Admin pessoa){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (pessoa.getIdPessoa()== null) {
	                //salva
	                em.persist(pessoa);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(pessoa);
	            }
	        //persiste o objeto
	        em.persist(pessoa);
	        //comita o objeto
	        em.getTransaction().commit();
	        //fecha a conexão
	        em.close();
	            
	        } catch (Exception e) {
	            //desfaz todas as operações
	            em.getTransaction().rollback();
	            
	        }finally{
	            //fecha o EntityManager
	            em.close();
	        }
	        //retorna a categoria inserida no banco de dados
	        return pessoa;
	    }
	    //Busca todos os dados contidos no banco
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<Pessoa> pessoas = null;
	        
	        try {
	            
	            pessoas = em.createQuery("from Pessoa p").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return pessoas;
	    }    
}
