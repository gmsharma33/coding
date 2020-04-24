package test;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,5,0};
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr.length; k++) {
				if(i == k) continue;
				if(arr[i] + 1 == arr[k] ) {
					map.put(arr[i], map.get(arr[i]) != null ? map.get(arr[i]) + 1 : 1);
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
