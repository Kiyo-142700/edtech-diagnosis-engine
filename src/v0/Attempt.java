package v0;

public class Attempt {
	private Student student;
	private Question question;
	private String studentAnswer;
	private boolean isCorrect;
	
	public Attempt() {
		this.student = new Student();
		this.question = new Question();
		this.studentAnswer = new String();
		this.isCorrect = question.checkAnswer(studentAnswer);
	}
	
	public Attempt(Student student, Question question, String studentAnswer, boolean isCorrect) {
		this.student = new Student(student);
		this.question = new Question(question);
		this.studentAnswer = new String(studentAnswer);
		this.isCorrect = question.checkAnswer(studentAnswer);
	}
	
	public Attempt(Attempt t) {
		this.student = new Student(t.student);
		this.question = new Question(t.question);
		this.studentAnswer = new String(t.studentAnswer);
		this.isCorrect = question.checkAnswer(t.studentAnswer);
	}
	
	
	
	
	
}
