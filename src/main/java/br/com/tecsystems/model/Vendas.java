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
@Table(name="tb_vendas")
public class Vendas {
    @Id
    @GeneratedValue
    private Integer idVendas;
    private String cartao;
    private String servico;
    private String dispositivo;
    private String status;
    private String tipoPagamento;
    private Double valorProduto;
    private Double valorFrete;
    private Double valorCobrado;
    private Double prejuizo;
    private Double lucro;
    private Cliente cliente;
    private Funcionario funcionario; 

 

	/**
     * @return the idVendas
     */
    public Integer getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(Integer idVendas) {
        this.idVendas = idVendas;
    }

    /**
     * @return the cartao
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the servico
     */
    public String getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(String servico) {
        this.servico = servico;
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
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
