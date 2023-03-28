package class01;

public class EmployeeMain {

	public static void main(String[] args) {

		// Employee type Array 선언(10칸짜리)
		Employee[] employees = new Employee[10];

		// Raw Data로 각 배열에 객체를 생성해서 저장
		employees[0] = new Employee("A", 28, 400, "KR", 10, "정규");
		employees[1] = new Employee("B", 27, 600, "KR", 15, "정규");
		employees[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
		employees[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
		employees[4] = new Employee("E", 23, 270, "RU", 1, "정규");
		employees[5] = new Employee("F", 27, 390, "AM", 4, "정규");
		employees[6] = new Employee("G", 31, 330, "SI", 3, "정규");
		employees[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
		employees[8] = new Employee("I", 38, 450, "FR", 10, "정규");
		employees[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		//1. 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
		System.out.println("1. 전 사원들의 목록");
		printEmployee(employees);
		System.out.println();
		
		//2. 정규직 평균급여를 구해주는 메소드 생성 (결과 반환)
		double avg = getSalAvg(employees);
		//System.out.printf("2.정규직 직원들의 평균 급여는 : %.2f",avg); 
		System.out.println("2. 정규직 직원들의 평균 급여는 :" + Math.round(avg*100)/100.0);
													// Math.round 변수*100/100.0
		
		//[문제.3] 한국(KR) 사원들의 평균급여 
		double kAvg = getkSalAvg(employees);
		System.out.println("2. 한국 직원들의 평균 급여는 :" + Math.round(kAvg*100)/100.0);
		
		
		
		
		
		
	} // end of main
	

	private static double getkSalAvg(Employee[] employees) { // 한국사원 start
		int sum1 = 0;
		int count1 = 0;
		double ksalAvg = 0.0;
			for (Employee employee : employees) {
				if (employee.getLocal().equals("KR")) {
					sum1 += employee.getSalary();
					count1++;
				}
			}
		ksalAvg = (double) sum1 / count1 ;
		return ksalAvg;
	} // 한국 사원 end


	private static double getSalAvg(Employee[] employees) {// 정규사원 start

		int sum = 0;
		int count = 0;
		double salAvg = 0.0;
		for (Employee employee : employees) {
			if (employee.getGubun().equals("정규")) {
				sum += employee.getSalary();
				count++;
			}
		}
		salAvg = (double) sum / count;
		return salAvg;
	} // 정규 사원 end



	private static void printEmployee(Employee[] employees) { //전사원 목록 start
		for (Employee employee : employees) {
			System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary() + "\t"
					+ employee.getLocal() + "\t" + employee.getTerms() + "\t" + employee.getGubun());
		}

	}// 전사원 목록

}
