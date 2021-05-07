package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagPrepararseparaAplicar extends Principal{
	
	By PreparseparaAplicar = By.linkText("Prepararse para aplicar");
	By TextPreparseparaAplicar = By.tagName("h2");

	public TagPrepararseparaAplicar(WebDriver driver) {
		super(driver);
	}

	public void navegarEnlace() throws InterruptedException {
		click(PreparseparaAplicar);
		Thread.sleep(2000);
	}
	
	public String ObtenerTextPreparse() {
		List<WebElement> text = findElements(TextPreparseparaAplicar);
		return getText(text.get(3));
	}

}