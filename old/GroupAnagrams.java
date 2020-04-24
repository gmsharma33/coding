package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] arr = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<String, List<String>> map = new HashMap<>();
		for(int i = 0 ; i < arr.length; i++) {
			String str = arr[i];
			for(int k = i + 1; k < arr.length; k++) {
				String temp = arr[k].chars().sorted().collect(StringBuilder::new, 
						StringBuilder::appendCodePoint,
						StringBuilder::append).toString();
				List<String> list = map.get(str);
				if(str.equals(temp)) {
					if(list != null) {
						list.add(temp);
					} else {
						list = new ArrayList<>();
						list.add(str);
					}
				} else {
					if(list != null) {
						list.add(temp);
					} else {
						list = new ArrayList<>();
						list.add(str);
					}
				}
			}
		}
	}

}
