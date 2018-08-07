package fisioBack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;


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


	@Column(name="nombre", nullable=true)
	private String nombre;
		
	@Column(name="apellido", nullable=false)
	private String apellido;
	
		
	@Column(name="segundo_apellido",nullable=true)
	private String segundoApellido;
	
		
	@Column(name="segundo_nombre",nullable=true)
	private String segundoNombre;

	@Column(name="edad", nullable=false)
	private String edad;
	
	@Column(name="telefono", nullable=false)
	private String telefono;


	@Column(name="correo",nullable=true)
	private String correo;
	

	@Column(name="fecha_nacimiento", nullable=false)
	private String fechaNacimiento;


	@Column(name="fecha_registro",nullable=true)
	private String fechaRegistro;
	

	@Column(name="fecha_actualizacion",nullable=true)
	private String fechaUltActual;

	@Column(name="fk_direccion", nullable=false)
	private String fkDireccion;

	@Column(name="fk_id_clinica", nullable=false)
	private String fkClinica;

	@Column(name="observaciones")
	private String observaciones;
	
	
	
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaUltActual() {
		return fechaUltActual;
	}

	public void setFechaUltActual(String fechaUltActual) {
		this.fechaUltActual = fechaUltActual;
	}

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
