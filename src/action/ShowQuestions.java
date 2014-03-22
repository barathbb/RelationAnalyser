package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import util.Answer;
import util.Question;
import util.QuestionAnswers;

public class ShowQuestions extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Connection con = (Connection)request.getSession().getAttribute("Con");
	
		PreparedStatement pt1,pt2;
		
		pt1 = con.prepareStatement("select * from Questions");
		
		pt2 = con.prepareStatement("select * from Answers");
		
		List<QuestionAnswers> qa = null;
		
		List<Question> q = new ArrayList<Question>();
		
		List<Answer> a = new ArrayList<Answer>();
		
		ResultSet rs1,rs2;
		
		rs1 = pt1.executeQuery();
		
		rs2 = pt2.executeQuery();
		
		while(rs1.next())
		{
			q.add(new Question(rs1.getLong("QuestionIndex"),rs1.getString("Question")));
		}
		
		while(rs2.next())
		{
			a.add(new Answer(rs2.getLong("QuestionIndex"),rs2.getLong("AnswerIndex"),rs2.getString("Answer")));
		}
		
		
		
	return null;
	
	}
	
	private List<QuestionAnswers> getQuestionAnswers(List<Question> q, List<Answer> a)
	{
		List<QuestionAnswers> qa = new ArrayList<QuestionAnswers>();
		
		QuestionAnswers qatemp = null;	Question qtemp=null; Answer atemp = null; List<String> answerlist = null;
		
		Iterator<Question> qi = q.listIterator();
		
		Iterator<Answer> ai = null;
		
		while(qi.hasNext())
		{
			qtemp = qi.next();
			
			qatemp = new QuestionAnswers();
			
			qatemp.setQuestion(qtemp.getQuestion());
			
			answerlist = new ArrayList<String>();
			
			ai = a.listIterator();
			
			while(ai.hasNext())
			{
				atemp = ai.next();
				
				if(atemp.getQuestionindex() == qtemp.getQuestionindex())
					answerlist.add(new String(atemp.getAnswer()));
			}
			
			qatemp.setAnswers(answerlist);
			
			qa.add(qatemp);
		}
		
		return qa;
		
	}
	

}
