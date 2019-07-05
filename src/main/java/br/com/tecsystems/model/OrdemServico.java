/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecsystems.model;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adler
 */
@Entity
@Table(name="tb_ordemServico")
public class OrdemServico {
    
	@Id
	@GeneratedValue
    private Integer idOrdem;
    private LocalDate dataEntrada;
    private LocalDate previsaoSaida;
    private String acessorio;
    private String detalheObs;
    private String descDefeito;
    private Double valorTotal;
    private Vendas vendas;

    /**
     * @return the idOrdem
     */
    public Integer getIdOrdem() {
        return idOrdem;
    }

    /**
     * @param idOrdem the idOrdem to set
     */
    public void setIdOrdem(Integer idOrdem) {
        this.idOrdem = idOrdem;
    }

    /**
     * @return the dataEntrada
     */
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the previsaoSaida
     */
    public LocalDate getPrevisaoSaida() {
        return previsaoSaida;
    }

    /**
     * @param previsaoSaida the previsaoSaida to set
     */
    public void setPrevisaoSaida(LocalDate previsaoSaida) {
        this.previsaoSaida = previsaoSaida;
    }

    /**
     * @return the acessorio
     */
    public String getAcessorio() {
        return acessorio;
    }

    /**
     * @param acessorio the acessorio to set
     */
    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    /**
     * @return the detalheObs
     */
    public String getDetalheObs() {
        return detalheObs;
    }

    /**
     * @param detalheObs the detalheObs to set
     */
    public void setDetalheObs(String detalheObs) {
        this.detalheObs = detalheObs;
    }

    /**
     * @return the descDefeito
     */
    public String getDescDefeito() {
        return descDefeito;
    }

    /**
     * @param descDefeito the descDefeito to set
     */
    public void setDescDefeito(String descDefeito) {
        this.descDefeito = descDefeito;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

	/**
	 * @return the vendas
	 */
	public Vendas getVendas() {
		return vendas;
	}

	/**
	 * @param vendas the vendas to set
	 */
	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}
}
