package com.testinium.mobile;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import help.Help;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.MalformedURLException;
import java.net.URL;

public class HookImplementation extends Help {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public WebDriverWait wait;

    @BeforeScenario
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.1");
        caps.setCapability("appPackage",  "com.turkishairlines.mobile");
        caps.setCapability("appActivity","com.turkishairlines.mobile.ui.main.MainActivity");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.FULL_RESET, false);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        caps.setCapability("unicodeKeyboard", true);
        caps.setCapability("resetKeyboard", true);

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterScenario
    public void afterScenario() {
        if(driver != null)
            driver.quit();
    }

}
