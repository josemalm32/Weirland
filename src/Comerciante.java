
public class Comerciante extends Secundario{
int numeroLicencia;
short tipoProducto;

	public Comerciante(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo,
		int numeroLicencia, int anioComienzoActividad, String nombreExplotacion, boolean licenciaCasamiento,
		int numeroRelacion, int numeroLicencia2, short tipoProducto) {
	super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, numeroLicencia, anioComienzoActividad,
			nombreExplotacion, licenciaCasamiento, numeroRelacion);
	numeroLicencia = numeroLicencia2;
	this.tipoProducto = tipoProducto;
}


}
