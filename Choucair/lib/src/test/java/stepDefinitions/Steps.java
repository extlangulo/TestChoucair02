package stepDefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.EmpleosDisponibles;
import PageObjectModel.TagConvocatoria;
import PageObjectModel.testModuloEmpleo;
import PageObjectModel.PostularTrabajo;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	private WebDriver driver;	
	
	@Before
	public void setUp() throws Throwable{		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^Estoy en la pagina de Chocair Peru$")
	public void estoy_en_la_pagina_de_chocair_peru() throws Throwable {	
		testModuloEmpleo elements1 = new testModuloEmpleo(driver);
		
		elements1.visit("https://www.choucairtesting.com/");
		elements1.Navegar();
		assertTrue(elements1.isSerChoucairDisplayed());
		assertTrue(elements1.isConvocatoriasDisplayed());
		assertTrue(elements1.isPreparseDisplayed());
	}
	
	@When("^Yo navego por las secciones de postulacion$")
	public void yo_navego_por_las_secciones_de_postulacion() throws Throwable {
		TagConvocatoria elements2 = new TagConvocatoria(driver);
		EmpleosDisponibles elements3 = new EmpleosDisponibles(driver);
		
		elements2.navegarEnlace();		
		assertEquals("CONVOCATORIAS",elements2.ObtenertextConvocatorias());
		elements3.BuscarEmpleoDisponible();
		System.out.println ("Buscar empleos disponibles");
		assertEquals("Search completed. Found 1 matching record.",elements3.SearchMessageJob());
		System.out.println ("ingreso a assert");
	}
	
	@Then("^Verifico que exista postulaciones disponibles$")
	public void verifico_que_exista_postulaciones_disponibles() throws Throwable {
		PostularTrabajo elements4 = new PostularTrabajo(driver);
		System.out.println ("Existe postulaciones disponibles");
		elements4.VerEmpleo();
		System.out.println ("Ver Empleo");
		
		//Thread.sleep(20000);
		elements4.Postular();
		assertEquals("Your job application has been submitted successfully",elements4.MensajeConfirmacion());
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}