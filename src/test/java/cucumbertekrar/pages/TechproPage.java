package cucumbertekrar.pages;

import cucumbertekrar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TechproPage {
    public TechproPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='eicon-close']")
    public WebElement reklam;

    @FindBy(css = "input[type='search']")
    public WebElement searchBox;
}
