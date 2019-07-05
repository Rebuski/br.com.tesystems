/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecsystems.jpa;

import java.sql.Connection;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adler
 */
public class Conexao {

	static Connection conn = null;
	EntityManagerFactory emf = null;

	public Conexao() {

		if (emf == null) {
			emf = createEntity();

		} else {
			getEntity();
		}
	}

	public EntityManagerFactory createEntity() {
		emf = Persistence.createEntityManagerFactory("assistenciaPU");
		return emf;
	}

	public void closeEMF() {
		emf.close();
	}

	public EntityManagerFactory getEntity() {
		return emf;
	}
}