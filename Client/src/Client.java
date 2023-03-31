import net.java.dev.jaxb.array.DoubleArray;
import services.MLServiceService;
import services.MLWS;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        MLWS stub = new MLServiceService().getMLWSPort();
        List<Double> list = Arrays.asList(1.5,2.6,3.3);
        Double res = stub.getMoyenne(list);
        System.out.println(res);
        List<DoubleArray> clusters = stub.calculKMoyen("C:\\Users\\Utilisateur\\Documents\\Master\\Master2\\S02\\InterOperabilite\\data.csv",3);
        for (int i = 0; i < clusters.size(); i++) {
            System.out.print("Centroid " + i + ": ");
            for (int j = 0; j < clusters.get(i).getItem().size(); j++) {
                System.out.print(clusters.get(i).getItem().get(j) + " ");
            }
            System.out.println();
        }
    }
}
