import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestClass extends Applaunch {


    @Test     //This test case check for valid login test, when user enter correct user id and password.
    public void LoginTest1() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);     // Assign wait time 30 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));    //Used wait to check login page appear before search of the elements.
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("rai8abhishek@gmail.com");     //send login emailID
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("P@ssword001");        //Send password
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));     //Wait for home button visible after login.
            Assert.assertEquals("Login Fail as user is unable to login", "Home", driver.findElementById("largeLabel").getText());      //Verified the login case
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test         // Here we are verifying if we are able to login without password
    public void LoginTest2() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);     // Assign wait time 30 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));        //Used wait to check login page appear before search of the elements.
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("rai8abhishek@gmail.com");     //send login emailID
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("");           //didn't send the value for password
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
            Assert.assertNotEquals("User is able to login without password", "Home", driver.findElementById("largeLabel").getText());       //Verifying in this case home should not appear.
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test           //Here we are verifying if we are able to login without emailID
    public void LoginTest3() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);     // Assign wait time 30 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));        //Used wait to check login page appear before search of the elements.
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("");       //login emailID field left blank.
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("P@ssword001");        //Send password
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
            Assert.assertNotEquals("User is able to login without user ID", "Home", driver.findElementById("largeLabel").getText());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test     //Here we are verifying if already register user try to re-register him self, he should not.
    public void Registration() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);     // Assign wait time 60 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signuptvb")));      //Used wait to check if registration page appear before search of the elements.
            MobileElement el1 = (MobileElement) driver.findElementById("signuptvb");
            el1.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameet")));
            MobileElement el2 = (MobileElement) driver.findElementById("nameet");
            el2.sendKeys("abhishek");
            MobileElement el3 = (MobileElement) driver.findElementById("registerLastNameEdt");
            el3.sendKeys("pandey");
            MobileElement el4 = (MobileElement) driver.findElementById("emailet");
            el4.sendKeys("rai8abhishek@gmail.com");
            MobileElement el5 = (MobileElement) driver.findElementById("contactnoet");
            el5.sendKeys("9911894561");
            MobileElement el6 = (MobileElement) driver.findElementById("radio2");
            el6.click();
            MobileElement el7 = (MobileElement) driver.findElementById("passet");
            el7.sendKeys("P@ssword001");
            MobileElement el8 = (MobileElement) driver.findElementById("confirmet");
            el8.sendKeys("P@ssword001");
            MobileElement el9 = (MobileElement) driver.findElementById("signupll");
            el9.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmet")));
            Assert.assertEquals("Login Fail", "P@ssword001", driver.findElementById("confirmet").getText());        //Verifying if entered password is same for confirm password.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void AfterTest() {
        driver.quit();
    }
}