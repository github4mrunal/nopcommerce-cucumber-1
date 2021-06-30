package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new Homepage();
    }

    @When("^I click on any tabs \"([^\"]*)\" from Computers,Apparel,Electronics,Digital downloads,Books,Jewelry or Gift Cards$")
    public void iClickOnAnyTabsFromComputersApparelElectronicsDigitalDownloadsBooksJewelryOrGiftCards(String menu){
    new Homepage().selectMenu(menu);
    }

    @Then("^I should navigate to selected page$")
    public void iShouldNavigateToSelectedPage() {
        Assert.assertEquals( "Computers",new Homepage().verifyTopMenuTabText() );
    }
}
