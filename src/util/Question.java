package util;

public class Question {
	
	private long questionindex = 0L;
	
	private String question = null;

	public Question(long qi, String q)
	{
		this.question = q;
		this.questionindex = qi;
	}
	
	public long getQuestionindex() 
	{
		return questionindex;
	}

	public void setQuestionindex(long questionindex)
	{
		this.questionindex = questionindex;
	}

	public String getQuestion() 
	{
		return question;
	}

	public void setQuestion(String question) 
	{
		this.question = question;
	}

}
