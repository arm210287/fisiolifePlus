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
@Table(name="DIRECCION")
public class Direccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2639229850246841347L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_DIRECCION",nullable=false)
	private Integer id_direccion;	

//	@Column(name="TYPE",nullable=false)
//	private String type = UserProfileType.USER.getUserProfileType();
	@NotEmpty
	@Column(name="CALLE",nullable=false)
	private String calle;	
	
	@NotEmpty
	@Column(name="NUMERO",nullable=false)
	private Integer numero;
	
	@NotEmpty
	@Column(name="PISO",nullable=false)
	private Integer piso;
	
	@NotEmpty
	@Column(name="PUERTA",nullable=false)
	private String puerta;
	
	@NotEmpty
	@Column(name="CODIGO_POSTAL",nullable=false)
	private String codigoPostal;
	
	
	public Integer getId_direccion() {
		return id_direccion;
	}
	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}
