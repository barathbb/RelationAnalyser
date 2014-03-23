package action;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import util.SessionedUser;

import bean.AddUserBean;

public class AddUser extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		try {
		
//		AddUserBean adb = (AddUserBean) form;
		
//		Connection con = (Connection) request.getSession().getAttribute("Con");
//		
//		PreparedStatement pt1 = con.prepareStatement("select * from users where userid = ?");
//		pt1.setLong(1, adb.getId());
//		
//		ResultSet rs = pt1.executeQuery();
//		
//		if(!rs.last())
//		{
//			pt1 = con.prepareStatement(" insert into users values (? , ? )");
//			pt1.setLong(1, adb.getId());
//			pt1.setString(2, adb.getName());
//			
//			pt1.executeUpdate();
//		}

//		request.getSession().setAttribute("User", new SessionedUser(adb.getId() , adb.getName()));
		
		return mapping.findForward("success");
		
		}
		
		catch(Exception e)
		{
			PrintWriter out = response.getWriter();
			
			out.write(e.getMessage());
			
			return null;
		}
	}

}
