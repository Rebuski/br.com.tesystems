/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecsystems.jpa;

/**
 *
 * @author Adler
 */
public class ConexaoException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void JPAException(String ex){
        System.out.printf("Erro na conexão: \n" + ex);
    }
}
