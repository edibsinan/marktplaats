package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MarktplaatsPages {
    public MarktplaatsPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(name = "query")
public WebElement searchbox;

@FindBy(xpath = "gdpr-consent-banner-accept-button")
    public WebElement accepterenButton;







    }

