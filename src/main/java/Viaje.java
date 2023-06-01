import java.util.ArrayList;

public class Viaje {
	private String ciudadOrigen;
	private String ciudadDestino;
	private String horaSalida;
	private String horaLlegada;
	private ArrayList<String> pasajeros;
	private Bus bus;

	public Viaje(String ciudadOrigen, String ciudadDestino, String horaSalida, String horaLlegada, ArrayList<String> pasajeros) {
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.pasajeros = pasajeros;
		this.bus = null;
	}

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public String getHoraLlegada(){
		return this.horaLlegada;
	}

	public Bus getBus() {
		return bus;
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
}