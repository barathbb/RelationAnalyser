package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		
		List<QuestionAnswers> qa = new ArrayList<QuestionAnswers>();
		
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
			a.add(new Answer());
		}
		
		
				
		
	return null;
	
	}

}
