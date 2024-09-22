import repository.compteRepository;
import service.bankService;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        compteRepository cr = new compteRepository();

        String url="http://localhost:8044/";
        Endpoint.publish(url, new bankService(cr));
        System.out.println(url);
    }
}
