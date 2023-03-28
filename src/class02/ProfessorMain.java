package class02;


public class ProfessorMain {// class start

	public static void main(String[] args) {//main start

		Professor[] pros = new Professor[6];

		pros[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		pros[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		pros[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		pros[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		pros[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		pros[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
	
		// 교수들의 목록을 출력해주는 메소드를 만드세요.
		printProfessor(pros);
		System.out.println();
		// 910 학과 교수중 입사년도가 2005인 교수는?
		printProfessordate(pros);
		System.out.println();
//		주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
//		새로 입사한 선명규 교수를 그 자리에 저장하세요.
//		(빈객체 생성후 setter 메소드로 값 저장)
//		"96031","790208-1884203",선명규,920,"부교수","2021"
		
		
		newProfessor(pros);
		
	}//end of main

	

	private static void newProfessor(Professor[] pros) {
		
		for (int i = 0; i < pros.length; i++) {
			if ((pros[i].getJumin().equals("590327-1839240")) && pros[i].getName().equals("이태규")) {
				Professor sun = new Professor();
				sun.setId("96031");
				sun.setJumin("790208-1884203");
				sun.setName("선명규");
				sun.setDepartment(920);
				sun.setGrade("부교수");
				sun.setHiredate("2021");
				
				pros[i] = sun;
			}
		}
		printProfessor(pros);
}



	private static void printProfessordate(Professor[] pros) {
		for (Professor professor : pros) {
			if ((professor.getDepartment() == 910) && (professor.getHiredate().equals("2005"))) {
				System.out.printf("%s\t%s\t%s\t%d\t%s\t%s \n", professor.getId(), professor.getJumin(), professor.getName(), professor.getDepartment(), professor.getGrade(), professor.getHiredate());
			}
		}
		
}// 910학과 입사년도 2005 end

	private static void printProfessor(Professor[] pros) {//교수목록 start
		for (Professor professor : pros) {
			System.out.println(professor.getId()+"\t"+professor.getJumin()+"\t"+professor.getName()+"\t"+professor.getDepartment()+"\t"+professor.getGrade()+"\t"+professor.getHiredate());
		}
}//교수목룍 end
	
	
	
} //end of class
