package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.BaseTest;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait espera = BaseTest.getEspera();
	
    @FindBy(id = "comp-kevyodnk5")
    private WebElement contatoButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void clickContatoButton() {
    	espera.until(ExpectedConditions.visibilityOf(contatoButton));
    	contatoButton.click();
    } 
}
