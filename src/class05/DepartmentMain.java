package class05;

import class03.Student;

public class DepartmentMain {

	public static void main(String[] args) {
		
		// DepartmentData 객체 생성
		DepartmentData dd = new DepartmentData();	//DepartmentData 객체의 주소가 dd로 들어간다
		Department[] departments = dd.departments;	//DepartmentData 객체의 필드를 갖고옴
		
		//Department type의 배열 변수
		//Department[] departments = new Department[3];
		
		// 기초 데이터 생성
		//initData(departments);
		
		// 학과 목록을 출력
		printDepartment(departments);
		
		// 학과 코드(Id)가 "923"인 학과의 코드 (Id), name , office를 출력
		getDepartment(departments);
		
		// 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력
		String str = getOffice(departments);
		System.out.println(str);
		
		
		
		
		
	} //end of main

	
	
	
	private static String getOffice(Department[] departments) {// 컴퓨터공학과의 교실 start
		String name = "";
		
		for (int i = 0; i < departments.length; i++) {
			if (departments[i].getName().equals("컴퓨터공학과")) {
				name=departments[i].getOffice();
			}
		}
		String result = name;
		return result;
	}// 컴퓨터공학과의 교실 end
 
	
	private static void getDepartment(Department[] departments) {// start 학과 코드(Id)가 "923"
		for (int i = 0; i < departments.length; i++) {
			if (departments[i].getId() == 923) {
				System.out.println(departments[i].getId()+"\t"+departments[i].getName()+"\t"+departments[i].getOffice());
			}
		}
		System.out.println();
	}// end 학과 코드(Id)가 "923"

	
	private static void printDepartment(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department.getId()+"\t"+department.getName()+"\t"+department.getOffice());
		}
		System.out.println();
	}// end 학과 목록을 출력
	
	
//	private static void initData(Department[] departments) {
//		
//		departments[0] = new Department(920,"컴퓨터공학과","201호");
//		departments[1] = new Department(923,"산업공학과","207호");
//		departments[2] = new Department(925,"전자공학과","308호");
		
	//}// end 기초 데이터 생성

}// end of class
