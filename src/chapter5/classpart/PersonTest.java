package chapter5.classpart;

public class PersonTest {
	public static void main(String[] args) {
		// Person 클래스 사용 - 기억장소가 생성된 의미
		Person ps1 = new Person();
		
		// ps1 객체가 가리키는 기억장소표현
		ps1.name = "HONG";
		ps1.height = 180;
		ps1.weight = 70;
		ps1.gender = 'M';
		ps1.married = false;
		
		ps1.getPersonInfo();
		
		Person ps2 = new Person();
		Person ps3 = new Person();
		Person ps4 = new Person();
		Person ps5 = new Person();
	}
}
