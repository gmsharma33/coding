package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Demo {

	private class Inner {
		void powerof2(int num) {

		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class
						// Solution.Inner.Private

			// Write your code here
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.score > p2.score) {
			return -1;
		} else if(p1.score < p2.score) {
			return 1;
		} else {
			return p1.name.compareTo(p2.name);
		}
	}
	
}
}