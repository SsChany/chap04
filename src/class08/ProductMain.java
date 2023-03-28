package class08;

public class ProductMain  {

	public static void main(String[] args) {

		
		//데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;
		
		// [문제 1] 전체 상품 목록 출력
		printProduct(products);
		
		// [문제 2] 세탁기의 가격을 조회하시오.
		String tempstr = "세탁기";
		getWashPrice(tempstr,products);
		
		// [문제 3] 구매한 모든 제품의 총액과 평균 가격을 main메소드에서 출력하세요.
		int sum = getTotalAmount(products);
		double avg = getAvg(products);
		System.out.printf("구매한 모든 제품의 총액	 : %d\n구매한 모든 제품의 평균가격 : %.2f",sum,avg);
		System.out.println();
		
		// [문제 4] 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액 출력
		getProductGrather100(products);
		
	} // end of main
	
	private static void  getProductGrather100(Product[] products) {
		int count = 0;
		int sum = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다.\n");
		System.out.println("---------------------------------------------");
		for (Product product : products) {
			if (product.getPrice()>=1000000) {
				count++;
				sum+=product.getPrice();
				
				System.out.printf("%d\t %s\t %d\n",product.getId(),product.getName(),product.getPrice());
				System.out.println("---------------------------------------------");
			}
		}
		System.out.printf("100만원 이상인 제품의 수량은 %d개 이며 합계금액은 : %d입니다.",count,sum);
	
		
	}

	private static double getAvg(Product[] products) {
		int sum = 0;
		double avg = 0.0;
		double count = 0.0;
		for (Product product : products) {
			sum += product.getPrice();
			count++;
		}
		avg = (sum*1)/count; // count = products.length ;
//		System.out.println(sum);
//		System.out.println(count);
//		System.out.println(avg);
		return avg;
	}
	// 합계 구하는 메소드	/---int는 나가는 출구
	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}
									  // String, Product[]같이 타입을 적어줘야됨
	private static void getWashPrice(String tempstr, Product[] products) {
		for (Product product : products) {
			if (product.getName().equals(tempstr)) {
				System.out.println("세탁기의 가격 	: "+ product.getPrice());
				System.out.println();
			}
		}
	}

	private static void printProduct(Product[] products) {
		for (Product product : products) {
			System.out.printf("%d	%s	%d	\n",product.getId(),product.getName(),product.getPrice());
		}
		System.out.println();
	}
		
}

