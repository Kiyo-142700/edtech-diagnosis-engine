package v0;

public class Question {
	private String questionId, content, correctAnswer;
	Concept concept;
	
	public Question() {
		this.questionId = new String();
		this.content = new String();
		this.correctAnswer = new String();
		this.concept = new Concept();
	}
	
	public Question(String questionId, String content, String correctAnswer, Concept t) {
		this.questionId = new String(questionId);
		this.content = new String(content);
		this.correctAnswer = new String(correctAnswer);
		this.concept = new Concept(t);
	}
	
	public Question(Question t) {
		this.questionId = new String(t.questionId);
		this.content = new String(t.content);
		this.correctAnswer = new String(t.correctAnswer);
		this.concept = new Concept(t.concept);
	}
	
	public boolean checkAnswer(String answer) {
		if(answer.trim().isEmpty()) {
			return false;
		}
		return this.correctAnswer.equalsIgnoreCase(answer.trim());
		
	}
	
}
