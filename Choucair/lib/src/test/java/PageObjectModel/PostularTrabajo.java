package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostularTrabajo extends Principal {

	By CursoLocator = By.xpath("//h3[contains(text(),'Analista de pruebas móviles')]");
	By applicationbuttonLocator = By.cssSelector("input[value=\"Apply for job\"]");		
	By PostulanteNombreCompleto = By.id("nombre-completo");
	By PostulanteCorreoElectronico = By.id("correo-electronico");
	By PostulanteCelular = By.id("celular-o-telefono-de-contacto");
	By PostulanteEstudios = By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente");
	By PostulanteTiempoExperiencia = By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica");
	By PostulanteAutomatizacion = By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica");
	By PostulanteExpectativaSalarial= By.id("cual-es-tu-aspiracion-salarial");
	By PostulanteDisponibilidad = By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias");
	By PostulanteMensajeAdicionalr = By.id("mensaje-adicional");
	By ElegiCV = By.id("cv");
	By EnviarCV = By.cssSelector("p>input[type=\"submit\"]");
	By MensajeConfirmacion = By.cssSelector("p[class=\"job-manager-message\"]");	
	
	public PostularTrabajo(WebDriver driver) {
		super(driver);
	}	
	public void VerEmpleo() {
		click(CursoLocator);		
	}	
	public void Postular() throws InterruptedException {
		Scroll();
		System.out.println ("Encontro boton");
		click(applicationbuttonLocator);		
		
		Thread.sleep(2000);
		type("Lorenzo Angulo",PostulanteNombreCompleto);
		type("lorenzo@gmail.com",PostulanteCorreoElectronico);
		type("987600913",PostulanteCelular);
		type("Ing. Sistemas",PostulanteEstudios);
		type("3 años",PostulanteTiempoExperiencia);
		type("Test",PostulanteAutomatizacion);
		type("3770",PostulanteExpectativaSalarial);
		type("Si, Disponibilidad Inmediata",PostulanteDisponibilidad);
		type("Brindo mi CV para la evaluación de un puesto de trabajo",MensajeConfirmacion);
		UploadFile("C:\\Users\\lorenzoangulo\\Desktop\\choucairtesting\\CV_Lorenzo",ElegiCV);
		Thread.sleep(3000);
		Scroll1();
		click(EnviarCV);
		Thread.sleep(3000);		
	}
	
	public String MensajeConfirmacion() {
		return getText(MensajeConfirmacion);
	}
	
}
