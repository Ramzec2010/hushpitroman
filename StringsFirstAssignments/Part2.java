package StringsFirstAssignments;


/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
public static String findSimpleGene(String dna, int startCodon, int stopCodon) {
        String DNA = dna.substring(startCodon,stopCodon);
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
        String result = findSimpleGene(a,1,20);
        System.out.println(result);
    }
}
