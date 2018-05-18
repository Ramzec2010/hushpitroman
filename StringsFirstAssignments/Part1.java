package StringsFirstAssignments;


/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public static String findSimpleGene(String DNA) {
        int startInd = DNA.indexOf("atg");
        if (startInd == -1) {
        return "1";
        }
        int endInd = DNA.indexOf("taa",startInd+3);
        if (endInd == -1) {
            return "2";
        }
        if ((endInd - startInd)%3 == 0){
        String gene = DNA.substring(startInd, endInd+3);
        return gene;
        }
        else {
        return "3";
        }
    }
    
    public static void testing() {
		String a = "cccatggggtfttaaataataataggagagagagagagagttt";
		String ap = "atggaggtttaa";
		//String a = "atgcctag";
		//String ap = "";
		//String a = "ATGCCCTAG";
		//String ap = "ATGCCCTAG";
		String result = findSimpleGene(a);
		System.out.println(result);
	}
    
    public static void main (String[] args) {
   
        testing();
    }
}
