package fisioBack.bo;

public class InfoLogin {
	
	private String rol;
	private String clinica;
	private String tipo;
	private String fkClinica;
	private String idRol;
	private String idUsuario;
	private String claveUsuario;

	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getClaveUsuario() {
		return claveUsuario;
	}
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getClinica() {
		return clinica;
	}
	public void setClinica(String clinica) {
		this.clinica = clinica;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFkClinica() {
		return fkClinica;
	}
	public void setFkClinica(String fkClinica) {
		this.fkClinica = fkClinica;
	}


}
