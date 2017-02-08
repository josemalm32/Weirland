
public class Pescadores extends Primario {
	int caldero;

	public Pescadores(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo, byte hijos,
			String estadoCivil, byte formaDePago, int numeroRelacion, int caldero) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, hijos, estadoCivil, formaDePago,
				numeroRelacion);
		this.caldero = caldero;
	}
	
	
}
