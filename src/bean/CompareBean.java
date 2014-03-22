package bean;

import org.apache.struts.action.ActionForm;

public class CompareBean extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	private long userid = 0L;

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
