package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testModuloEmpleo extends Principal {
	
	By Empleo = By.linkText("Empleos");
	By SerChoucairLinkL = By.linkText("¿Qué es ser Choucair?");
	By Convocatorias = By.linkText("Convocatorias");
	By PreparseparaAplicar = By.linkText("Prepararse para aplicar");
	
	public testModuloEmpleo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void Navegar() throws InterruptedException {
		click(Empleo);
		Thread.sleep(2000);
	}
	
	public boolean isSerChoucairDisplayed() {
		return isDisplayed(SerChoucairLinkL);
	
	}
	
	public boolean isConvocatoriasDisplayed() {
		return isDisplayed(Convocatorias);
	}
	
	public boolean isPreparseDisplayed() {
		return isDisplayed(PreparseparaAplicar);
	}
	
	

}