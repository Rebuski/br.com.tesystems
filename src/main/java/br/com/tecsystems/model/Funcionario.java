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
@Table(name="tb_funcionario")
public class Funcionario extends Pessoa{
    
	@Id
	@GeneratedValue
    private Integer idFuncionario;
    private String nickname;
    private String funcao;
    private String senhaFuncionario;




	/**
     * @return the idFuncionario
     */
    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the senhaFuncionario
     */
    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    /**
     * @param senhaFuncionario the senhaFuncionario to set
     */
    
    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
}
