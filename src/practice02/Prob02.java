package practice02;

import java.util.Scanner;

public class Prob02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sum = 0.;
		int[] intArray = new int[5];

		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int i=0; i<intArray.length; i++) {
			
			intArray[i] = scanner.nextInt();
			
		}
		for(int i=0; i<intArray.length; i++) {
			
			sum = sum + intArray[i];
			
		}
		

		System.out.println("평균은 "+sum / intArray.length+" 입니다.");
		scanner.close();
	}

}
