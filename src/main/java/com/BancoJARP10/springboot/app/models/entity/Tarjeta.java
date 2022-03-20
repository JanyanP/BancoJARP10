package com.BancoJARP10.springboot.app.models.entity;


import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "tarjetas")
public class Tarjeta implements Serializable{

	
	private static final long serialVersionUID = -4745590177488489326L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTarjeta;
	
	@Column(name="numero_tarjeta", length = 16)
	@NotEmpty
	private String numeroTarjeta;
	/*
	@Column
	private long idCuenta;
	*/
	@Column(name="icv", length = 3)
	@NotEmpty
	private String icv;
	
	@Column(name="tipo_tarjeta")
	@NotEmpty
	private String tipoTarjeta;
	
	@JoinColumn(name="cuenta", referencedColumnName="idCuenta", nullable=false)
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Cuenta cuenta;

	public long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getIcv() {
		return icv;
	}

	public void setIcv(String icv) {
		this.icv = icv;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
