package fisioBack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login")
@SuppressWarnings("serial")
public class Login implements Serializable{

	@Id 
	@GeneratedValue
	@Column(name="id_login",nullable=false)
	private Integer idLogin;	
	
	@Column(name="nombre_usuario",nullable=false)
	private String nombreUsuario;	
	
	@Column(name="clave_usuario",nullable=false)
	private String claveUsuario;
	
	@Column(name="fk_usuario",nullable=false)
	private String fkUsuario;


	public Integer getId_login() {
		return idLogin;
	}

	public void setId_login(Integer id_login) {
		this.idLogin = id_login;
	}

	

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(String fkUsuario) {
		this.fkUsuario = fkUsuario;
	}



	

}
