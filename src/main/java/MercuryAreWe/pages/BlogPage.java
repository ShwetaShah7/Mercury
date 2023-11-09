package MercuryAreWe.pages;


import MercuryAreWe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class BlogPage extends Utility {

    private static final Logger log = LogManager.getLogger(BlogPage.class.getName());

    public BlogPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Blog']")
    WebElement verifyBlogPage;

    @CacheLookup
    @FindBy (xpath = "//select[@id='monthSelect']")
    WebElement archive;

    @CacheLookup
    @FindBy (xpath = "//div[@class='page_header-content text_left col-md-12 col-xs-11']/h1")
    WebElement verifyNewsForAugust2023;



//*********************************


        public String verifyBlogPageByTitle() {
        Reporter.log("Verify Blog Page by Title" + verifyBlogPage.toString() + "<br>");
        return getTextFromElement(verifyBlogPage);
    }

    public void selectMostRecentDropDown(String archiveList) {
        selectByVisibleTextFromDropDown(archive,archiveList);
    }

    public String verifyDropDownSelectionResult() {
        Reporter.log("Verify DropDown selection Result by Title" + verifyNewsForAugust2023.toString() + "<br>");
        return getTextFromElement(verifyNewsForAugust2023);
    }

    public void slider() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700)");
    }

}