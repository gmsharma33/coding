package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

public class BitSetSample {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		String[] arr1 = line1.split(" ");
		int len = Integer.parseInt(arr1[0]);
		int m = Integer.parseInt(arr1[1]);
		BitSet bit1 = new BitSet(len);
		BitSet bit2 = new BitSet(len);

		for (int i = 0; i < m; i++) {
			String line = reader.readLine();
			String[] arr2 = line.split(" ");
			String option = arr2[0];
			int bit = Integer.parseInt(arr2[1]);
			int index = Integer.parseInt(arr2[2]);
			switch (option) {
			case "AND":
				if(bit == 1) {
					bit1.and(bit2);
				} else {
					bit2.and(bit1);
				}
				int count1 = bit1.cardinality();
				int count2 = bit2.cardinality();
				System.out.println(count1 + " " + count2);
				break;
			case "XOR":
				if(bit == 1) {
					bit1.xor(bit2);
				} else {
					bit2.xor(bit1);
				}
				count1 = bit1.cardinality();
				count2 = bit2.cardinality();
				System.out.println(count1 + " " + count2);
				break;
			case "SET":
				if(bit == 1) {
					bit1.set(index);
				} else {
					bit2.set(index);
				}
				count1 = bit1.cardinality();
				count2 = bit2.cardinality();
				System.out.println(count1 + " " + count2);
				break;
			case "FLIP":
				if(bit == 1) {
					bit1.flip(index);
				} else {
					bit2.flip(index);
				}
				count1 = bit1.cardinality();
				count2 = bit2.cardinality();
				System.out.println(count1 + " " + count2);
				break;
			case "OR":
				if(bit == 1) {
					bit1.or(bit2);
				} else {
					bit2.or(bit1);
				}
				count1 = bit1.cardinality();
				count2 = bit2.cardinality();
				System.out.println(count1 + " " + count2);
				break;
			default:
				break;
			}
		}
	}

}
