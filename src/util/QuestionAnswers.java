package util;

import java.util.List;

public class QuestionAnswers {

	private String question = null;
	
	private List<String> answers = null;
	
	public void setQuestion(String q)
	{
		this.question = q;
	}
	
	public String getQuestion()
	{
		return this.question;
	}

	public List<String> getAnswers() 
	{
		return answers;
	}

	public void setAnswers(List<String> answers) 
	{
		this.answers = answers;
	}
	
	
}
