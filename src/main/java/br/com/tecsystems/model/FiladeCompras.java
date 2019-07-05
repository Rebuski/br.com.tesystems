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
@Table(name="tb_filaDeCompras")
public class FiladeCompras {
    @Id
    @GeneratedValue
    private Integer idCompra;
    private String status;
    private String nome;
    private String tipoCompra;
    private String dispositivo;
    private String peca;
    private Double valorProduto;
    private Double valorFrete;
    private Double valorCobrado;
    private Double prejuizo;
    private Double lucro;
    private Double investimento;
    private Funcionario funcionario;
    private Admin admin;

    /**
     * @return the idCompra
     */
    public Integer getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tipoCompra
     */
    public String getTipoCompra() {
        return tipoCompra;
    }

    /**
     * @param tipoCompra the tipoCompra to set
     */
    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    /**
     * @return the dispositivo
     */
    public String getDispositivo() {
        return dispositivo;
    }

    /**
     * @param dispositivo the dispositivo to set
     */
    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    /**
     * @return the peca
     */
    public String getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(String peca) {
        this.peca = peca;
    }

    /**
     * @return the valorProduto
     */
    public Double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    /**
     * @return the valorFrete
     */
    public Double getValorFrete() {
        return valorFrete;
    }

    /**
     * @param valorFrete the valorFrete to set
     */
    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    /**
     * @return the valorCobrado
     */
    public Double getValorCobrado() {
        return valorCobrado;
    }

    /**
     * @param valorCobrado the valorCobrado to set
     */
    public void setValorCobrado(Double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    /**
     * @return the prejuizo
     */
    public Double getPrejuizo() {
        return prejuizo;
    }

    /**
     * @param prejuizo the prejuizo to set
     */
    public void setPrejuizo(Double prejuizo) {
        this.prejuizo = prejuizo;
    }

    /**
     * @return the lucro
     */
    public Double getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    /**
     * @return the investimento
     */
    public Double getInvestimento() {
        return investimento;
    }

    /**
     * @param investimento the investimento to set
     */
    public void setInvestimento(Double investimento) {
        this.investimento = investimento;
    }

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
