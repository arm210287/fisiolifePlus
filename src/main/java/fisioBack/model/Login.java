package fisioBack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="LOGIN")
public class Login implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 7621136182822162955L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_LOGIN",nullable=false)
	private Integer id_login;	
	
	@NotEmpty
	@Column(name="NOMBRE_USUARIO",nullable=false)
	private String nombreUsuario;	
	
	@NotEmpty
	@Column(name="CLAVE_USUARIO",nullable=false)
	private String claveUsuario;
	
	@NotEmpty
	@OneToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "USUARIO", 
             joinColumns = { @JoinColumn(name = "id_usuario") }, 
             inverseJoinColumns = { @JoinColumn(name = "fk_usuario") })
	private User user = new User();

	public Integer getId_login() {
		return id_login;
	}

	public void setId_login(Integer id_login) {
		this.id_login = id_login;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
