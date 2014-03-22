package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

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
		
		QuestionAnswers[] qa = new QuestionAnswers[10];
		
		ResultSet rs1,rs2;
		
		rs1 = pt1.executeQuery();
		
		rs2 = pt2.executeQuery();
		
		
		
		
				
		
	return null;
	
	}

}
