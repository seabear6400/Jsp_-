package jch08;
import java.util.*;
public class Ex8_5v2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 0, result = 0;
		
		System.out.print("1. 숫자를 입력하세요");
		try {
			n1= in.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("1 입력형식 예외 발생");
			e.printStackTrace();
		}
		System.out.print("2. 숫자를 입력하세요");
		try {
			n2= in.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("2 입력형식 예외 발생");
			e.printStackTrace();
		}
		try {
			result = n1 / n2;
		}catch (ArithmeticException e) {
			System.out.println("3.0으로 나눌 수 없음");
			e.printStackTrace();
		}
		System.out.printf("%d/%d=%d\n", n1, n2, result);
	}

}
