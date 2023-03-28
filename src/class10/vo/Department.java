package class10.vo;

public class Department {
	// 필드(멤버변수, 인스턴스변수)
	private	int id;
	private String name;
	private String office;
	
	// 기본생성자 ( main에서  변수 생성시 필드를 기본값으로 만들어줌)
	public Department() {}
	
	// 오버로딩 생성자 
	public Department(int id, String name, String office){
			this.id=id;
			this.name=name;
			this.office=office;
			
		}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}
	
	
	
}
