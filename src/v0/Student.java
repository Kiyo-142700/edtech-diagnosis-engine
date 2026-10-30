package v0;

public class Student {
	private String id, name;
	
	public Student() {
		this.id = new String();
		this.name = new String();
	}
	
	public Student(String id, String name) {
		this.id = new String(id);
		this.name = new String(name);
	}
	
	public Student(Student t) {
		this.id = new String(t.id);
		this.name = new String(t.name);
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
}
