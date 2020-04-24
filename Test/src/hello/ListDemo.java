package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		List<Integer> list = new ArrayList<Integer>(N);
		String line = reader.readLine();
		String[] arr = line.split(" ");
		for(int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		int q = Integer.parseInt(reader.readLine());
		for(int i = 0; i < q; i++) {
			String op = reader.readLine();
			if("Insert".equalsIgnoreCase(op)) {
				line = reader.readLine();
				arr = line.split(" ");
				list.add(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			} else if("delete".equalsIgnoreCase(op)) {
				line = reader.readLine();
				list.remove(Integer.parseInt(line));
			}
		}
		System.out.println(list);
		reader.close();
	}
}

