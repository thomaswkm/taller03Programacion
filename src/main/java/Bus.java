public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Conductor conductor;

	public Bus(String patente, String marca, String modelo) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.conductor = null;
	}

	public Bus() {

	}

	public String getPatente() {
		return this.patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void asociarConductor(Conductor conductor) {
		this.conductor = conductor;
	}

}