package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> st = new HashSet<>();

		System.out.print("How many students for course A? ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			st.add(sc.nextInt());
		}

		System.out.print("How many students for course B? ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			st.add(sc.nextInt());
		}

		System.out.print("How many students for course C? ");
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			st.add(sc.nextInt());
		}
		
		System.out.println("Total students: " + st.size());

		sc.close();

	}

}
