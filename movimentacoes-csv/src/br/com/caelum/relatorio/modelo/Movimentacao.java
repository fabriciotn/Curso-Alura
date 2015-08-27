package br.com.caelum.relatorio.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

public class Movimentacao {

	private Integer id;
	private String descricao;
	private Calendar data;
	private BigDecimal valor;
	private TipoMovimentacao tipoMovimentacao;

	public Movimentacao(Calendar data, String descricao, 
			TipoMovimentacao tipoMovimentacao, BigDecimal valor) {
		this.data = (Calendar) data.clone();
		this.tipoMovimentacao = tipoMovimentacao;
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Calendar getData() {
		return data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	@Override
	public String toString() {
		return "Movimentacao [id=" + id + ", descricao=" + descricao
				+ ", valor=" + valor + ", tipoMovimentacao=" + tipoMovimentacao +
				"]";
	}

}
