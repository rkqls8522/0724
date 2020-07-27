package basic0724_1;

public class Scanner {

	int scanner;
	
	Scanner(){//기본 생성자
		
	}
	Scanner(String a){
		System.out.println(a + "가 들어옴");
	}
	Scanner(String a, int b){
		System.out.println(a + "가 int와 함께 들어옵니다.");
		scanner = b;
	}
	
	int nextInt() {
		System.out.println("여기는 키보드로 입력받은 값을 정수로 반환함");
		return this.scanner;
	}
	
	
}
