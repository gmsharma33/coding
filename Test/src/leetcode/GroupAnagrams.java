package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		new GroupAnagrams().groupAnagrams(arr);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		List<List<String>> result = new ArrayList<>();
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String rev = new String(c);
			if (map.containsKey(rev)) {
				map.get(rev).add(s);
			} else {
				List<String> l = new ArrayList<String>();
				l.add(s);
				map.put(rev, l);
			}
		}
		for (Map.Entry<String, List<String>> m : map.entrySet()) {
			System.out.println(m.getValue());
			result.add(m.getValue());
		}
		return result;
	}

}
