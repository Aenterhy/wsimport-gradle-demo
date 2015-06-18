package ge.lanmaster.wscallproject;

import com.ebay.marketplace.search.v1.services.FindingService;
import com.ebay.marketplace.search.v1.services.FindingServicePortType;
import com.ebay.marketplace.search.v1.services.GetVersionRequest;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        //just sample code to show that generated sources are reachable
        FindingService service = new FindingService();
        FindingServicePortType port = service.getFindingServiceSOAPPort();
        GetVersionRequest request = new GetVersionRequest();
        Future<?> future = port.getVersionAsync(request);
        System.out.println("ItWorks = " + (service != null && future != null));
    }

}
