import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	private ArrayList<Conductor> conductores = new ArrayList<Conductor>();
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();



	public String getRut() {
		return this.rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public ArrayList<String> getRedesSociales() {
		throw new UnsupportedOperationException();
	}

	public void agregarConductor(Conductor conductor) {
		throw new UnsupportedOperationException();
	}

	public void agregarBus(Bus bus) {
		throw new UnsupportedOperationException();
	}

	public void descontinuarBus(String patente) {
		throw new UnsupportedOperationException();
	}

	public void agregarViaje(Viaje viaje) {
		throw new UnsupportedOperationException();
	}
}