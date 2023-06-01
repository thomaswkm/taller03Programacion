import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Bus> buses = new ArrayList<>();
	private ArrayList<Conductor> conductores = new ArrayList<>();
	private ArrayList<Viaje> viajes = new ArrayList<>();

	public Empresa(String rut, String direccion, ArrayList<String> redesSociales, ArrayList<Bus> buses, ArrayList<Conductor> conductores, ArrayList<Viaje> viajes) {
		this.rut = rut;
		this.direccion = direccion;
		this.redesSociales = redesSociales;
		this.buses = buses;
		this.conductores = conductores;
		this.viajes = viajes;
	}

	public Empresa() {
	}

	public String getRut() {
		return this.rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public ArrayList<String> getRedesSociales() {
		return redesSociales;
	}

	public ArrayList<Bus> getBuses() {
		return buses;
	}

	public ArrayList<Conductor> getConductores() {
		return conductores;
	}

	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	public void agregarConductor(Conductor conductor) {
		if(!buses.contains(conductor)) {
			conductores.add(conductor);
		}
	}

	public void agregarBus(Bus bus) {
		if(!buses.contains(bus)) {
			buses.add(bus);
		}
	}

	public void quitarBus(Bus bus){
		buses.remove(bus);
	}

	public void descontinuarBus(String patente) {
		for (Bus b: buses) {
			if(b.getPatente().equals(patente)){
				quitarBus(b);
			}
		}
	}

	public void agregarViaje(Viaje viaje) {
		viajes.add(viaje);
	}

	public void asociarBus(Viaje viaje, Bus bus){
		viaje.setBus(bus);
	}

	public void agregarPasajero(Viaje v, String pasajero){
		v.getPasajeros().add(pasajero);
	}

	public ArrayList<Viaje> obtenerBusesRangoTiempoYDestino(String horaSalida, String horaDestino, String destino){
		ArrayList<Viaje> viajesCoinciden = compararDestino(this.viajes,destino);
		viajesCoinciden = compararHoraSalida(viajesCoinciden,horaSalida);
		return compararHoraLlegada(viajesCoinciden,horaDestino);
	}
	public ArrayList<Viaje> compararDestino(ArrayList<Viaje> viajes, String destino){
		for (Viaje viaje: viajes) {
			if(viaje.getCiudadDestino().equals(destino)){
				viajes.add(viaje);
			}
		}
		return viajes;
	}

	public ArrayList<Viaje> compararHoraSalida(ArrayList<Viaje> viajes, String horaSalida){
		for (Viaje viaje: viajes) {
			if(Integer.parseInt(viaje.getHoraSalida().split(":")[0])>=Integer.parseInt(horaSalida.split(":")[0])){
				if (Integer.parseInt(viaje.getHoraSalida().split(":")[1])>=Integer.parseInt(horaSalida.split(":")[1])){
					viajes.add(viaje);
				}
			}
		}
		return viajes;
	}

	public ArrayList<Viaje> compararHoraLlegada(ArrayList<Viaje> viajes, String horaLlegada){
		for (Viaje viaje: viajes) {
			if(Integer.parseInt(viaje.getHoraLlegada().split(":")[0])<=Integer.parseInt(horaLlegada.split(":")[0])){
				if (Integer.parseInt(viaje.getHoraLlegada().split(":")[1])<=Integer.parseInt(horaLlegada.split(":")[1])){
					viajes.add(viaje);
				}
			}
		}
		return viajes;
	}
}