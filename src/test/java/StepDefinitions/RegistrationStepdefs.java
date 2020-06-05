package StepDefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationStepdefs {
    AppiumController obj = new AppiumController();
    WebDriverWait wait = new WebDriverWait((WebDriver) obj.driver, 30);     // Assign wait time 30 seconds

    @Given("Login page shown to user")
    public void userIsLoginPage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));    //Used wait to check login page appear before search of the elements.
            MobileElement el3 = (MobileElement) AppiumController.driver.findElementById("loginll");
            el3.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @And("user click on registration button")
    public void userClickOnRegistrationButton() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signuptvb")));      //Used wait to check if registration page appear before search of the elements.
            MobileElement el1 = (MobileElement) obj.driver.findElementById("signuptvb");
            el1.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @And("user enter his details on registration process")
    public void userEnterHisDetailsOnRegistrationProcess() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameet")));
            MobileElement el2 = (MobileElement) obj.driver.findElementById("nameet");
            el2.sendKeys("abhishek");
            MobileElement el3 = (MobileElement) obj.driver.findElementById("registerLastNameEdt");
            el3.sendKeys("pandey");
            MobileElement el4 = (MobileElement) obj.driver.findElementById("emailet");
            el4.sendKeys("rai8abhishek@gmail.com");
            MobileElement el5 = (MobileElement) obj.driver.findElementById("contactnoet");
            el5.sendKeys("9911894561");
            MobileElement el6 = (MobileElement) obj.driver.findElementById("radio2");
            el6.click();
            MobileElement el7 = (MobileElement) obj.driver.findElementById("passet");
            el7.sendKeys("P@ssword001");
            MobileElement el8 = (MobileElement) obj.driver.findElementById("confirmet");
            el8.sendKeys("P@ssword001");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @When("user click on submit button of registration")
    public void userClickOnSubmitButton() {
        try{
            MobileElement el3 = (MobileElement) obj.driver.findElementById("loginll");
            el3.click();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Then("user should not able to register again")
    public void userShouldNotAbleToRegisterAgain() {
        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmet")));
            Assert.assertEquals("Login Fail", "P@ssword001", obj.driver.findElementById("confirmet").getText());        //Verifying if entered password is same for confirm password.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
