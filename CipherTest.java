import java.util.Scanner; 

public class CipherTest {
    public static void main(String[] args) {
        System.out.println("Enter plaintext: ");
        Scanner input = new Scanner(System.in); 

        String plaintext = input.nextLine().toUpperCase().replaceAll(" ","") ; //Removes spaces from input and makes all characters uppercase
        
        Encrypt myEncryption = new Encrypt(plaintext, 2); 
        System.out.println(myEncryption.getPlaintext());
        input.close();
    }
}
