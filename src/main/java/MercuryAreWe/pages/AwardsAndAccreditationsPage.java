package MercuryAreWe.pages;


import MercuryAreWe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class AwardsAndAccreditationsPage extends Utility {

    private static final Logger log = LogManager.getLogger(AwardsAndAccreditationsPage.class.getName());

    public AwardsAndAccreditationsPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Awards and Accreditations')]")
    WebElement verifyAwardsAndAccreditationsPage;

//*********************************


        public String verifyAwardsAndAccreditationsPageByTitle() {
        Reporter.log("Verify Awards and Accreditations Page by Title" + verifyAwardsAndAccreditationsPage.toString() + "<br>");
        return getTextFromElement(verifyAwardsAndAccreditationsPage);
    }

}