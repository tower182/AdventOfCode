import java.io.*;
import java.security.*;
import java.util.*;
import java.math.*;

public class Day4 {
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}

			return hashtext;

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		int x = 0; int y = 0;
		String secretKey = new String("yzbqklnj");
		String startsWithFive = new String("00000");
		String hashResultFive = new String("11111");
		String startswithSix = new String("000000");
		String hashResultSix = new String("111111");

		while (!((hashResultFive.substring(0,5)).equals(startsWithFive)))  {
			
			x++;
			String inputFive = new String(secretKey + Integer.toString(x));
			hashResultFive = getMD5(inputFive);
		}
		
		while(!((hashResultSix.substring(0,6)).equals(startswithSix))) {
			y++;
			String inputSix = new String(secretKey + Integer.toString(y));
			hashResultSix = getMD5(inputSix);
		}
		System.out.println(x);
		System.out.println(y);
	}
}