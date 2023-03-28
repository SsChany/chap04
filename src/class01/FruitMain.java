package class01;

public class FruitMain {

	public static void main(String[] args) {

		
		// 객체 한개 생성
		Fruit peach = new Fruit(); //객체생성 연산자 new , 필드초기화 
		
		peach.setName("복숭아");
		peach.setPrice(6000);
		peach.setQuantity(5);
		
		printFruit(peach); //****(****) 형태는 메소드
		
		Fruit apple = new Fruit("사과",2000,5);
		Fruit mango = new Fruit("망고" , 1000, 2);
		Fruit banna = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000 ,1);
		Fruit orange = new Fruit("오렌지", 6000, 4);
		
		printFruit(apple,mango,banna,pineapple,orange); 
		
		
		//"사과" ,2000, 5 - apple
		//"망고" , 1000, 2 - mango
		//"바나나", 2500, 3 - banna
		//"파인애플", 5000 1 - pineapple
		//"오렌지", 6000, 4 -orange
		
		// 과일 객체 5개 담을 수 있는 Array 선언
		Fruit[] frArr =new Fruit [5];
		
		// 선언한 배열에 위에서 만든 과일 객체 담으세요
		frArr[0] = new Fruit("사과",2000,5);
		frArr[1] = new Fruit("망고" , 1000, 2);
		frArr[2] = new Fruit("바나나", 2500, 3);
		frArr[3] = new Fruit("파인애플", 5000 ,1);
		frArr[4] = new Fruit("오렌지", 6000, 4);
		
		printFruit(frArr);
	}// main end

	private static void printFruit(Fruit[] frArr) {
		for (Fruit fruit : frArr) {
			System.out.println(fruit.getName()+"\t"+fruit.getPrice()+"\t"+fruit.getQuantity());
		}
	}

	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName()+"\t"+peach.getPrice()+"\t"+peach.getQuantity());
		System.out.println();
	}
	private static void printFruit(Fruit apple,Fruit mango,Fruit banna,Fruit pineapple,Fruit orange) {
		System.out.println(apple.getName()+"\t"+apple.getPrice()+"\t"+apple.getQuantity());
		System.out.println(mango.getName()+"\t"+mango.getPrice()+"\t"+mango.getQuantity());
		System.out.println(banna.getName()+"\t"+banna.getPrice()+"\t"+banna.getQuantity());
		System.out.println(pineapple.getName()+"\t"+pineapple.getPrice()+"\t"+pineapple.getQuantity());
		System.out.println(orange.getName()+"\t"+orange.getPrice()+"\t"+orange.getQuantity());
		System.out.println();
	}
	
}// class end
