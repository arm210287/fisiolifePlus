package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="factura_paciente")
public class FacturaPaciente implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7168748073103289938L;


	@Id 
	@GeneratedValue
	@Column(name="id_fact_pact", nullable=false)
	private Integer idFactura;


	@Column(name="fk_paciente", nullable=false)
	private String fkPaciente;

	@Column(name="fk_factura", nullable=false)
	private String fkFactura;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public String getFkPaciente() {
		return fkPaciente;
	}

	public void setFkPaciente(String fkPaciente) {
		this.fkPaciente = fkPaciente;
	}

	public String getFkFactura() {
		return fkFactura;
	}

	public void setFkFactura(String fkFactura) {
		this.fkFactura = fkFactura;
	}


		
}
