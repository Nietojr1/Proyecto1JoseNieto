package base;
import base.Participante;
import javax.swing.JOptionPane;

public class Docente extends Participante{
	
	public Docente () {
		
		int numAleD = ((int)(Math.random()*6 + 1));	
		String nomDoc = JOptionPane.showInputDialog("Ingrese el nombre del Docente");
		String apeDoc = JOptionPane.showInputDialog("Ingrese el apellido del Docente");
		int edaDoc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Docente"));
		String asiDoc = JOptionPane.showInputDialog("Ingrese La asignatura");
		
		super.setNombre(nomDoc);
		super.setApellido(apeDoc);
		super.setEdad(edaDoc);
		super.setAsignatura(asiDoc);
		super.setNumAleatorio(numAleD);
	}
	@Override
	public String toString() {
		return "Nombre:" + nombre.toUpperCase() + ", Apellido:" + apellido.toUpperCase() + ", Edad:" + edad + ", Asignatura:" + asignatura.toUpperCase() + ", Numero Aleatorio:"+ numAleatorio;
	}	


}
