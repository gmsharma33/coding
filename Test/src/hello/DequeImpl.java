package hello;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeImpl {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);
			int count = 0;
			if(deque.size() == m) {
				if(set.size() > max) {
					max = set.size();
				}
				int ele = deque.remove();
				if(!deque.contains(ele)) {
					set.remove(ele);
				}
			}
			max = max > count ? max : count;
		}
		System.out.println(max);

	}
}
