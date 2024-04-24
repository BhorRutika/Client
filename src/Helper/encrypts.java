package Helper;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.spec.KeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.SecureRandom;
import java.util.Base64;

public class encrypts 
{

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int KEY_SIZE = 256;
    private static final int ITERATIONS = 65536; // Adjust as needed
    private static final String SALT = "YourSalt"; // Change this to your salt
    private static final String FILE_PATH = "/home/aditya12/Desktop/Keys/samplefile.txt"; // Change this to your file path

    public static void main(String[] args) {
        try {
            String originalContent = readFile(FILE_PATH);
            SecretKey secretKey = generateSecretKey();
            System.out.println("Key:"+secretKey);
            String encryptedContent = encrypt(originalContent, secretKey);
            writeFile(FILE_PATH + ".encrypted", encryptedContent);

            String encryptedFileContent = readFile(FILE_PATH + ".encrypted");
            String decryptedContent = decrypt(encryptedFileContent, secretKey);
            writeFile(FILE_PATH + ".decrypted", decryptedContent);

            System.out.println("Encryption and decryption completed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SecretKey generateSecretKey() throws NoSuchAlgorithmException, InvalidKeySpecException 
    {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = secureRandom.generateSeed(16); // Generate a random salt
        KeySpec keySpec = new PBEKeySpec(SALT.toCharArray(), salt, ITERATIONS, KEY_SIZE);
        SecretKeyFactory factory = SecretKeyFactory.getInstance(SECRET_KEY_ALGORITHM);
        byte[] encodedKey = factory.generateSecret(keySpec).getEncoded();
        return new SecretKeySpec(encodedKey, ALGORITHM);
    }

    private static String encrypt(String content, SecretKey secretKey) throws Exception 
    {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(content.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedContent, SecretKey secretKey) throws Exception 
    {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedContent));
        return new String(decryptedBytes);
    }

    private static String readFile(String filePath) throws IOException 
    {
        byte[] encoded = Files.readAllBytes(Paths.get(filePath));
        return new String(encoded);
    }

    private static void writeFile(String filePath, String content) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.close();
    }
}
