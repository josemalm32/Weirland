
public class Soldado extends Terciario {
String especialidad;
String graduacion;
public Soldado(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo, int anioComienzo,
		byte periodoContratado, int sueldoBase, String especialidad, String graduacion) {
	super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, anioComienzo, periodoContratado, sueldoBase);
	this.especialidad = especialidad;
	this.graduacion = graduacion;
} 


	
}
