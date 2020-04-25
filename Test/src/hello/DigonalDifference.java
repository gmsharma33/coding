package hello;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigonalDifference {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = diagonalDifference(arr);

		System.out.println(String.valueOf(result));
		bufferedReader.close();
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int res1 = 0, res2 = 0;
		
		int len = arr.size();
		for (int i = 0; i < len; i++) {
			res1 += arr.get(i).get(i);
			res2 += arr.get(i).get(len - i - 1);
		}

		return Math.abs(res1 - res2);
	}
}
