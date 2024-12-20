package com.java.test.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenAddressStepDef {

    WebDriver driver;


    @Given("^opens \"([^\"]*)\"$")
    public void initializeCalculator(String addresses) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(addresses);
        driver.manage().window().setSize(new Dimension(1536, 792));
        System.out.println("Opened address");
    }

    @When("^search page$")
    public void searchPage() throws Throwable {
        System.out.println("Searched");
    }

    @Then("^close page$")
    public void closePage() throws Throwable {
        driver.quit();
        System.out.println("Closed");
    }
}
