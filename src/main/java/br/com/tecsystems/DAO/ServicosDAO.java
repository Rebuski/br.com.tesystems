/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.Servicos;

/**
 * @author Adler
 *
 */
public class ServicosDAO {

	 public Servicos save(Servicos servico){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (servico.getIdServicos() == null) {
	                //salva
	                em.persist(servico);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(servico);
	            }
	        //persiste o objeto
	        em.persist(servico);
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
	        return servico;
	    }
	    //Busca todos os dados contidos no banco

	public List<Servicos> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<Servicos> servicos = null;
	        
	        try {
	            
	            servicos = em.createQuery("from Servico s").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return servicos;
	    } 
}
