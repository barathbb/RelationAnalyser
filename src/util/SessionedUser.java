package util;

public class SessionedUser {
	
	private long userid;
	
	private String name;

	public SessionedUser(long userid, String name) 
	{
		this.userid = userid;
		this.name = name;
	}

	public long getUserid() 
	{
		return userid;
	}

	public void setUserid(long userid) 
	{
		this.userid = userid;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	 
}
