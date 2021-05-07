package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testTagSerChoucair {
	
	private WebDriver driver;
	testModuloEmpleo testModuloEmpleo;
	TagSerChoucair tagSerChoucair;

	@Before
	public void setUp() throws Exception {
		testModuloEmpleo = new testModuloEmpleo(driver);
		driver = testModuloEmpleo.chromeDriverConnection();
		tagSerChoucair = new TagSerChoucair(driver);
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
		tagSerChoucair.navegarEnlace();
		assertEquals("SER CHOUCAIR",tagSerChoucair.ObtenertextShoucair());
		
	}

}