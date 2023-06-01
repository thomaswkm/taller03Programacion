public class Viaje {
	private String ciudadOrigen;
	private String ciudadDestino;
	private String horaSalida;
	private String tipoLIcencia;
	private ArrayList<String> pasajeros;
	private Bus bus;

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public String getTipoLIcencia() {
		return this.tipoLIcencia;
	}

	public ArrayList<String> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void asociarBus(Bus bus) {
		throw new UnsupportedOperationException();
	}
}