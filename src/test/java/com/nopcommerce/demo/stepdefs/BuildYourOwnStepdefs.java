package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuildYourOwnStepdefs {
    @And("^I click  on 'computers' tab$")
    public void iClickOnComputersTab() {
        new ComputersPage().clickOnComputersTab();
        
    }

    @And("^I click on 'desktop'$")
    public void iClickOnDesktop() {
        new ComputersPage().clickOnDesktopOption();

    }

//    @And("^I select \"([^\"]*)\" from dropdown list$")
//    public void iSelectFromDropdownList(String sortby)  {
//        new DesktopPage().selectTextFromDropDown(sortby);
//    }

    @And("^I click on 'add to cart' button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(3000);
        new DesktopPage().clickOnAddToCart();
    }

    @When("^I see 'build your own' page$")
    public void iSeeBuildYourOwnPage() {
        Assert.assertEquals( "Build your own computer",new BuildYourOwnComputer().getBuildYourOwnText() );
    }

    @And("^I select \"([^\"]*)\" from  processor dropdown$")
    public void iSelectFromProcessorDropdown(String processor)  {
        new BuildYourOwnComputer().selectProcessorFromDropDownOne(processor);

    }

    @And("^I select \"([^\"]*)\" from ram drop down list$")
    public void iSelectFromRamDropDownList(String ram)  {
        new BuildYourOwnComputer().selectRamFromDropDownTwo(ram);

    }

    @And("^I select '(\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]' radio button$")
    public void iSelectGB$RadioButton(int arg0, int arg1, int arg2) {
        new BuildYourOwnComputer().clickOnHDDRadioButton();
    }

    @And("^I select 'Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\]' radio button$")
    public void iSelectVistaPremium$RadioButton(int arg0, int arg1) {
        new BuildYourOwnComputer().clickOSOnRadioButton();
    }

    @And("^I select two check boxes 'Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\]' and 'Total Commander\\[\\+\\$(\\d+)\\.(\\d+)\\]'\\.$")
    public void iSelectTwoCheckBoxesMicrosoftOffice$AndTotalCommander$(int arg0, int arg1, int arg2, int arg3) {
        new BuildYourOwnComputer().clickOnSoftwareCheckBox();
    }

    @And("^I verify Price '\\$(\\d+),(\\d+)\\.(\\d+)'$")
    public void iVerifyPrice$(int arg0, int arg1, int arg2) {
        Assert.assertEquals( "$1,475.00" ,new BuildYourOwnComputer().getTotalAmt());
    }

    @And("^I click on 'ADD TO CART' button$")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputer().clickOnAddToCart();
    }

    @Then("^I should see Message on top green bar like 'The product has been added to your shopping cart'$")
    public void iShouldSeeMessageOnTopGreenBarLikeTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals( "The product has been added to your shopping cart" ,new BuildYourOwnComputer().getTopBarMessage());
    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String sortby)  {
        new DesktopPage().selectTextFromDropDown(sortby);

    }
}

