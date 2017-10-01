package fisioBack.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USUARIO")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7893146250678730347L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO", nullable=false)
	private Integer id_usuario;

	@NotEmpty
	@Column(name="PRIMER_NOMBRE", nullable=false)
	private String primerNombre;
		
	@Column(name="SEGUNDO_NOMBRE", nullable=false)
	private String segundoNombre;

	@NotEmpty
	@Column(name="PRIMER_APELLIDO", nullable=false)
	private String primerApellido;
	
	@Column(name="SEGUNDO_APELLIDO", nullable=false)
	private String segundoApellido;

	@NotEmpty
	@Column(name="CORREO", nullable=false)
	private String correo;

	@NotEmpty
	@Column(name="FECHA_NACIMIENTO", nullable=false)
	private String fechaNacimiento;

	@Column(name="TELEFONO", nullable=false)
	private String telefono;

	@NotEmpty
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "DIRECCION", 
             joinColumns = { @JoinColumn(name = "id_direccion") }, 
             inverseJoinColumns = { @JoinColumn(name = "direccion") })
	private Direccion direccion = new Direccion();
	
	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ROL", 
             joinColumns = { @JoinColumn(name = "id_rol") }, 
             inverseJoinColumns = { @JoinColumn(name = "rol") })
	private Set<Rol> roles = new HashSet<Rol>();

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}


//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((ssoId == null) ? 0 : ssoId.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof User))
//			return false;
//		User other = (User) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (ssoId == null) {
//			if (other.ssoId != null)
//				return false;
//		} else if (!ssoId.equals(other.ssoId))
//			return false;
//		return true;
//	}

	/*
	 * DO-NOT-INCLUDE passwords in toString function.
	 * It is done here just for convenience purpose.
	 */
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", ssoId=" + ssoId + ", password=" + password
//				+ ", firstName=" + firstName + ", lastName=" + lastName
//				+ ", email=" + email + "]";
//	}
//

	
	
}
