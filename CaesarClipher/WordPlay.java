package CaesarClipher;


/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        char [] vowel = {'a', 'e', 'i', 'o', 'u'};
        boolean answer = false;
        for (int i = 0; i < vowel.length; i++) {
            if (ch == vowel[i]) {
            answer =true;
            break;
        }
            else answer = false;
        }
        return answer;
    }
    public void testIsVowel() {
        System.out.println(isVowel('b'));
    }
    public String replaceVowels(String phrase, char ch) {
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = phrase.charAt(i);
            if (isVowel(currChar)) {
                newPhrase.setCharAt(i, ch);
            }
            else {
                newPhrase.setCharAt(i, currChar);
            }
        }
        return newPhrase.toString();
    }
    public String emphasize (String phrase, char ch) {
        ch = Character.toLowerCase(ch);
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = Character.toLowerCase(phrase.charAt(i));
            if (currChar == ch) {
                if(i%2 ==0 ) {
                    newPhrase.setCharAt(i,'*');
                }
                else newPhrase.setCharAt(i, '+');
            }
    }
    return newPhrase.toString();
    }
}
