package class10;

import class10.vo.Student;
import class10.vo.Takes;
import class10.vo.Department;
import class10.vo.MakeData;
import class10.vo.Professor;
/*
 * 학사 행정 실행클래스
 * - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보 + 학과정보)
 */
public class SchoolManagementMain {

	public static void main(String[] args) {
		MakeData md = new MakeData();
		Student[] students = md.students;
		Department[] departments = md.departments;
		Takes[] takes = md.takes;
		Professor[] professors = md.professors;
		
		// 1. 학생 데이터와 학과 
	      System.out.println("============================학생 데이터와 학과==========================");
		System.out.println("학번\t 이름 \t  주민번호\t\t 학년\t 주소 \t 학과번호\t 학과\t");
		int code = 0;
		for (int i = 0; i < students.length; i++) {
			code = students[i].getDepartment(); 
			for (int j = 0; j < departments.length; j++) {
				if (departments[j].getId()==code) {
					System.out.printf("%s\t %s\t %s\t %d\t %s\t %d\t %s\n",students[i].getId(),students[i].getName(),students[i].getJumin(),students[i].getYear(),students[i].getAddress(),students[i].getDepartment(),departments[j].getName());
					
				}//end of if1
			}//end of for 2
		} //end of for 1
		
		// 2. 학생 데이터와 성적
		System.out.println();
		System.out.println("===============================학생 데이터와 성적==================================");
		System.out.println("학번\t 이름 \t  주민번호\t\t 학년\t 주소 \t 학과번호\t 과목코드\t\t 성적");
		for (Student student : students) {
			for (Takes takes2 : takes) {
				if (student.getId().equals(takes2.getId())) {
					System.out.printf("%s\t %s\t %s\t %d\t %s\t %d\t %s\t %s\n",student.getId(),student.getName(),student.getJumin(),student.getYear(),student.getAddress(),student.getDepartment(),takes2.getSubject(),takes2.getScore());
				}
			}
		}
		System.out.println();
		
		// 3. 컴퓨터공학과 교수들을 모두 조회
		System.out.println("=====================컴퓨터공학과 교수======================");
		String searchDept = "컴퓨터공학과";
		int did = 0; // 컴퓨터공학과 id 저장용 변수
		for (Department department1 : departments) {
			if (department1.getName().equals(searchDept)) {
				did = department1.getId(); // 컴퓨터 공학과의  id 추출 (920)
			}
		}
		for (Professor professor : professors) {
			if (professor.getDepartment()==did) {
				System.out.printf("%s\t %s\t %s\t %d\t %s\t %s\n",professor.getId(),professor.getJumin(),professor.getName(),professor.getDepartment(),professor.getGrade(),professor.getHiredate());
			}
		}
		
		
	} // end of main
} // end of class 

