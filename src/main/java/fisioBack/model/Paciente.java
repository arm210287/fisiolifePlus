package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="paciente")
public class Paciente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2908357981131397839L;


	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_paciente", nullable=false)
	private Integer idPaciente;


	@Column(name="nombre", nullable=false)
	private String nombre;
		
	@Column(name="apellido", nullable=false)
	private String apellido;


	@Column(name="edad", nullable=false)
	private String edad;
	
	@Column(name="telefono", nullable=false)
	private String telefono;


	@Column(name="correo", nullable=false)
	private String correo;


	@Column(name="fk_direccion", nullable=false)
	private String fkDireccion;

	@Column(name="fk_id_clinica", nullable=false)
	private String fkClinica;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFkDireccion() {
		return fkDireccion;
	}

	public void setFkDireccion(String fkDireccion) {
		this.fkDireccion = fkDireccion;
	}

	public String getFkClinica() {
		return fkClinica;
	}

	public void setFkClinica(String fkClinica) {
		this.fkClinica = fkClinica;
	}

	
}
