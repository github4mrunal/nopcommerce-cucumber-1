package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends Utility {


    private static final Logger log = LogManager.getLogger(Homepage.class.getName());


    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computers;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparel;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownloads;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement books;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewlery;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftCards;

    @FindBy(xpath = "//h1[(text()='Electronics')or(text()='Computers')or(text()='Books')or(text()='Digital downloads')or(text()='Apparel')or(text()='Gift Cards')or(text()='Jewelry')]")
    WebElement verifyTab;

    public void selectMenu(String menu) {

        if (menu.equalsIgnoreCase("Computers")) {
            clickOnElement(computers);
            log.info("Clicking on Computers Tab" +computers.toString());
        } else if (menu.equalsIgnoreCase("Electronics")) {
            clickOnElement(electronics);
            log.info("Clicking on Electronics Tab" + electronics.toString());
        } else if (menu.equalsIgnoreCase("Apparel")) {
            clickOnElement(apparel);
            log.info("Clicking on Apparel Tab" + electronics.toString());
        } else if (menu.equalsIgnoreCase("Digital downloads")) {
            clickOnElement(digitalDownloads);
            log.info("Clicking on Digital Downloads Tab" + digitalDownloads.toString());
        } else if (menu.equalsIgnoreCase("Books")) {
            clickOnElement(books);
            log.info("Clicking on Books Tab" + books.toString());
        } else if (menu.equalsIgnoreCase("Jewelry")) {
            clickOnElement(jewlery);
            log.info("Clicking on Jewelry Tab" + jewlery.toString());
        } else if (menu.equalsIgnoreCase("Gift Cards")) {
            clickOnElement(giftCards);
            log.info("Clicking on Gift Cards Tab" + giftCards.toString());
        }

            }
    public String verifyTopMenuTabText(){

        log.info( "verifying top menu tab text"   +verifyTab);
        return getTextFromElement( verifyTab );
    }
}






