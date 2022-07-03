package io.github.wferdinando.veiuclos.dominio;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tab_veiculo")
public class Veiculo {

	@Id
	@GeneratedValue
	private Long codigo;
	
	@Column(length = 60, nullable = false)
	private String fabricante;
	
	@Column(length = 60, nullable = false)
	private String modelo;
	
	@Column(name="ano_fabricacao", nullable = false)
	private Integer anoFabricacao;
	
	@Column(name="ano_modelo", nullable = false)
	private Integer anoModelo;

	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal valor;

	
	public Veiculo() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	

}
