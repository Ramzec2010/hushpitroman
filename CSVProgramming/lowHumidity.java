package CSVProgramming;

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
/**
 * Write a description of lowHumidity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lowHumidity {
    public CSVRecord lowestHumidityInFile (CSVParser parser) {
        CSVRecord smallestSoFar = null;
        for (CSVRecord currentRow : parser) {
            smallestSoFar = getSmallestOfTwo (currentRow, smallestSoFar); 
        }
        return smallestSoFar;
    }
    
    public CSVRecord getSmallestOfTwo (CSVRecord currentRow, CSVRecord smallestSoFar) {
        if( smallestSoFar == null) {
                smallestSoFar = currentRow;
            }
            else {
                if( !currentRow.get("Humidity").equals("N/A") ){
                double currentTemp = Double.parseDouble(currentRow.get("Humidity"));
                double smallestTemp = Double.parseDouble(smallestSoFar.get("Humidity"));
                if (currentTemp < smallestTemp) {
                    smallestSoFar = currentRow;
                }
            }
                else {}
            }
            return smallestSoFar;
    }
    
    public void testLowestHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord csv = lowestHumidityInFile(parser);
        System.out.println("Lowest Humidity was " + csv.get("Humidity")+ " at " 
                                                   + csv.get("DateUTC"));
    }
    
    public CSVRecord  LowestHumidityInManyFiles() {
        CSVRecord smallestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = lowestHumidityInFile (fr.getCSVParser());
            smallestSoFar = getSmallestOfTwo (currentRow, smallestSoFar); 
        }
        return smallestSoFar;
    }
    
    public void testLowestHumidityInManyDays () {
        CSVRecord smallest = LowestHumidityInManyFiles();
        System.out.println("lowest humidity was: " + smallest.get("Humidity") + 
                                " at " + smallest.get("DateUTC"));
    }
}
