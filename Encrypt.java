import java.util.*;

public class Encrypt { 
    private String plaintext; 
    private int blockSize; 
    /*Maps each letter in the alphabet to a number*/
    HashMap<String, Integer> alphabetToNum = new HashMap<String, Integer>() {{
        put("A", 0); put("B", 1); put("C", 2);
        put("D", 3); put("E", 4); put("F", 5);
        put("G", 6); put("H", 7); put("I", 8);
        put("J", 9); put("K", 10); put("L", 11);
        put("M", 12); put("N", 13); put("O", 14);
        put("P", 15); put("Q", 16); put("R", 17);
        put("S", 18); put("T", 19); put("U", 20);
        put("V", 21); put("W", 22); put("X", 23);
        put("Y", 24); put("Z", 25);
    }}; 
    
    public Encrypt(String plaintext, int blockSize) {
        this.plaintext = plaintext;
        if (blockSize == 2 || blockSize == 3) {
            this.blockSize = blockSize;
        } else {
            System.err.println("The blockSize must be 2 or 3"); 
        }
        /* Finds number of filler text characters to add to the end of the plaintext to make it divisible by 6*/
        int fillerTextLength = 6 - (plaintext.length() % 6);
        
        /*Adds the needed number of filler text characters to the plaintext*/
        for (int i=0; i<fillerTextLength; i++) { 
            this.plaintext += getRandomLetter(); 
        }
    }

    public String getRandomLetter() { 
        Set<String> alphabet = alphabetToNum.keySet();
        List<String> alphabetToList = new ArrayList<>(alphabet);

        int size = alphabet.size();
        int randIndex = new Random().nextInt(size);

        String randLetter= alphabetToList.get(randIndex);
        return randLetter; 
    } 

    /*Accessors*/
    public String getPlaintext() {
        return this.plaintext; 
    }

    public int getblockSize() {
        return this.blockSize; 
    }

    public static void main(String[] args) {
        
    }
}