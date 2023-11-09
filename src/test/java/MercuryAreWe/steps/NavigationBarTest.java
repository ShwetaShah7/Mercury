package MercuryAreWe.steps;

import MercuryAreWe.pages.AwardsAndAccreditationsPage;
import MercuryAreWe.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NavigationBarTest {

    @Given("^: I am on Home Page$")
    public void iAmOnHomePage() {
    }
    @When("^I select Navigation Bar \"([^\"]*)\"$")
    public void iSelectNavigationBar(String navigationBar)  {
        new HomePage().selectNewsOnNavigationBar(navigationBar);
    }
    @And("^I click on Item \"([^\"]*)\"$")
    public void iClickOnItem(String navigationItem)  {
        new HomePage().selectAwardsAndAccreditationsInNews(navigationItem);
    }

    @Then("^I verify the Awards page by Title \"([^\"]*)\"$")
    public void iVerifyTheAwardsPageByTitle(String expected) {
        Assert.assertEquals(expected, new AwardsAndAccreditationsPage().verifyAwardsAndAccreditationsPageByTitle());
    }


}
