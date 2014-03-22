package util;

import java.util.ArrayList;
import java.util.List;

public class UserAnswers {

	private long userid = 0L;
	
	private List<Long> qindex = null;
	
	private List<Long> aindex = null;

	public UserAnswers(long userid, List<Long> qindex, List<Long> aindex) 
	{
		this.userid = userid;
		this.qindex = qindex;
		this.aindex = aindex;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public List<Long> getQindex() {
		return qindex;
	}

	public void setQindex(ArrayList<Long> qindex) {
		this.qindex = qindex;
	}

	public List<Long> getAindex() {
		return aindex;
	}

	public void setAindex(ArrayList<Long> aindex) {
		this.aindex = aindex;
	}

}
