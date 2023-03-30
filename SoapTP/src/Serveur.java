import services.MLService;

import javax.xml.ws.Endpoint;

public class Serveur {
    public static void main(String[] args) {
        String url = "http://localhost:8685/";
        Endpoint.publish(url,new MLService());
    }
}
