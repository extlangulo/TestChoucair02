package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testOptionsGenerCalidadSoftware {

	private WebDriver driver;
	testModuloEmpleo testModuloEmpleo;
	TagPrepararseparaAplicar navegarPreparse;
	OptionsGenerarCalidadSoftware navegarCurso;
	
	@Before
	public void setUp() throws Exception {
		testModuloEmpleo = new testModuloEmpleo(driver);
		driver = testModuloEmpleo.chromeDriverConnection();
		navegarPreparse = new TagPrepararseparaAplicar(driver);
		navegarCurso = new OptionsGenerarCalidadSoftware(driver);
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
		navegarPreparse.navegarEnlace();
		assertEquals("PREPARARSE PARA APLICAR",navegarPreparse.ObtenerTextPreparse());
		navegarCurso.IngresarCurso();
		
	}

}
