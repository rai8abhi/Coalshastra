import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCalass extends Applaunch {


    @Test
    public void LoginTest1() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("rai8abhishek@gmail.com");
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("P@ssword001");
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
            Assert.assertEquals("Login Fail", "Home", driver.findElementById("largeLabel").getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void LoginTest2() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("rai8abhishek@gmail.com");
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("");
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
            Assert.assertNotEquals("Login Fail", "Home", driver.findElementById("largeLabel").getText());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void LoginTest3() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailtv")));
            MobileElement el1 = (MobileElement) driver.findElementById("emailtv");
            el1.sendKeys("rai8abhishek@gmail");
            MobileElement el2 = (MobileElement) driver.findElementById("passtv");
            el2.sendKeys("P@ssword001");
            MobileElement el3 = (MobileElement) driver.findElementById("loginll");
            el3.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogeskip")));
            MobileElement el4 = (MobileElement) driver.findElementById("dialogeskip");
            el4.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("largeLabel")));
            Assert.assertNotEquals("Login Fail", "Home", driver.findElementById("largeLabel").getText());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void Registration() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signuptvb")));
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
            Assert.assertNotEquals("Login Fail", "Confirm Password *", driver.findElementById("confirmet").getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void AfterTest() {
        driver.quit();
    }
}