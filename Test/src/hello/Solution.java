package hello;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	String name;
	double cgpa;
	int token;

	public Student(int token, String name, double cgpa) {
		this.token = token;
		this.name = name;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getToken() {
		return token;
	}
}

class Priorities {

	public List<Student> getStudents(List<String> events) {
		PriorityQueue<Student> queue = new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed()
				.thenComparing(Student::getName).thenComparing(Student::getToken));
		List<Student> students = new ArrayList<>();
		for (String event : events) {
			Scanner scanner = new Scanner(event);
			String e = scanner.next();
			if (e.equals("ENTER")) {
				String name = scanner.next();
				float cgpa = scanner.nextFloat();
				int token = scanner.nextInt();

				Student student = new Student(token, name, cgpa);
				queue.add(student);
			} else if (e.equals("SERVED")) {
				Student st = queue.poll();
			}
		}
		Student st = queue.poll();
		if (st == null) {
			return students;
		} else {
			while (st != null) {
				students.add(st);
				st = queue.poll();
			}
		}
		return students;
	}

}

public class Solution {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}