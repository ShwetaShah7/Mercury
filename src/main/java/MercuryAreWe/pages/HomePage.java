package MercuryAreWe.pages;


import MercuryAreWe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'News')]")
    WebElement news;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Awards and Accreditations']")
    WebElement awardsAndAccreditations;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Resources')]")
    WebElement resources;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Blog']")
    WebElement blog;


//*********************************


    public void selectNewsOnNavigationBar(String navigationBar) {
        Reporter.log("Mousehover on News on Navigation Bar" + news.toString() + "<br>");
        mouseHoverToElement(news);
    }

    public void selectAwardsAndAccreditationsInNews(String navigationItem) {
        Reporter.log("Select Awards and Accreditations in News" + awardsAndAccreditations.toString() + "<br>");
        mouseHoverToElementAndClick(awardsAndAccreditations);
    }

    public void selectResourcesOnNavigationBar(String navigationBar) {
        Reporter.log("Mousehover on Resources on Navigation Bar" + resources.toString() + "<br>");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mouseHoverToElement(resources);
    }

    public void selectBlogInResources(String navigationItem) {
        Reporter.log("Select Blog in Resources" + blog.toString() + "<br>");
        mouseHoverToElementAndClick(blog);
    }


}