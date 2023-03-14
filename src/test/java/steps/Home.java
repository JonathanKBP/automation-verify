package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.BaseTest;
import io.cucumber.java.pt.Então;

public class Home {
	private WebDriver driver = BaseTest.getDriver();
	
	@Então("visualizo o titulo {string}")
	public void visualizoOTitulo(String texto) {
		boolean textoEncontrado = false;
		List<WebElement> titulo = driver.findElements(By.tagName("h1"));
		
		for (WebElement element : titulo) {
		    String h1Text = element.getText();
		    if (h1Text.contains(texto)) {
		    	textoEncontrado = true;
		        break;
		    }
		}
		
		Assert.assertTrue(textoEncontrado);
	}
}
