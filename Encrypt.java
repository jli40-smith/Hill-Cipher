import java.util.HashMap;

public class Encrypt { 
    String plaintext; 
    int blockSize; 
    /*Maps each letter in the alphabet to a number*/
    HashMap<String, Integer> alphabetToNumber = new HashMap<String, Integer>() {{
        put("A", 0); put("B", 1); put("C", 2);
        put("D", 3); put("E", 4); put("F", 5);
        put("G", 6); put("H", 7); put("I", 8);
        put("J", 9); put("K", 10); put("L", 11);
        put("M", 12); put("N", 13); put("O", 14);
        put("P", 15);
        put("Q", 16);
        put("R", 17);
        put("S", 18);
        put("T", 19);
        put("U", 20);
        put("V", 21);
        put("W", 22);
        put("X", 23);
        put("Y", 24);
        put("Z", 25);

    }}; 
    
    public Encrypt(String plaintext, int blockSize) {
        this.plaintext = plaintext;
        this.blockSize = blockSize;
    }
    public static void main(String[] args) {
        
    }
}