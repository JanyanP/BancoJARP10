package com.BancoJARP10.springboot.app.models.entity;



import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "clientes")
public class Cliente implements Serializable{

	
	private static final long serialVersionUID = -8855548360535601467L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private String idCliente;
	
	@Column(name="nombre")
	@NotEmpty
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty
	private String apellido;
	
	@Column(name="numero_telefonico")
	@NotEmpty
	private String numeroTelefonico;
	
	@Column(name="email")
	@NotEmpty
	private String email;

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}