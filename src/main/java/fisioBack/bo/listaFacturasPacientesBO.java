package fisioBack.bo;

public class listaFacturasPacientesBO {
	
	private Integer idClinica;
	private String nombreRazonSocial;
	private String numero;
	private String fechaDesde;
	private String fechaHasta;
	private String importe;
	public Integer getIdClinica() {
		return idClinica;
	}
	public void setIdClinica(Integer idClinica) {
		this.idClinica = idClinica;
	}
	public String getNombreRazonSocial() {
		return nombreRazonSocial;
	}
	public void setNombreRazonSocial(String nombreRazonSocial) {
		this.nombreRazonSocial = nombreRazonSocial;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public String getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}


	
	

}
