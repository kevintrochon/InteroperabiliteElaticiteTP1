package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KMoyen {

    private int k;
    private int maxIterations;
    private List<double[]> data;
    private List<double[]> centroids;

    public KMoyen(int k, String csvPath) {
        this.k = k;
        this.maxIterations = 100;
        this.data = new ArrayList<>();
        this.centroids = new ArrayList<>();
        readDataFromCSV(csvPath);
    }

    private void readDataFromCSV(String csvPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                double[] point = new double[values.length];
                for (int i = 0; i < values.length; i++) {
                    point[i] = Double.parseDouble(values[i]);
                }
                data.add(point);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        // Randomly initialize centroids
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            centroids.add(data.get(random.nextInt(data.size())));
        }
        // Run k-means algorithm
        for (int iter = 0; iter < maxIterations; iter++) {
            // Assign each data point to the closest centroid
            List<List<double[]>> clusters = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                clusters.add(new ArrayList<>());
            }
            for (double[] point : data) {
                int clusterIndex = 0;
                double minDistance = Double.MAX_VALUE;
                for (int i = 0; i < k; i++) {
                    double distance = euclideanDistance(point, centroids.get(i));
                    if (distance < minDistance) {
                        minDistance = distance;
                        clusterIndex = i;
                    }
                }
                clusters.get(clusterIndex).add(point);
            }

            // Recompute centroids
            for (int i = 0; i < k; i++) {
                double[] centroid = new double[data.get(0).length];
                for (int j = 0; j < centroid.length; j++) {
                    double sum = 0.0;
                    for (double[] point : clusters.get(i)) {
                        sum += point[j];
                    }
                    centroid[j] = sum / clusters.get(i).size();
                }
                centroids.set(i, centroid);
            }
        }
    }

    public List<double[]> getCentroids() {
        return centroids;
    }

    private double euclideanDistance(double[] a, double[] b) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }
}
