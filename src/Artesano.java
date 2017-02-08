
public class Artesano extends Secundario{

	String direccionTaller;
	String especialidad;
	public Artesano(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo,
			int numeroLicencia, int anioComienzoActividad, String nombreExplotacion, boolean licenciaCasamiento,
			int numeroRelacion, String direccionTaller, String especialidad) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, numeroLicencia, anioComienzoActividad,
				nombreExplotacion, licenciaCasamiento, numeroRelacion);
		this.direccionTaller = direccionTaller;
		this.especialidad = especialidad;
	}
	
	
	
}
