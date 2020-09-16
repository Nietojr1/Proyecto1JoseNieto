package base;

public class Participante {
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int numAleatorio;
	protected String grupo;
	protected String asignatura;
 
 	public Participante() {
 		this.nombre = "Rogelio";
 		this.apellido="Nieto";
 		this.edad = 36;
 		this.numAleatorio = 3;		
 	}
 
 	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Numero Aleatorio: "+ numAleatorio;
	}

	public Participante(String Nombre, String Apellido, int Edad, int NumAle ) {
 		this.nombre = Nombre;
 		this.apellido= Apellido;
 		this.edad = Edad;
 		this.numAleatorio= NumAle;	
 	}
 	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumAleatorio() {
		return numAleatorio;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
