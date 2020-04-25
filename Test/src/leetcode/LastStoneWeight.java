package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = { 2, 2 };
		System.out.println(new LastStoneWeight().lastStoneWeight(stones));
	}

	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		List<Integer> list = new ArrayList<>();
		for (int s : stones) {
			list.add(s);
		}
		System.out.println(list);
		int count = 0;
		while (true) {
			list.sort((i1, i2) -> {
				return i1 - i2;
			});
			int x = list.get(list.size() - 2);
			int y = list.get(list.size() - 1);
			list.remove(list.size() - 2);
			if (x == y) {
				list.remove(list.size() - 1);
			} else {
				list.set(list.size() - 1, y - x);
			}
			if (list.size() == 1) {
				count = list.get(0);
				break;
			}
			if (list.isEmpty()) {
				break;
			}
		}
		return count;
	}

}
