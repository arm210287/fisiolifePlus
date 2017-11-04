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
@Table(name="usuario")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7893146250678730347L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", nullable=false)
	private Integer idUsuario;


	@Column(name="primer_nombre", nullable=false)
	private String primerNombre;
		
	@Column(name="segundo_nombre", nullable=false)
	private String segundoNombre;


	@Column(name="primer_apellido", nullable=false)
	private String primerApellido;
	
	@Column(name="segundo_apellido", nullable=false)
	private String segundoApellido;


	@Column(name="correo", nullable=false)
	private String correo;


	@Column(name="fecha_nacimiento", nullable=false)
	private String fechaNacimiento;

	@Column(name="TELEFONO", nullable=false)
	private String telefono;

	@Column(name="direccion", nullable=false)
	private Direccion direccion = new Direccion();

	@Column(name="ROL", nullable=false)
	private Rol rol = new Rol();
	
	@Column(name="fk_id_clinica", nullable=false)
	private String fkClinica ;


	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getFkClinica() {
		return fkClinica;
	}

	public void setFkClinica(String fkClinica) {
		this.fkClinica = fkClinica;
	}
	
}
