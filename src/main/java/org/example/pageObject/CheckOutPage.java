package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

    public static WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = "//span[@class='title']")
    private WebElement displayCheckOutPage;

    public boolean displayCheckOutPage() {
        return displayCheckOutPage.isDisplayed();
    }



    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    public void setFirstName(String firstName1){
        firstName.sendKeys(firstName1);
    }



    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    public void setLastName(String lastName1){
        lastName.sendKeys(lastName1);
    }


    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    public void setPostalCode(String postalCode1){
        postalCode.sendKeys(postalCode1);
    }



    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    public void clickContinue(){
        btnContinue.click();
    }


    public boolean getTotalAndTax() {
        String a = driver.findElement(By.xpath("//span[@class='title']")).getText();
        return true;
    }

    public boolean getItemTax() {
        String b = driver.findElement(By.xpath("//span[@class='title']")).getText();
        return true;
    }

    public boolean getItemTotal() {
        String c = driver.findElement(By.xpath("//span[@class='title']")).getText();
        return true;
    }


    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    public void clickFinish(){
        btnFinish.click();
    }


    public boolean checkOutComplete() {
        String a = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        return true;
    }

}




