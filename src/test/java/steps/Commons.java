package steps;

import org.openqa.selenium.WebDriver;

import helpers.BaseTest;
import helpers.Settings;
import io.cucumber.java.pt.Dado;

public class Commons {
	private WebDriver driver = BaseTest.getDriver();
	
	@Dado("que realizo o acesso ao endereço {string}")
	public void queRealizoOAcessoAoEndereço(String endereco) {
		driver.get(Settings.getProperty("url.base") + Settings.getProperty(endereco));
	}
}
