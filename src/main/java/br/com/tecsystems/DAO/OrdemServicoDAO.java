/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.OrdemServico;

/**
 * @author Adler
 *
 */
public class OrdemServicoDAO {

	 public OrdemServico save(OrdemServico ordem){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (ordem.getIdOrdem()== null) {
	                //salva
	                em.persist(ordem);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(ordem);
	            }
	        //persiste o objeto
	        em.persist(ordem);
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
	        return ordem;
	    }
	    //Busca todos os dados contidos no banco

	public List<OrdemServico> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<OrdemServico> servicos = null;
	        
	        try {
	            
	            servicos = em.createQuery("from OrdemServico o").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return servicos;
	    } 
}
