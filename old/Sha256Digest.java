package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Sha256Digest {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] data = digest.digest(s.getBytes());
		for (byte b : data) {
			System.out.printf("%02x", b);
		}
	}

}
