import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Applaunch {

    public static AndroidDriver driver;

    @Before
    public void openApp() throws Exception {
        // Set desired capabilities.
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("udid", "a87d0588"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("app", "/Users/grofers/Downloads/app-debug.apk");//res
        // Open the app.
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}
