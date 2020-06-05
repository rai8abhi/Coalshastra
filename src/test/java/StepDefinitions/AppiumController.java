package StepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumController {

    public static AppiumDriver <MobileElement> driver;

    @Before
    //In this method we are setting Appium Capabilities for the devices on which we are going to run our test cases and also app path.
    public void openApp() {

        try {

            // Set desired capabilities.
            String projectPath = System.getProperty("user.dir");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.UDID, "a87d0588");   //Give Device ID of your test device on test need to be run
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); //Android version for devices
            caps.setCapability(MobileCapabilityType.APP, projectPath +"/src/test/java/resources/apps/app-debug.apk");           // Replace this path with your app location path in system
            // Open the app.
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, caps);

        } catch (Exception e) {
            System.out.println("Cause is :" + e.getCause());
            System.out.println("Massage is :" + e.getMessage());
            e.printStackTrace();
        }
    }

    @After
    public void AfterTest() {
        driver.quit();
    }
}
