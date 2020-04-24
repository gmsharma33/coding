package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Encryption {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] data = digest.digest(s.getBytes());
		BigInteger bigInteger = new BigInteger(1, data);
		String hashSet = bigInteger.toString(16);
		while(hashSet.length() < 32) {
			hashSet = "0" + hashSet;
		}
		System.out.println(hashSet);
	}

}
