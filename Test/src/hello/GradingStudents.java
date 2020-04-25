package hello;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;;

public class GradingStudents {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = gradingStudents(grades);

		System.out.println(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> res = new ArrayList<>();
		grades.stream().forEach(item -> {
			if(item >= 38 && (item % 5 >= 3 || item % 5 == 0)) {
				item = item % 5 == 0 ? item : item + (5 - item % 5);
				res.add(item);
			} else {
				res.add(item);
			}
		});
		return res;
	}

}
