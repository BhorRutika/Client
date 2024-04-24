package Helper;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;
import java.nio.file.*;

public class decrypt {
    public static void main(String[] args) throws Exception {
        String keyString = "4iomO7yeV8yjypUDssTApiPx+Eo0r5hdZFh58sFkzsg="; // Replace with your actual key
        SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "AES"); // Use appropriate algorithm

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); // Use the correct algorithm and padding

        // Initialize the cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(new byte[16])); // Use appropriate IV if used in encryption

        // Read the encrypted file
        byte[] encryptedData = Files.readAllBytes(Paths.get("/home/aditya12/Desktop/Keys/samplefile.txt"));

        // Decrypt the data
        byte[] decryptedData = cipher.doFinal(encryptedData);

        // Write the decrypted data to a new file
        Files.write(Paths.get("/home/aditya12/Desktop/Keys"), decryptedData);
    }
}
