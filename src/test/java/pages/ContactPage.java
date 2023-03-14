package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.BaseTest;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	private WebDriver driver;
	private WebDriverWait espera = BaseTest.getEspera();
	
    @FindBy(id = "input_comp-kwz6tqej")
    private WebElement nomeField;

    @FindBy(id = "input_comp-kwz6tqf7")
    private WebElement emailField;
    
    @FindBy(id = "input_comp-kwz6tqfe")
    private WebElement telefoneField;
    
    @FindBy(id = "textarea_comp-kwz6tqfr")
    private WebElement desafioField;
    
    @FindBy(id = "comp-kwz6tqgp")
    private WebElement aceitoCheckbox;
    
    @FindBy(id = "comp-kwz6tqhd")
    private WebElement enviarButton;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setNomeField(String username) {
    	espera.until(ExpectedConditions.visibilityOf(nomeField));
    	nomeField.sendKeys(username);
    }

    public void setEmailField(String password) {
    	espera.until(ExpectedConditions.visibilityOf(emailField));
    	emailField.sendKeys(password);
    }

    public void setTelefoneField(String telefone) {
    	espera.until(ExpectedConditions.visibilityOf(telefoneField));
    	telefoneField.sendKeys(telefone);
    }
    
    public void setDesafioField(String desafio) {
    	espera.until(ExpectedConditions.visibilityOf(desafioField));
    	desafioField.sendKeys(desafio);
    }
    
    public void clickEnviarButton() {
    	espera.until(ExpectedConditions.visibilityOf(enviarButton));
    	enviarButton.click();
    }
    
    public void clickAceitoCheckbox() {
    	espera.until(ExpectedConditions.visibilityOf(aceitoCheckbox));
    	aceitoCheckbox.click();
    }
}

