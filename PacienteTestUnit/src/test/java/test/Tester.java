package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import Model.Paciente;

public class Tester {
	private Paciente paciente;

	@Before
	public void preparacion() {
		paciente = new Paciente();
	}
	
	@Test
	public void testBienEscrito3() {
	 try {
	 assertEquals(null, paciente.inverso(null));
	 fail("deberia haber lanzado una excepcion");
	 } catch (Exception e) {
	 // funciona correctamente
	 }
	}
}
