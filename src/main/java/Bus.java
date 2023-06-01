public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Conductor conductor;

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
		throw new UnsupportedOperationException();
	}

}