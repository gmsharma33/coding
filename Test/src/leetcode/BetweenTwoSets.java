package leetcode;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BetweenTwoSets {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = getTotalX(arr, brr);

		System.out.println(String.valueOf(total));

		bufferedReader.close();
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int count = 0;
		a.sort((i1, i2)->{return i1-i2;});
		b.sort((i1, i2)->{return i1-i2;});
		int min = a.get(a.size()-1);
		int max = b.get(0);
		Set<Integer> temp = new HashSet<>();
		for(int i = min; i <= max; i++) {
			count = 0;
			for(int a1 : a) {
				if(i % a1 == 0) {
					count++;
				}
			}
			if(count == a.size()) {
				temp.add(i);
			}
		}
		int res = 0;
		count = 0;
		for(int a1: temp) {
			count = 0;
			/*
			 * for(int a2 : a) { if(a1 % a2 != 0) { temp.remove(a2); } }
			 */
			for(int a2 : b) {
				if(a2 % a1 == 0) {
					count++;
				}
			}
			if(count == b.size()) res++;
		}
		return res;
	}

}
