package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	/**
	 * @author Luzu
	 * @version Definitiva (Espero)
	 */
	private List<Persona> listaAlumnos;

	/**
	 * 
	 * @param dni
	 * @throws Exception
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * 
	 * @param p
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * 
	 * @param dni
	 * @return encontrado
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Aqui hay un ArrayList 
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * 
	 * @return persona
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}

