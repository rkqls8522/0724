package basic0724_1;

public class Scanner {

	int scanner;
	
	Scanner(){//�⺻ ������
		
	}
	Scanner(String a){
		System.out.println(a + "�� ����");
	}
	Scanner(String a, int b){
		System.out.println(a + "�� int�� �Բ� ���ɴϴ�.");
		scanner = b;
	}
	
	int nextInt() {
		System.out.println("����� Ű����� �Է¹��� ���� ������ ��ȯ��");
		return this.scanner;
	}
	
	
}
