package elementList;
import org.openqa.selenium.By;

public class FlightSelectElements {

    public static By oneWayButton = By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static By fromToButton = By.id("com.turkishairlines.mobile:id/frDashboard_tvFrom");
    public static By searchBoxButton = By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static By selectSaw = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
    public static By toButton = By.id("com.turkishairlines.mobile:id/frDashboard_llTo");
    public static By secondSearchBoxButton = By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static By selectEsb = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
    public static By dateButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
    public static By dateSelect = By.xpath("//*[@class=\"android.view.ViewGroup\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static By doneButton = By.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static By addPersonButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
    public static By searchFlightButton = By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");

}
