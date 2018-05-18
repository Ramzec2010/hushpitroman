
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.File;
/**
 * Write a description of Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby {
    public void printNames () {
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            if (numBorn < 100) {
                System.out.println("Name " + rec.get(0) + " Gender " +rec.get(1) + 
                                " Nub Born " + rec.get(2));
            }
        }
    }
    
    public void totalBirths (FileResource fr) {
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        int NumGirlsName = 0;
        int NumBoysName = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
                NumBoysName++;
            } else {
                totalGirls += numBorn;
                NumGirlsName++;
            }
        }
        System.out.println ("total births = " + totalBirths);
        System.out.println ("total boys = " + totalBoys);
        System.out.println ("total girls = " + totalGirls);
        System.out.println ("total boys name = " + NumBoysName);
        System.out.println ("total girls name = " + NumGirlsName);
    }
    public void testTotalBirths () {
        FileResource fr = new FileResource();
        totalBirths(fr);
    }
    
    public int getRank (int year, String name, String gender) {
        FileResource fr = new FileResource("us_babynames_by_year/yob" +year+ ".csv");
        int rank = 0;
        for (CSVRecord record : fr.getCSVParser(false)) {
            if (record.get(1).equals(gender)) {
                rank++;
                if (record.get(0).equals(name)) {
                    System.out.println("Name " + record.get(0) + " Gender " +record.get(1) + 
                                " Nub Born " + record.get(2));
                    break;
                }
            }
            else {}
        }
        return rank;
    }
    public void testGetRank () {
        int a = getRank(1880,"John","M");
        System.out.println(a);
        
        String name = getName(1880, 5, "M");
        System.out.println(name);
    }
    
    public String getName (int year, int rank, String gender) {
        FileResource fr = new FileResource("us_babynames_by_year/yob" +year+ ".csv");
        String name = null;
        int currentRank = 0;
        for (CSVRecord record : fr.getCSVParser(false)) {
            if (record.get(1).equals(gender)) {
                currentRank++;
                if (currentRank == rank) {
                    name = record.get(0);
                    break;
                }
            }
            else {}
        }
        if (name.isEmpty()) 
            return "No name";
        else 
        return name;
    }
    
     public void testGetName () {
        String name = getName(1880, 3, "F");
        System.out.println(name);
    }
    
    public void whatIsNameInYear(String name, int year, int newYear, String gender) {
        int rankInFirstYear = getRank(year,name,gender);
        String NameInSecYeat = getName(newYear,rankInFirstYear, gender);
        System.out.println(name + " born in " +year +" would be "+ NameInSecYeat+
                    " if she/he was born in "+ newYear);
    }
    public void testWhatIsNAmeInYear() {
        whatIsNameInYear("Alice", 1880, 1881, "F");
    }
    
    public String yearOfHighestRank (String name, String gender) {
        String nameYear = null;
        int highRank = 100000;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            int rank = 0;
            FileResource fr = new FileResource(f);
            for (CSVRecord record : fr.getCSVParser(false)) {
                if (record.get(1).equals(gender)) {
                rank++;
                if (record.get(0).equals(name)) {
                    //System.out.println("Name " + record.get(0) + " Gender " +record.get(1) + 
                                //" Nub Born " + record.get(2));
                    break;
                }
            }
            else {}
            }
            if (rank < highRank) {
                highRank = rank;
                nameYear = f.getName();
            }
        }
        return nameYear;
    }
    
    public void tesYearOfHighestRank () {
        String a = yearOfHighestRank ("Margaret", "F");
        System.out.println(a);
    }
}
