package NumbersAndArrays;

import CaesarClipher.*;
import edu.duke.*;

/**
 * Write a description of BreakingTheSipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BreakingTheSipher {
        public int[] countLetters (String message) {
           String alph = "abcdefghijklmnoprstuvwxyz";
           int [] counts = new int[26];
           for (int k = 0; k < message.length(); k++) {
               char ch = Character.toLowerCase(message.charAt(k));
               int dex = alph.indexOf(ch);
               if (dex != -1) {
                counts[dex] +=1;
               }
            }
            return counts;
        }
        public int maxIndex (int[] vals) {
            int maxDex = 0;
            for (int k = 0; k < vals.length; k++) {
                if (vals[k] > vals[maxDex] ) {
                    maxDex = k;
                }
            }
            return maxDex;
        }
        
        public String decrypt (String encrypted) {
           CaesraCipher cc = new CaesraCipher();
           int [] freqs = countLetters(encrypted);
           int maxDex = maxIndex(freqs);
           int dkey = maxDex - 3;
           if (maxDex < 3) {
            dkey = 26 - (3 - maxDex);
           }
           return cc.encrypt(encrypted, 26-dkey);
        }
        public int[] countLettersFirstLetter (String message) {
           String alph = "abcdefghijklmnoprstuvwxyz";
           int [] counts = new int[26];
           for (int k = 0; k < message.length(); k+=2) {
               char ch = Character.toLowerCase(message.charAt(k));
               int dex = alph.indexOf(ch);
               if (dex != -1) {
                counts[dex] +=1;
               }
            }
            return counts;
        }
        public int[] countLettersSecondLetter (String message) {
           String alph = "abcdefghijklmnoprstuvwxyz";
           int [] counts = new int[26];
           for (int k = 1; k < message.length(); k+=2) {
               char ch = Character.toLowerCase(message.charAt(k));
               int dex = alph.indexOf(ch);
               if (dex != -1) {
                counts[dex] +=1;
               }
            }
            return counts;
        }
        public String decryptTwoKeyses (String encrypted) {
           CaesraCipher cc = new CaesraCipher();
           int [] freqs1 = countLettersFirstLetter(encrypted);
           int [] freqs2 = countLettersSecondLetter(encrypted);
           int maxDex1 = maxIndex(freqs1);
           int maxDex2 = maxIndex(freqs2);
           int dkey1 = maxDex1 - 3;
           if (maxDex1 < 3) {
            dkey1 = 26 - (3 - maxDex1);
           }
           int dkey2 = maxDex2 - 3;
           if (maxDex2 < 3) {
            dkey2 = 26 - (3 - maxDex2);
           }
           return cc.encryptTwoKeys(encrypted, 26-dkey1, 26-dkey2);
        }
        
        public void testTwoKeys() {
            FileResource fr = new FileResource();
            String messageOriginal = fr.asString();
            System.out.println(messageOriginal);
            CaesraCipher cc = new CaesraCipher();
            String message = cc.encryptTwoKeys(messageOriginal, 15, 12);
            System.out.println(message);
            String decryptTwoKeys = decryptTwoKeyses(message);
            System.out.println(decryptTwoKeys);
        }
        public void testOneKey() {
            FileResource fr = new FileResource();
            String messageOriginal = fr.asString();
            System.out.println(messageOriginal);
            CaesraCipher cc = new CaesraCipher();
            String s1 = cc.encrypt(messageOriginal, 15);
            System.out.println(s1);
            String s2 = decrypt(s1);
            System.out.println(s2);
        }
        
}
