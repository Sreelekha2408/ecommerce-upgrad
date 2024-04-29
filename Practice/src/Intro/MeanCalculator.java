package Intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MeanCalculator {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "/Users/sreelekha/Study/Practice/src/Intro/PracticeFile";

        // Read numbers from the file and calculate the mean
        double mean = calculateMean(filePath);

        // Print the mean
        System.out.println("Mean of the numbers: " + mean);
    }

    public static double calculateMean(String filePath) {
        try {
            // Open the file
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Initialize variables for sum and count
            double sum = 0;
            int count = 0;

            // Read numbers from the file and calculate sum and count
            while (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sum += number;
                count++;
            }

            // Close the scanner
            scanner.close();

            // Calculate the mean
            double mean = sum / count;
            return mean;
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: " + e.getMessage());
            return -1; // Return -1 to indicate an error
        }
    }
}
