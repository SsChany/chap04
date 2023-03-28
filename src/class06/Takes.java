package class06;

public class Takes {

	private String id;
	private String subject;
	private String score;
	
	public Takes() {}

	public Takes(String id, String subject,String score) {
		
		this.id=id;					//학번
		this.subject=subject;		//과목명
		this.score=score;			//점수
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
}
