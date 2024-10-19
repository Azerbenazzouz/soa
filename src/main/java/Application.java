import repository.CurrencyRepository;
import repository.CompteRepository;
import service.BankService;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        // Create instances of repositories
        CompteRepository compteRepository = new CompteRepository();
        CurrencyRepository currencyRepository = new CurrencyRepository();

        // Define the URL for the web service
        String url = "http://localhost:8044/bankService";

        // Publish the web service, passing both repositories to the service constructor
        Endpoint.publish(url, new BankService(compteRepository, currencyRepository));

        // Output the service URL to the console
        System.out.println("Service published at: " + url);
    }
}
