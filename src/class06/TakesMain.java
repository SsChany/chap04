package class06;

public class TakesMain {

	public static void main(String[] args) {
		TakesData td = new TakesData();
		Takes[] takes = td.takes;
		
		// 성적 객체를 담을 Takes 타입 배열 선언 (12)칸
		//Takes[] takes = new Takes[12];
		
		// 기초데이터 생성
		//initData(takes);
		
		//1. 전학생 성적 출력(toString 메소드 이용)
		printTakes(takes);
		
		//2. 성적이 "A+"인 "id"의 이름을 반환받아서 출력
		String[] names = getAplus(takes);
		for (String string : names) {
			System.out.println(string);
		}
	}// main end
	
	
	
	private static String[] getAplus(Takes[] takes) {
		String names = ""; 
		for (Takes t2 : takes) {
			if (t2.getScore().equals("A+")) {
				names = names + t2.getId() + ",";
			}
		}
		String[] arrName = names.split(",");
		return arrName;
		
	}



	private static void printTakes(Takes[] takes) {
		for (Takes takes2 : takes) {
			System.out.println(takes2.getId()+"\t"+takes2.getSubject()+"\t"+takes2.getScore());
		}
		System.out.println();
	}



	private static void initData(Takes[] takes) {// 기초데이터 start
		// 성적 객체를 생성하면서 배열에 바로 저장 
		takes[0] = new Takes("1292001", "C101-01", "B+");
		takes[1] = new Takes("1292001", "C103-01", "A+");
		takes[2] = new Takes("1292001", "C301-01", "A");
		takes[3] = new Takes("1292002", "C102-01", "A");
		takes[4] = new Takes("1292002", "C103-01", "B+");
		takes[5] = new Takes("1292002", "C502-01", "C+");
		takes[6] = new Takes("1292003", "C103-02", "B");
		takes[7] = new Takes("1292003", "C501-02", "A+");
		takes[8] = new Takes("1292301", "C102-01", "C+");
		takes[9] = new Takes("1292303", "C102-01", "C");
		takes[10] = new Takes("1292303", "C103-02", "B+");
		takes[11] = new Takes("1292303", "C501-01", "A+");
	}// 기초데이터 end

}
