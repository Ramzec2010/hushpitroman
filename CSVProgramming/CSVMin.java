package CSVProgramming;
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

/**
 * Write a description of CSVMin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CSVMin {
    public CSVRecord coldestHourInFile (CSVParser parser) {
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
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double smallestTemp = Double.parseDouble(smallestSoFar.get("TemperatureF"));
                if (currentTemp < smallestTemp) {
                    smallestSoFar = currentRow;
                }
            }
            return smallestSoFar;
    }
    
    public CSVRecord coldestInManyDays() {
        CSVRecord smallestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = coldestHourInFile (fr.getCSVParser());
            smallestSoFar = getSmallestOfTwo (currentRow, smallestSoFar); 
        }
        return smallestSoFar;
    }
    
    public void testColdestInMAnyDays () {
        CSVRecord smallest = coldestInManyDays();
        System.out.println("coldest tenoerature was: " + smallest.get("TemperatureF") + 
                                " at " + smallest.get("DateUTC"));
    }
}
