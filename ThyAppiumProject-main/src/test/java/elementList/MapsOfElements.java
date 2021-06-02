package elementList;
import org.openqa.selenium.By;
import java.util.HashMap;

import static elementList.FlightSelectElements.*;
import static elementList.ResultsElements.*;
import static elementList.HomeElements.*;

public class MapsOfElements {

    public static HashMap<String, By> elementsMap(){
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put( "BookAFlight", BookAFlyButton);
        elementsMap.put( "oneWayButton", oneWayButton);
        elementsMap.put( "fromToButton", fromToButton);
        elementsMap.put( "searchBoxButton", searchBoxButton);
        elementsMap.put( "selectSaw", selectSaw);
        elementsMap.put( "toButton", toButton);
        elementsMap.put( "secondSearchBoxButton", secondSearchBoxButton);
        elementsMap.put( "goToSelectResult", selectEsb);
        elementsMap.put( "dateButton", dateButton);
        elementsMap.put( "dateSelect", dateSelect);
        elementsMap.put( "doneButton", doneButton);
        elementsMap.put( "addPersonButton", addPersonButton);
        elementsMap.put( "searchFlightButton", searchFlightButton);
        elementsMap.put( "flightArea", flightArea);
        elementsMap.put( "flightList)", flightList);
        elementsMap.put( "selectEcoFligth", selectEcoFligth);
        elementsMap.put( "continueButton", continueButton);
        return elementsMap;
    }


}
