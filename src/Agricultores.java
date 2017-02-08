
public class Agricultores extends Primario {

	int parcela;
	byte especie;
	byte epoca;
	int estado;
	public Agricultores(String nombre, int numeroWeird, int diaNacimiento, int ciudadNacimiento, String sexo,
			byte hijos, String estadoCivil, byte formaDePago, int numeroRelacion, int parcela, byte especie, byte epoca,
			int estado) {
		super(nombre, numeroWeird, diaNacimiento, ciudadNacimiento, sexo, hijos, estadoCivil, formaDePago,
				numeroRelacion);
		this.parcela = parcela;
		this.especie = especie;
		this.epoca = epoca;
		this.estado = estado;
	}
	
	
	
}
