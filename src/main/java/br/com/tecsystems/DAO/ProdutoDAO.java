/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.Produto;

/**
 * @author Adler
 *
 */
public class ProdutoDAO {
	
	 public Produto save(Produto produto){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (produto.getIdProduto()== null) {
	                //salva
	                em.persist(produto);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(produto);
	            }
	        //persiste o objeto
	        em.persist(produto);
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
	        return produto;
	    }
	    //Busca todos os dados contidos no banco

	public List<Produto> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<Produto> produtos = null;
	        
	        try {
	            
	            produtos = em.createQuery("from Produto p").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return produtos;
	    } 

}
