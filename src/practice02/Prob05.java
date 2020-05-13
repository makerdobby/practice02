package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int tryCount = 1;
		
		// System.out.println("--->"+k); //cheat key
		
		while (true) {
			System.out.print(tryCount + ">>");
			int input = scanner.nextInt();

			if (k == input) {
				break;
			}
			else if(k < input) {
				System.out.println("더 낮게");
			}
			else {
				System.out.println("더 높게");
			}

			tryCount++;
		}

		System.out.println("맞았습니다.");
		
		

		scanner.close();
	}

}
