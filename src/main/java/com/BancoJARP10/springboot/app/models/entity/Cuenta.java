package com.BancoJARP10.springboot.app.models.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "cuentas")
public class Cuenta implements Serializable{

	
	private static final long serialVersionUID = 4823825401601770044L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCuenta;
	
	@Column(name="saldo_actual")
	@NotEmpty
	private double saldoActual;
	
	@Column(name="creacion")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date creacion;

	/*
	@Column
	private long idCliente;
	*/
	
	@JoinColumn(name="cliente", referencedColumnName="idCliente", nullable=false)
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Cliente cliente;

	public long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
