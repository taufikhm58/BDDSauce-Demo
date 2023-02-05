package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartPage {


    public static WebDriver driver;

    public ChartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = "//span[@class='title']")
    private WebElement displayChartPage;

    public boolean displayChartPage() {
        return displayChartPage.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem4;

    public void clickBasket4() {
        basketItem4.click();
    }



    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement basketItem5;

    public void clickBasket5() {
        basketItem5.click();
    }

}

