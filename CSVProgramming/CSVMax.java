package CSVProgramming;

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

/**
 * Write a description of CSVMax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CSVMax {
    public CSVRecord hottestHourInFile (CSVParser parser) {
        CSVRecord largestSoFar = null;
        for (CSVRecord currentRow : parser) {
            largestSoFar = getLargestOfTwo (currentRow, largestSoFar); 
        }
        return largestSoFar;
    }

    public CSVRecord getLargestOfTwo (CSVRecord currentRow, CSVRecord largestSoFar) {
        if( largestSoFar == null) {
                largestSoFar = currentRow;
            }
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
                if (currentTemp > largestTemp) {
                    largestSoFar = currentRow;
                }
            }
            return largestSoFar;
    }
    
    public void testHottestInDay () {
        FileResource fr = new FileResource();
        CSVRecord largest = hottestHourInFile (fr.getCSVParser());
        System.out.println("hottest tenoerature was: " + largest.get("TemperatureF") + 
                                " at " + largest.get("TimeEST"));
    }
    
    public CSVRecord hottestInManyDays() {
        CSVRecord largestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = hottestHourInFile (fr.getCSVParser());
            largestSoFar = getLargestOfTwo (currentRow, largestSoFar); 
        }
        return largestSoFar;
    }

    public void testHottestInMAnyDays () {
        CSVRecord largest = hottestInManyDays();
        System.out.println("hottest tenoerature was: " + largest.get("TemperatureF") + 
                                " at " + largest.get("DateUTC"));
    }
    
    public double averageTemperatureInFile (CSVParser parser) {
        double sum_of_temp = 0.0;
        int count = 0;
        for (CSVRecord currentRow : parser) {
            double curTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            sum_of_temp +=curTemp;
            count++;
        }
        return sum_of_temp/count;
    }
    public void testAverageTemperatureInFile() {
        FileResource fr = new FileResource();
        double aver = averageTemperatureInFile(fr.getCSVParser());
        System.out.println(aver + " is an average temperature");
    }
    
    public double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value) {
        double sum_of_temp = 0.0;
        int count = 0;
        for (CSVRecord currentRow : parser) {
            if (Double.parseDouble(currentRow.get("Humidity")) >= value){
            double curTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            sum_of_temp +=curTemp;
            count++;
        } 
        }
        if (count == 0){
            return 0;}
        else {
        return sum_of_temp/count;}
    }
    
    public void testAverageTemperatureWithHighHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        double aver = averageTemperatureWithHighHumidityInFile(parser, 80);
        System.out.println(aver + " fsdsfsdfs" );
    }
}
