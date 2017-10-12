//package fisioBack.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//@Entity
//@Table(name="ROL")
//public class Rol implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -3927064805131397607L;
//
//	@Id 
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID_ROL",nullable=false)
//	private Integer id_rol;	
//	
//	@NotEmpty
//	@Column(name="NOMBRE",nullable=false)
//	private String nombre;	
//	
//	@NotEmpty
//	@Column(name="TIPO",nullable=false)
//	private String tipo;
//	
//	@NotEmpty
//	@Column(name="DIRECCION",nullable=false)
//	private String direccion;
//	
//	public Integer getId_rol() {
//		return id_rol;
//	}
//	public void setId_rol(Integer id_rol) {
//		this.id_rol = id_rol;
//	}
//	public String getNombre() {
//		return nombre;
//	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	public String getTipo() {
//		return tipo;
//	}
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//	public String getDireccion() {
//		return direccion;
//	}
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//
//}
