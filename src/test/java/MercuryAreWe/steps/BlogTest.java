package MercuryAreWe.steps;

import MercuryAreWe.pages.BlogPage;
import MercuryAreWe.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BlogTest {
    @When("^I select \"([^\"]*)\" on Navigation Bar$")
    public void iSelectOnNavigationBar(String navigationBar) {
        new HomePage().selectResourcesOnNavigationBar(navigationBar);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String navigationItem)  {
        new HomePage().selectBlogInResources(navigationItem);
    }

    @And("^I verify the Blog page by Title \"([^\"]*)\"$")
    public void iVerifyTheBlogPageByTitle(String expected)  {
        Assert.assertEquals(expected, new BlogPage().verifyBlogPageByTitle());

    }

        @And("^I click on Most Recent and select \"([^\"]*)\"$")
    public void iClickOnMostRecentAndSelect(String archiveList)  {
        new BlogPage().selectMostRecentDropDown(archiveList);
    }
   @And("^I verify the selection by Header Title \"([^\"]*)\"$")
    public void iVerifyTheSelectionByHeaderTitle(String expected)  {
        Assert.assertEquals(expected, new BlogPage().verifyDropDownSelectionResult());
    }

    @Then("^I scroll down the page to select a blog to read$")
    public void iScrollDownThePageToSelectABlogToRead() {
        new BlogPage().slider();
    }

}
