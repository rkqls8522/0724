package basic0724_1;

public class java0724_1 {

	public static void main(String[] args) {

		//2���� �迭 �̿��Ͽ� ȸ�� ��� �����
		String[] user = {};
		
		String[][] userArray = {
			{"�밡��","����","20��","��18��","������ �д籸 ������"},
			{"ȫ�浿","����","40��","��39��","����Ư���� �߶��� �����"},
			{"ȫ����","����","30��","��29��","��⵵ �����ֽ� �򳻵�"},
		};
		
		System.out.println("�̸�      ����   ����   ������    �ּ�");
		for(int i = 0; i < userArray.length;i++) {
			for(int j = 0; j < userArray[i].length; j++)
			System.out.print(userArray[i][j]+"   ");
		System.out.println();
		}
		
		
		
		
		
		
	}

}
