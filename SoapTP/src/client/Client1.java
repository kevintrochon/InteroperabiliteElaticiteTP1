package client;

import net.java.dev.jaxb.array.DoubleArray;
import services.MLServiceService;
import services.MLWS;

import java.util.Arrays;
import java.util.List;

public class Client1 {
    public static void main(String[] args) {

        MLWS stub = new MLServiceService().getMLWSPort();
        List<Double> list = Arrays.asList(1.5,2.6,3.3);
        Double res = stub.getMoyenne(list);
        System.out.println(res);
    }
}
