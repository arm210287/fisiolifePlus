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
@Table(name="direccion")
public class Direccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2639229850246841347L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_direccion",nullable=false)
	private Integer idDireccion;	

//	@Column(name="TYPE",nullable=false)
//	private String type = UserProfileType.USER.getUserProfileType();
	@NotEmpty
	@Column(name="calle",nullable=false)
	private String calle;	
	
	@NotEmpty
	@Column(name="numero",nullable=false)
	private Integer numero;
	
	@NotEmpty
	@Column(name="PISO",nullable=false)
	private Integer piso;
	
	@NotEmpty
	@Column(name="puerta",nullable=false)
	private String puerta;
	
	@NotEmpty
	@Column(name="codigoPostal",nullable=false)
	private String codigoPostal;
	
	

	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
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
