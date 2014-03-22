package util;

public class Answer {

	private long questionindex = 0L;
	
	private long answerindex = 0L;
	
	private String answer = null;

	public Answer(long questionindex, long answerindex, String answer) 
	{
		this.questionindex = questionindex;
		this.answerindex = answerindex;
		this.answer = answer;
	}

	public long getQuestionindex() 
	{
		return questionindex;
	}

	public void setQuestionindex(long questionindex) 
	{
		this.questionindex = questionindex;
	}

	public long getAnswerindex() 
	{
		return answerindex;
	}

	public void setAnswerindex(long answerindex) 
	{
		this.answerindex = answerindex;
	}

	public String getAnswer() 
	{
		return answer;
	}

	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}
	
	
	
}
