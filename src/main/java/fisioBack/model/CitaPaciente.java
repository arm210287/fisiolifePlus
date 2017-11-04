package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cita_paciente")
public class CitaPaciente implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8732452238239119612L;


	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_paciente_cita", nullable=false)
	private Integer idCitaPaciente;


	@Column(name="fk_paciente", nullable=false)
	private String fkPaciente;
		
	@Column(name="fk_cita", nullable=false)
	private String fkCita;

	public Integer getIdCitaPaciente() {
		return idCitaPaciente;
	}

	public void setIdCitaPaciente(Integer idCitaPaciente) {
		this.idCitaPaciente = idCitaPaciente;
	}

	public String getFkPaciente() {
		return fkPaciente;
	}

	public void setFkPaciente(String fkPaciente) {
		this.fkPaciente = fkPaciente;
	}

	public String getFkCita() {
		return fkCita;
	}

	public void setFkCita(String fkCita) {
		this.fkCita = fkCita;
	}

		
}
