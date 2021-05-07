package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagConvocatoria extends Principal{
	
	By Convocatorias = By.linkText("Convocatorias");
	By textConvocatorias = By.tagName("h2");

	public TagConvocatoria(WebDriver driver) {
		super(driver);
	}
	
	public void navegarEnlace() throws InterruptedException {
		click(Convocatorias);
		Thread.sleep(3000);
	}
	
	public String ObtenertextConvocatorias() {
		List<WebElement> text = findElements(textConvocatorias);
		return getText(text.get(1));
	}
	

}