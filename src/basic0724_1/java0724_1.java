package basic0724_1;

public class java0724_1 {

	public static void main(String[] args) {

		//2차원 배열 이용하여 회원 목록 만들기
		String[] user = {};
		
		String[][] userArray = {
			{"노가빈","여자","20세","만18세","성남시 분당구 수내동"},
			{"홍길동","남자","40세","만39세","서울특별시 중랑구 상봉동"},
			{"홍말자","여자","30세","만29세","경기도 남양주시 평내동"},
		};
		
		System.out.println("이름      성별   나이   만나이    주소");
		for(int i = 0; i < userArray.length;i++) {
			for(int j = 0; j < userArray[i].length; j++)
			System.out.print(userArray[i][j]+"   ");
		System.out.println();
		}
		
		
		
		
		
		
	}

}
