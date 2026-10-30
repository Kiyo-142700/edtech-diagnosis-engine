package v0;

public class Concept {
	private String conceptId, title;
	
	public Concept() {
		this.conceptId = new String();
		this.title = new String();
	}
	
	public Concept(String conceptId, String title) {
		this.conceptId = new String(conceptId);
		this.title = new String(title);
	}
	
	public Concept(Concept t) {
		this.conceptId = new String(t.conceptId);
		this.title = new String(t.title);
	}
	
	public String getConceptId() {
		return this.conceptId;
	}
	
	public String getTitle() {
		return this.title;
	}
	
}
