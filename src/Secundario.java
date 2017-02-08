
public class Secundario extends Persona {

	int numeroLicencia;
	int anioComienzoActividad;
	String nombreExplotacion;
	boolean licenciaCasamiento;
	int numeroRelacion;
	
	public Secundario(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo,
			int numeroLicencia, int anioComienzoActividad, String nombreExplotacion, boolean licenciaCasamiento,
			int numeroRelacion) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo);
		this.numeroLicencia = numeroLicencia;
		this.anioComienzoActividad = anioComienzoActividad;
		this.nombreExplotacion = nombreExplotacion;
		this.licenciaCasamiento = licenciaCasamiento;
		this.numeroRelacion = numeroRelacion;
	}
	
	
	
}
