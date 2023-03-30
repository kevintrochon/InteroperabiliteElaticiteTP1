package services;

import entities.CompteDataScience;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(name = "MLWS")
public class MLService {

    @WebMethod(operationName = "getComptes")
    public List<CompteDataScience> getComptes(){
        List<CompteDataScience> comptes = new ArrayList<>();
        comptes.add(new CompteDataScience(1L,"Nils","Boby"));
        comptes.add(new CompteDataScience(2L,"Doe","John"));
        return comptes;
    }

    @WebMethod
    public double getMoyenne(double[] list){
        return Arrays.stream(list).sum()/list.length;
    }

    @WebMethod
    public List<double[]> calculKMoyen(String filePath,int k){
        KMoyen kMeans = new KMoyen(k,  filePath);
        // Run k-means algorithm
        kMeans.run();
        // Print the resulting centroids
        return kMeans.getCentroids();
    }
}
