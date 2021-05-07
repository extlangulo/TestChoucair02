package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagSerChoucair extends Principal {

	By SerChoucair = By.linkText("¿Qué es ser Choucair?");
	By textShoucair = By.tagName("h2");
	
	public TagSerChoucair(WebDriver driver) {
		super(driver);
	}
	
	public void navegarEnlace() throws InterruptedException {
		click(SerChoucair);
		Thread.sleep(2000);
	}
	
	public String ObtenertextShoucair() {
		List<WebElement> text = findElements(textShoucair);
		return getText(text.get(0));
	}

}
