package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="clinica")
public class Clinica implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -6829158523556010620L;


	@Id 
	@GeneratedValue
	@Column(name="id_clinica", nullable=false)
	private Integer idClinica;


	@Column(name="nombre_clinica", nullable=false)
	private String nombreClinica;
		
	@Column(name="descripcion", nullable=false)
	private String descripcion;


	@Column(name="fk_direccion", nullable=false)
	private String fkDireccion;


	public Integer getIdClinica() {
		return idClinica;
	}


	public void setIdClinica(Integer idClinica) {
		this.idClinica = idClinica;
	}


	public String getNombreClinica() {
		return nombreClinica;
	}


	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFkDireccion() {
		return fkDireccion;
	}


	public void setFkDireccion(String fkDireccion) {
		this.fkDireccion = fkDireccion;
	}

	


		
}
