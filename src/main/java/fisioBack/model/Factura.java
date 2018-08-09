package fisioBack.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="factura")
public class Factura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1545100111815975809L;


	@Id 
	@GeneratedValue
	@Column(name="id_factura", nullable=false)
	private Integer idFactura;


	@Column(name="numero", nullable=false)
	private String numero;

	@Column(name="importe", nullable=false)
	private String importe;

	@Column(name="iva", nullable=false)
	private String iva;
		
	@Column(name="fecha", nullable=false)
	private String fechaFactura;


	@Column(name="fk_clinica", nullable=false)
	private String fkClinica;


	public Integer getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getImporte() {
		return importe;
	}


	public void setImporte(String importe) {
		this.importe = importe;
	}


	public String getIva() {
		return iva;
	}


	public void setIva(String iva) {
		this.iva = iva;
	}


	public String getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public String getFkClinica() {
		return fkClinica;
	}


	public void setFkClinica(String fkClinica) {
		this.fkClinica = fkClinica;
	}





		
}
