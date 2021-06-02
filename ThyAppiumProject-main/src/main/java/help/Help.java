package help;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import java.util.List;
import java.util.Random;

public class Help {
    public static AppiumDriver<MobileElement> driver;
    public void sendKeys(By byElement, String text) {
        driver.findElement(byElement).sendKeys(text);
    }
    public void click(By byElement){
        driver.findElement(byElement).click();
    }
    public List<MobileElement> elementList(By byElement){
        return driver.findElements(byElement);
    }
    public MobileElement getElement(By byElement){
        return driver.findElement(byElement);
    }

    public int randomElement(By element){
        List<MobileElement> elements = driver.findElements(element);
        Random random = new Random();
        int i = random.nextInt(elements.size());
        return i;
    }
}
