package class03;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] students = new Student[8];
		// 학생 데이터를 생성해주는 메소드 호출
		initData(students);
		
		// 문제 1 학생 목록을 출력하는 메소드를 만드세요.
		printStudent(students);
		
		// 문제 2 여학생들의 명단을 출력하시오.
		printWomanStudent(students);
		
		// 문제3 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main 메소드에서 출력하세요.
		String[] strName = getSeoulStudent(students);
		for (String str : strName) {
			System.out.println(str);
		}
		
	}//end of main
	
	private static String[] getSeoulStudent(Student[] students) { // 전달값 받는 곳 (파라미터,매개변수)
		String names = ""; // 서울 3학년생들의 이름을 이어붙일 String type  변수
		
		for (Student student : students) {
			if (student.getAddress().equals("서울") && student.getYear()==3) {
				names += student.getName() + ","; // 문자열 이어붙임
			}
		}
		String[] resultName = names.split(",");
		return resultName;
	}

	private static void printWomanStudent(Student[] students) {//start of 여학생들의 명단
		System.out.println("=====================여학생 명단=======================");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getJumin().substring(7,8).equals("2")) {
				System.out.println(students[i].getId()+"\t"+students[i].getJumin()+"\t"+students[i].getName()+"\t"+students[i].getYear()+"\t"+students[i].getAddress()+"\t"+students[i].getDepartment());
			}
		}
		System.out.println("===================================================");
		
	} // end of 여학생들의 명단

	private static void printStudent(Student[] students) {//start of 학생 목록을 출력하는 메소드 
		System.out.println("=====================학생 목록========================");
		for (Student student : students) {
			System.out.println(student.getId()+"\t"+student.getJumin()+"\t"+student.getName()+"\t"+student.getYear()+"\t"+student.getAddress()+"\t"+student.getDepartment());
		}
		System.out.println("===================================================");
		System.out.println();
	}	// end of 학생 목록을 출력하는 메소드 

	private static void initData(Student[] students) {//  start of 학생 데이터를 생성해주는 메소드
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92); 
		students[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20); 
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55); 
		students[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78); 
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54); 
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88); 
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73); 
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95); 
		
	}//  end of 학생 데이터를 생성해주는 메소드

	
	
} // end of class
