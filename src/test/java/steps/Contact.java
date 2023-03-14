package steps;

import org.openqa.selenium.WebDriver;

import helpers.BaseTest;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ContactPage;

public class Contact {
	private WebDriver driver = BaseTest.getDriver();
	private ContactPage contactPage  = new ContactPage(driver);
	private HomePage homePage = new HomePage(driver);
	
	private entities.Contact contact = new entities.Contact ("Jonathan", "jonathan.kevinbp@hotmail.com", "11996712385", "Passar no teste para ser QA na verity");
	
	@Quando("clico no menu contato")
	public void clicoNoMenu() {
		homePage.clickContatoButton();
	}
	@Quando("preencho o formulario")
	public void preenchoOFormulario() {
		contactPage.setNomeField(contact.getNome());
		contactPage.setEmailField(contact.getEmail());
		contactPage.setTelefoneField(contact.getTelefone());
		contactPage.setDesafioField(contact.getDesafio());
		contactPage.clickAceitoCheckbox();
	}
	@Então("clico em enviar")
	public void clicoEmEnviar() {
	    contactPage.clickEnviarButton();
	}
}
