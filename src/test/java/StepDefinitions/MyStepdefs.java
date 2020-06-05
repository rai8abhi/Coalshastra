package StepDefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {
    AppiumController obj = new AppiumController();

    WebDriverWait wait = new WebDriverWait(obj.driver, 30);     // Assign wait time 30 seconds

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));    //Used wait to check login page appear before search of the elements.
            MobileElement el3 = (MobileElement) obj.driver.findElementById("loginll");
            el3.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @When("^user enter the (.+) and (.+)$")
    public void userEnterTheEmailIdAndPassword(String type, String type1) {
        MobileElement el1 = (MobileElement) obj.driver.findElementById("emailtv");
        el1.sendKeys(type);     //send login emailID
        MobileElement el2 = (MobileElement) obj.driver.findElementById("passtv");
        el2.sendKeys(type1);        //Send password
    }

    @And("user click on submit button")
    public void userClickOnSubmitButton() {
        MobileElement el3 = (MobileElement) obj.driver.findElementById("loginll");
        el3.click();
    }

    @Then("user navigate to login page")
    public void userNavigateToLoginPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
        MobileElement el4 = (MobileElement) obj.driver.findElementById("dialogeskip");
        el4.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));     //Wait for home button visible after login.
        Assert.assertEquals("Login Fail as user is unable to login", "Home", obj.driver.findElementById("largeLabel").getText());
    }

    @Then("user should not navigate to login button")
    public void userShouldNotNavigateToLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
        MobileElement el4 = (MobileElement) obj.driver.findElementById("dialogeskip");
        el4.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
        Assert.assertNotEquals("User is able to login without valid entry", "Home", obj.driver.findElementById("largeLabel").getText());       //Verifying in this case home should not appear.
    }
}
