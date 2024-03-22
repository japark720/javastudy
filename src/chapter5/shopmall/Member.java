package chapter5.shopmall;

/*
 * 회원
 */
public class Member {
	String name;
	String id;
	String pwd;
	int age;
	char gender; // M: 남자 , F: 여자
	String zipCode;
	String addr;
	String hobby;

	void register(String name, String id, String pwd, int age, char gender, String zipCode, String addr, String hobby) {
		// 데이터베이스에 회원정보를 사입하는 구문.
	}

	void edit(String name, String id, String pwd, int age, char gender, String zipCode, String addr, String hobby) {
		// 데이터베이스에 회원정보를 수정하는 구문
	}
	
	void delete(String id, String pwd) {
		// 데이터베이스에 회원정보를 삭제하는 구문
	}
	
	boolean login(String id, String pwd) {
		// 데이터베이스에 아이디, 비밀번호 존재유므체크에서 존재하면 true, 존재하지 않으면 false;
		return true;
	}
	
	boolean idCheck(String id) {
		// 데이터베이스에 아이디가 존재하지 않으면 사용가능 true
		// 데이터베이스에 아이디가 존재하면 사용 불가능 false
		return true;
	}
	
}
