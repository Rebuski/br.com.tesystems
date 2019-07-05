/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.Vendas;

/**
 * @author Adler
 *
 */
public class VendasDAO {

	 public Vendas save(Vendas venda){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (venda.getIdVendas()== null) {
	                //salva
	                em.persist(venda);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(venda);
	            }
	        //persiste o objeto
	        em.persist(venda);
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
	        return venda;
	    }
	    //Busca todos os dados contidos no banco

	public List<Vendas> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<Vendas> vendas = null;
	        
	        try {
	            
	            vendas = em.createQuery("from Vendas v").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return vendas;
	    } 
}
