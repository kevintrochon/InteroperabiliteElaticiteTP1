import net.java.dev.jaxb.array.DoubleArray;
import services.MLServiceService;
import services.MLWS;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer le path du fichier csv, svp ?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Veuillez entrer le nombre de cluster souhaité, svp ?");
        scanner.nextLine();
        int nbCluster = Integer.parseInt(scanner.nextLine());
        MLWS stub = new MLServiceService().getMLWSPort();
        List<DoubleArray> clusters = stub.calculKMoyen(answer.replace("\\","\\\\"),nbCluster);
        for (int i = 0; i < clusters.size(); i++) {
            System.out.print("Centroid " + i + ": ");
            for (int j = 0; j < clusters.get(i).getItem().size(); j++) {
                System.out.print(clusters.get(i).getItem().get(j) + " ");
            }
            System.out.println();
        }
    }
}
