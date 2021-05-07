package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionsGenerarCalidadSoftware extends Principal {
	
	By Curso = By.linkText("Diferencia entre calidad de software y pruebas");		

	public OptionsGenerarCalidadSoftware(WebDriver driver) {
		super(driver);
	}
	
	public void IngresarCurso() throws InterruptedException {
		click(Curso);
		Thread.sleep(3000);
	}

	
}
