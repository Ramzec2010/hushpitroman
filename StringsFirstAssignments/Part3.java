package StringsFirstAssignments;


/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    
    public boolean twoOccurrences(String stringa, String stringb) {
        boolean isAonB = false;
        int a = stringb.indexOf(stringa);
        if (a>=0) {
            if (stringb.indexOf(stringa,a+1)>0) isAonB = true;
            else isAonB = false;
        }
        else isAonB = false;
        return isAonB;
    }
    
    String lastPart(String stringa, String stringb) {
        String output = null;
        int lengh = stringa.length();
        int a = stringb.indexOf(stringa);
        if(a>=0) {
        output = stringb.substring(a+lengh);
        }
        else {output = stringb;}
        return output;
    }
    
    
    void testing() {
    String a = "an";
    String b = "bananana";
    //System.out.println(twoOccurrences(a,b));
    System.out.println(lastPart(a,b));
    }
}
