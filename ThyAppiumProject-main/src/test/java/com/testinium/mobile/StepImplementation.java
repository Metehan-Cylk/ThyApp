package com.testinium.mobile;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.junit.Assert;
import static elementList.MapsOfElements.*;
import static elementList.FlightSelectElements.*;

public class StepImplementation extends HookImplementation {

    @Step("<element> butonuna bas")
    public void clickElement(String element){
        click(elementsMap().get(element));
    }

    @Step("<element> yerine <key> degerini yolla")
    public void sendKeyElement(String element, String key){
        sendKeys(elementsMap().get(element), key);
    }

    @Step("<element>'i var mı kontrol et")
    public void isDisplayedElement(String element){
        Assert.assertTrue(getElement(elementsMap().get(element)).isDisplayed());
    }

    @Step("<key> sonuçların arasından rastgele seçim yap")
    public void randomSelect(String key){
        int rand = randomElement(elementsMap().get(key));
        elementList(elementsMap().get(key)).get(rand).click();
    }

    @Step("<element> sonuçlarından <index> değerini seç")
    public void indexSelect(String element, String index){
        int i = Integer.parseInt(index);
        elementList(elementsMap().get(element)).get(i).click();
    }

    @Step({"<gun> gün sonrasını seç"})
    public void selectDate(String gun){
        int day = Integer.parseInt(gun);
        List<MobileElement> dates = elementList(dateSelect);
        int x = 0;
        for (MobileElement element: dates) {
            if (element.isSelected()){
                x = dates.indexOf(element) + day;
            }
        }
        elementList(dateSelect).get(x).click();
    }
    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }


}
