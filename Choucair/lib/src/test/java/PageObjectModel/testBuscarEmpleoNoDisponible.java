package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testBuscarEmpleoNoDisponible {

	private WebDriver driver;
	testModuloEmpleo testModuloEmpleo;
	TagConvocatoria tagConvocatoria;
	EmpleosDisponibles buscarEmpleosNoDisponible;
	
	
	@Before
	public void setUp() throws Exception {
		testModuloEmpleo = new testModuloEmpleo(driver);
		driver = testModuloEmpleo.chromeDriverConnection();
		tagConvocatoria = new TagConvocatoria(driver);
		buscarEmpleosNoDisponible = new EmpleosDisponibles(driver);
	    testModuloEmpleo.visit("https://www.choucairtesting.com/");
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		testModuloEmpleo.Navegar();
		assertTrue(testModuloEmpleo.isSerChoucairDisplayed());
		assertTrue(testModuloEmpleo.isConvocatoriasDisplayed());
		assertTrue(testModuloEmpleo.isPreparseDisplayed());
		tagConvocatoria.navegarEnlace();
		assertEquals("CONVOCATORIAS",tagConvocatoria.ObtenertextConvocatorias());
		buscarEmpleosNoDisponible.BuscarEmpleoNoDisponible();
		assertEquals("There are no listings matching your search.",buscarEmpleosNoDisponible.NoJobsMessage());
	}

}
