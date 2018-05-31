package NumbersAndArrays;
import edu.duke.*;

/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts) {
        String text = resource.asString();
        int letCount = 0;
        String t = "'-";
        char ch1 = t.charAt(0);
        char ch2 = t.charAt(1);
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.charAt(i) == ch1 
            || text.charAt(i) == ch2 && Character.isLetter(text.charAt(i+1))) {
                letCount++;
            }
            else {
                counts[letCount]++;
                letCount = 0;
            }
        }
        counts[letCount]++;
        for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0 && i !=0) {
                    System.out.println(counts[i] + " words of length " + i);
                }
            }
    }
    
    public void testCountWordLengths() {
        FileResource resource = new FileResource();
        int[] counts = new int[31];
        countWordLengths(resource, counts);
    }
    

}
