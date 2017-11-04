package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidad_paciente")
public class EspecialidadPaciente implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2317382990770661402L;


	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_esp_pac", nullable=false)
	private Integer idEspPac;


	@Column(name="fk_especialidad", nullable=false)
	private String fkEspecialidad;
		
	@Column(name="fk_paciente", nullable=false)
	private String fkPaciente;

	public Integer getIdEspPac() {
		return idEspPac;
	}

	public void setIdEspPac(Integer idEspPac) {
		this.idEspPac = idEspPac;
	}

	public String getFkEspecialidad() {
		return fkEspecialidad;
	}

	public void setFkEspecialidad(String fkEspecialidad) {
		this.fkEspecialidad = fkEspecialidad;
	}

	public String getFkPaciente() {
		return fkPaciente;
	}

	public void setFkPaciente(String fkPaciente) {
		this.fkPaciente = fkPaciente;
	}

	
}
