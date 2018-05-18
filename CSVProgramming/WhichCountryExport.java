package CSVProgramming;
import edu.duke.*;
import org.apache.commons.csv.*;
/**
 * Write a description of class WhichCountryExport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhichCountryExport {
    public void listExporters (CSVParser parser, String exportOfInterest) {
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            
            if (export.contains(exportOfInterest)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
    }
    
    public void countryInfo (CSVParser parser, String country) {
        for (CSVRecord record : parser) {
            String con = record.get("Country");
            if (con.equals(country)) {
                System.out.print(record.get("Country") + ": "); 
                System.out.print(record.get("Exports") + ": "); 
                System.out.println(record.get("Value (dollars)")); 
            }
        }
    }
    
    public void listExportersTwoProducts (CSVParser parser, String exportitem1, String exportitem2){
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            if (export.contains(exportitem1) && export.contains(exportitem2))
            {
                System.out.println(record.get("Country"));
            }
        }
    }
    
    public int numberOfExporters (CSVParser parser, String exportitem) {
        int count = 0;
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            if (export.contains(exportitem))
                count++;
        }
        return count;
    }
    
    public void bigExporters (CSVParser parser, String amount) {
        for (CSVRecord record : parser) {
            String dollar = record.get("Value (dollars)");
            if (dollar.length() > amount.length()){
                System.out.print(record.get("Country") + " ");
                System.out.println(record.get("Value (dollars)"));
            }
        }
    }
    
    public void tester() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        //countryInfo(parser, "Nauru");
        //listExportersTwoProducts(parser, "gold", "diamonds");
        //System.out.println(numberOfExporters(parser, "gold"));
        bigExporters (parser, "$999,999,999,999");
    }
    public void whoExportsCoffe() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExporters (parser,"coffe");
    }
}
