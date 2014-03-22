package action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import util.FindRelation;

import bean.CompareBean;

public class Compare extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

	CompareBean cb = (CompareBean) form;
	
	long userid1 = 0L;
	 
	long userid2 = cb.getUserid();
	
	Connection con = (Connection) request.getSession().getAttribute("Con");
	
	int result = FindRelation.findRelation(userid1, userid2, request.getSession());
	
	return mapping.findForward("success");
	
	}

}
