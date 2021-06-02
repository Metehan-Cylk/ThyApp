package elementList;
import org.openqa.selenium.By;

public class ResultsElements {

    public static By flightArea = By.id("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");
    public static By flightList = By.xpath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static By selectEcoFligth = By.xpath("//*[@class=\"android.widget.LinearLayout\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static By continueButton = By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");

}
