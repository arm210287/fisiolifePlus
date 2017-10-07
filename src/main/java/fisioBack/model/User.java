package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="DIRECCION", nullable=false)
	private Direccion direccion = new Direccion();

	@NotEmpty
	@Column(name="ROL", nullable=false)
	private Rol rol = new Rol();
	


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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
