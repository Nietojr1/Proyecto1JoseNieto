package base;
import base.Participante;
import javax.swing.JOptionPane;

public class Estudiante extends Participante {
	
	public Estudiante() {
		
		int numAle = ((int)(Math.random()*6 + 1));	
		String nomEst = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
		String apeEst = JOptionPane.showInputDialog("Ingrese el apellido del Estudiante");
		int edaEst = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
		
		int grado=0;
		do {
			grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado al que pertenece [de 1 a 11]"));
		} while (!(grado >0 && grado <= 11));
		
		
		String curso="";
		do {
			curso = JOptionPane.showInputDialog("Ingrese el curso al que pertenece [de A a D]");
		}while (!( curso.equals("a") || curso.equals("A") || curso.equals("b") || curso.equals("B") || curso.equals("c") || curso.equals("C") || curso.equals("d") || curso.equals("D")  ));
			
		String grupo = grado +"°"+ curso; 
		
		super.setNombre(nomEst);
		super.setApellido(apeEst);
		super.setEdad(edaEst);
		super.setGrupo(grupo);
		super.setNumAleatorio(numAle);		
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre.toUpperCase() + ", Apellido:" + apellido.toUpperCase() + ", Edad:" + edad + ", Grupo:" + grupo.toUpperCase() + ", Numero Aleatorio:"+ numAleatorio;
	}	
}



