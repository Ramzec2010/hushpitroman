package CaesarClipher;
import static java.lang.Character.isUpperCase;
import edu.duke.*;
/**
 * Write a description of CaesraCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesraCipher {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        String shiftedAlphabetLover = alphabetLower.substring(key) + alphabetLower.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            int idxLow = alphabetLower.indexOf(currChar);
            if (idx !=-1 || idxLow !=-1) {
                if (isUpperCase(currChar)){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
                else if (Character.isLowerCase(currChar)){
                    char newChar = shiftedAlphabetLover.charAt(idxLow);
                    encrypted.setCharAt(i, newChar);
                }
            }
            
        }
        return encrypted.toString();
    }
    
    public String encryptTwoKeys (String input, int key1, int key2) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(Character.toUpperCase(currChar));
            if (idx !=-1) {
                if (isUpperCase(currChar)){
                    if(i%2 == 0) {
                        char newChar = shiftedAlphabet1.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                    else {
                        char newChar = shiftedAlphabet2.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
                else if (Character.isLowerCase(currChar)){
                    if (i%2 == 0){
                        char newChar = Character.toLowerCase(shiftedAlphabet1.charAt(idx));
                        encrypted.setCharAt(i, newChar);
                    }
                    else {
                        char newChar = Character.toLowerCase(shiftedAlphabet2.charAt(idx));
                        encrypted.setCharAt(i, newChar);
                    }
                }
            }
            
        }
        return encrypted.toString();
    } 
    
    public void testCaesar() {
        int key1 = 15;
        int key2 = 15;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encryptTwoKeys(message, key1, key2);
        System.out.println(encrypted);
        String decrypted = encryptTwoKeys (encrypted, 26 - key1, 26 - key2);
        System.out.println(decrypted);
    }
}
