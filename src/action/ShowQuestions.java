package action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ShowQuestions extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Connection con = (Connection)request.getSession().getAttribute("Con");
	
		PreparedStatement pt1,pt2;
		
		pt1 = con.prepareStatement("select * from Questions");
		
		pt2 = con.prepareStatement("select * from Answers");
		
		
		
		
				
		
	return null;
	
	}

}
