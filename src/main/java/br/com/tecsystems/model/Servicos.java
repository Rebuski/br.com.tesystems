/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecsystems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adler
 */
@Entity
@Table(name="tb_servicos")
public class Servicos {
	
	@Id
	@GeneratedValue
    private Integer idServicos;
	private Funcionario funcionario;

    /**
     * @return the idServicos
     */
    public Integer getIdServicos() {
        return idServicos;
    }

    /**
     * @param idServicos the idServicos to set
     */
    public void setIdServicos(Integer idServicos) {
        this.idServicos = idServicos;
    }

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
    
    
}
