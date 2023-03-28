package class01;

/*
 * 메소드간 파라미터 전달 ( 배열 , 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 *  - 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 */
public class CallByReferenceReturn {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] newNumbers = addTen(numbers);  // 메소드 호출하고 반환된 값을 받음
		//// 전달받은 배열의 요소에 10을 더해주는 메소드
		//addTen(numbers);
		 for (int i = 0; i < numbers.length; i++) {	// 아래 addTen메소드에있는 for문과 같은 주소인 for문
		 System.out.println(numbers[i]);
		 }
	
	for (int i = 0; i < newNumbers.length; i++) {	
		 System.out.println(newNumbers[i]);
		 }
	
	}

									//arr 변수명은 위에" int[] 'numbers'"의 변수 이름과 달라도 상관없음 
	private static int[] addTen(int[] arr) {
		
		int[] nums = null;	//메모리공간 확보안됨 (초기화 해야 사용o)
		nums = new int[arr.length];	// 5칸짜리 새로운 배열이 만들어짐.
		nums[0] = arr[0] + 10;
		nums[1] = arr[1] + 10;
		nums[2] = arr[2] + 10;
		nums[3] = arr[3] + 10;
		nums[4] = arr[4] + 10;
		
		
		arr[0] = arr[0] +10;
		arr[1] = arr[1] +10;
		arr[2] = arr[2] +10;		//수동으로 10씩 더해줌❤❤
		arr[3] = arr[3] +10;
		arr[4] = arr[4] +10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 10;
			System.out.println(arr[i]);
		}
		return nums; // 값 반환
	}
	
}
