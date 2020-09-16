package main;

import base.Docente;
import base.Estudiante;
import base.Participante;

public class Main {

	public static void main(String[] args) {
		
	 Participante estudiante = new Estudiante();
	 Participante docente = new Docente();
		 
	 int resEst =  estudiante.getNumAleatorio();	 
	 int resDoc = docente.getNumAleatorio();	 
	  
	 if (resEst>resDoc) {
		 System.out.println("GANO EL ESTUDIANTE, ya que el docente saco: "+ docente.getNumAleatorio());
		 System.out.println(estudiante.toString());
	 }else
		if (resEst<resDoc) {
			 System.out.println("GANO EL DOCENTE, ya que el estudiante saco: "+ estudiante.getNumAleatorio());
			 System.out.println(docente.toString());
		}else			
	 		System.out.println("FUE UN EMPATE. \n (El estudiante saco:"+ estudiante.getNumAleatorio()+ " y el docente: "+docente.getNumAleatorio()+")");
	}

}
