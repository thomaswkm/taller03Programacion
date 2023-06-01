public class Conductor {
	private String nombre;
	private String apellido;
	private String numeroContacto;
	private String tipoLicencia;

	public Conductor(String nombre, String apellido, String numeroContacto, String tipoLicencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroContacto = numeroContacto;
		this.tipoLicencia = tipoLicencia;
	}

	public Conductor() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public String getTipoLicencia() {
		return this.tipoLicencia;
	}
}