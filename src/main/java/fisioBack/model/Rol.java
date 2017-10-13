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
@Table(name="rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3927064805131397607L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rol",nullable=false)
	private Integer idRol;	

	@Column(name="nombre",nullable=false)
	private String nombre;	

	@Column(name="tipo",nullable=false)
	private String tipo;
	

	@Column(name="descripcion",nullable=false)
	private String descripcion;
	

	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
