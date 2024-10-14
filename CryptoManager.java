/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: This class performs both encryption and decryption in Caesar and Bellaso Ciphers.
 * Due: 10/13/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Hassane Bagayoko
*/

public class CryptoManager {

	private static final int LOWER_RANGE = 32;
	private static final int UPPER_RANGE = 126;
	/**
	 * IsStringInBounds returns true or false if a String is in the allowable bounds of ASCII codes.
	 * @param plainText The String to be encrypted.
	 * @return boolean value true or false.
	 */
	public static boolean isStringInBounds(String plainText) {
		char character;
		boolean isInBounds = false;
		
		for(int i = 0; i <= plainText.length(); i++) {
			character = plainText.charAt(i);
			if(character >= LOWER_RANGE && character <= UPPER_RANGE)
				isInBounds = true;
		}
		
		return isInBounds;
	}
	
	/**
	 * caesarEncryption encrypts a String according to Caesar Cipher.
	 * @param plainText a String to be encrypted.
	 * @param key an int specifies an offset and each character in plainText is replaced by the character
	 *  the specified distance away from it.
	 *  @return encrypted String
	 */
	public static String caesarEncryption(String plainText, int key) {
		String uPlainText = plainText.toUpperCase();
		char character;
		char nCharacter;
		String encryptedString = uPlainText;
		
		if (!isStringInBounds(plainText))
			return "The selected string is not in bounds, Try again.";
		else
			for(int i = 0; i <= plainText.length(); i++)
			{
				character = uPlainText.charAt(i);
				nCharacter = (char)((int)uPlainText.charAt(i) + key);
				encryptedString = uPlainText.replace(character, nCharacter);
			}
		
		 return encryptedString;
	}
	
	/**
	 * caesarDecryption decrypts a string according to the Caesar Cipher.
	 * @param encryptedText encrypted string to be decrypted.
	 * @param key the integer used to encrypt the original text.
	 * @return original String
	 */
	public static String caesarDecryption(String encryptedText, int key) {
		char character;
		char characterN;
		String decryptedString = encryptedText;
		
		for(int i = 0; i <= encryptedText.length(); i++)
		{
			character = encryptedText.charAt(i);
			characterN = (char)((int)encryptedText.charAt(i) - key);
			decryptedString = encryptedText.replace(character, characterN);
		}
		
		return decryptedString.toLowerCase();
	}
	
	/**
	 * bellasoEncryption encrypts a string according to the Bellaso Cipher.
	 * @param plainText a string to be encrypted.
	 * @param bellasoStr a string used to perform Bellaso Cipher.
	 * @return encrypted String.  
	 */
	public static String bellasoEncryption(String plainText, String bellasoStr) {
		StringBuilder encryptedText = new StringBuilder();
		StringBuilder repeatBStr = new StringBuilder();
		
		while (repeatBStr.length() < plainText.length())
		{
			repeatBStr.append(bellasoStr);
		}
		
		String key = repeatBStr.substring(0, plainText.length());
		
		for (int i = 0; i < plainText.length(); i++)
		{
			char textChar = plainText.charAt(i);
			char keyChar = key.charAt(i);
			int encryptedValue = (int)textChar + (int)keyChar;
			
			if(encryptedValue > UPPER_RANGE)
				encryptedValue -= (UPPER_RANGE - LOWER_RANGE);
			
			encryptedText.append((char)encryptedValue);
		}
		
		return encryptedText.toString();
	}
	
	/**
	 * bellasoDecryption decrypts a string according to Bellaso Cipher.
	 * @param encryptedText is the encrypted string to be decrypted.
	 * @param bellasoStr is the string used to encrypt the original text.
	 * @return original plain text.
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		StringBuilder decryptedText = new StringBuilder();
		StringBuilder repeatBStr = new StringBuilder();
		
		while(repeatBStr.length() < encryptedText.length())
			repeatBStr.append(bellasoStr);
		
		String key = repeatBStr.substring(0, encryptedText.length());
		
		for (int i = 0; i < encryptedText.length(); i++)
		{
			char textChar = encryptedText.charAt(i);
			char keyChar = key.charAt(i);
			int decryptedValue = (int)textChar - (int)keyChar;
			
			if(decryptedValue < LOWER_RANGE)
				decryptedValue += (UPPER_RANGE - LOWER_RANGE);
			
			decryptedText.append((char)decryptedValue);
		}
		
		return decryptedText.toString();
	}
}