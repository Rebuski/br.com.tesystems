/**
 * 
 */
package br.com.tecsystems.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tecsystems.jpa.Conexao;
import br.com.tecsystems.model.FiladeCompras;

/**
 * @author Adler
 *
 */
public class FilaDeComprasDAO {

	 public FiladeCompras save(FiladeCompras compra){
	        
	        EntityManager em = (EntityManager) new Conexao();
	        
	        try {
	        //incia a transação
	        em.getTransaction().begin();
	            if (compra.getIdCompra()== null) {
	                //salva
	                em.persist(compra);
	            }else{
	                //update chamando o merge para tal função
	                em.merge(compra);
	            }
	        //persiste o objeto
	        em.persist(compra);
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
	        return compra;
	    }
	    //Busca todos os dados contidos no banco

	public List<FiladeCompras> findAll(){
		 	EntityManager em = (EntityManager) new Conexao();
	        List<FiladeCompras> compras = null;
	        
	        try {
	            
	            compras = em.createQuery("from FilaCompra f").getResultList();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	            
	        }finally{
	            em.close();
	        }
	        return compras;
	    } 
}
