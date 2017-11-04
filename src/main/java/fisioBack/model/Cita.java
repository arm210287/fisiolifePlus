package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cita")
public class Cita implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 9076042982119410533L;


	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita", nullable=false)
	private Integer idCita;


	@Column(name="numero", nullable=false)
	private String numero;
		
	@Column(name="fecha", nullable=false)
	private String fecha;


	@Column(name="fecha_fin", nullable=false)
	private String fechaFin;

	@Column(name="descripcion", nullable=false)
	private String descripcion;

	@Column(name="fk_id_clinica", nullable=false)
	private String fkClinica;

	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFkClinica() {
		return fkClinica;
	}

	public void setFkClinica(String fkClinica) {
		this.fkClinica = fkClinica;
	}


		
}
