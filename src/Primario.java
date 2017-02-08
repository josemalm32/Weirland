
public class Primario extends Persona{

	byte hijos;
	String estadoCivil;
	byte formaDePago;
	int numeroRelacion;
	
	public Primario(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo, byte hijos,
			String estadoCivil, byte formaDePago, int numeroRelacion) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo);
		this.hijos = hijos;
		this.estadoCivil = estadoCivil;
		this.formaDePago = formaDePago;
		this.numeroRelacion = numeroRelacion;
	}
	
	
	
}
