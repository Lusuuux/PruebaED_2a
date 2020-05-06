package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Persona p = new Persona("17498506Z", "Mikel", "Ruiz");
	Curso c = new Curso();
	
	@Test
	void testEliminarAlumno() {
		try {
			p.setDni("17498506Z");
			assertEquals("17498506Z", p.getDni());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}