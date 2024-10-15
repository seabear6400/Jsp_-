package jch08;

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1+" try 블럭문 전");
		
		try {
			System.out.println(0/0+" try 블럭문 0/0 실행");  //0/0 실행 불가 에러
			System.out.println(2+" try 블럭문");
		}catch (ArithmeticException ae) {
			System.out.println(3+" catch 블럭문 실행 ArithmeticException  ae");
		}
		System.out.println(4+" try 블럭문 끝");
	}

}
