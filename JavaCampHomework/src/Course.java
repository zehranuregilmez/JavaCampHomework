
public class Course {
	public Course() {
	System.out.println("Kursa kat�ld�m");
	}

	
	public Course(int id, String name ,String detail) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		
	}
    
	int id;
	String name;
	String detail;
	
}
