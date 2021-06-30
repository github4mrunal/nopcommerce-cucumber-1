package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        new Homepage().selectMenu("Computers");
    }

    @And("^I hover mouse on Computers tab$")
    public void iHoverMouseOnComputersTab() {
        new ComputersPage().clickOnComputersTab();
    }

    @And("^I click on Desktop tab$")
    public void iClickOnDesktopTab() throws InterruptedException {
        Thread.sleep(3000);
        new DesktopPage().clickonDesktop();
    }

    @And("^I select  \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String sortby) {
        new DesktopPage().selectTextFromDropDown(sortby);

    }

         @Then("^I should see products arranged in reverse alphabetical order$")
    public void iShouldSeeProductsArrangedInReverseAlphabeticalOrder() {
        new ComputersPage().verifyproductsSortByGivenOrder();
    }
}
