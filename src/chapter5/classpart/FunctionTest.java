package chapter5.classpart;

// 메서드 정의하기
// 메서드 : 기능을 구현하는 코드로 구성된 것.
public class FunctionTest {
	
	// main()메서드 : 자바에서 프로그램을 실행하기 위한 목적으로 만들어 준 것.
	public static void main(String[] args) {
		System.out.println(add(10, 20));
	}
	
	// 메서드 기본 구조
	/*
	 * 리턴타입 메서드 이름(매개변수 선언) {
	 * ...
	 * ...
	 * ...
	 * return 사용유무;
	 * }
	 */
	
	// 정수형 숫자 2개의 값을 매개변수로 제공 받아 더한 값을 리턴하는 메서드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
