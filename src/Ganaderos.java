
public class Ganaderos extends Primario {

	byte especie;
	int cabezas;
	byte tiempoAporte;
	public Ganaderos(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo, byte hijos,
			String estadoCivil, byte formaDePago, int numeroRelacion, byte especie, int cabezas, byte tiempoAporte) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, hijos, estadoCivil, formaDePago,
				numeroRelacion);
		this.especie = especie;
		this.cabezas = cabezas;
		this.tiempoAporte = tiempoAporte;
	}
	
	
	
}
