package class01;

/*
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 *  - 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 *  레퍼런스는 주소란 뜻
 */
public class CallByReference {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		// int 자료형 변수 5개 선언해서 1,2,3,4,5 저장
		int ff1 = 1;
		int ff2 = 2;
		int ff3 = 3;
		int ff4 = 4;
		int ff5 = 5;
		
		
		printArray(numbers); // 배열 출력 메소드 호출
		printArray(ff1,ff2,ff3,ff4,ff5); //오버로딩 타개순 때문에 이름 같아도됨(타입이다름)
	}

												//파라미터 , 매개변수
	private static void printArray(int ff1, int ff2, int ff3, int ff4, int ff5) {
		System.out.println(ff1+""+ff2+ff3+ff4+ff5);
	}


	// 배열을 전달 받아서 출력해주는 메소드		//배열 
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}

	}
	
}
