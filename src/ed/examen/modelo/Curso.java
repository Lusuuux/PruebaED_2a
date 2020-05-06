package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/*
	 * @author Mikel Ruiz Luzuriaga
	 * 
	 * @version Defintiva(Supongo)
	 */
	public void eliminarAlumno(String dni) throws Exception {
		/**
		 * @param String dni
		 * @throws Exception
		 */
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/*
	 * Documentar y crear test unitario
	 */
	public void aniadirAlumno(Persona p) {
		/**
		 * @param Persona p
		 */
		listaAlumnos.add(p);
	}

	/*
	 * Documentar y crear test unitario
	 */
	public Boolean estaRegistrado(String dni) {
		/**
		 * @param String dni
		 * @Param int i
		 * @Boolean encontrado
		 * @return encontrado
		 */
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/*
	 * Documentar y crear test unitario
	 */
	public Curso() {
		/**
		 * @param Aqui hay un ArrayList
		 */
		listaAlumnos = new ArrayList<Persona>();
	}

	/*
	 * Documentar y crear test unitario
	 */
	public Integer numeroAlumnos() {
		/**
		 * @return listaAlumnos.size()
		 */
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		/**
		 * @return persona
		 */
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
