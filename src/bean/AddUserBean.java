package bean;

import org.apache.struts.action.ActionForm;

public class AddUserBean extends ActionForm {

	private static final long serialVersionUID = 1L;

	private long id = 0L;
	
	private String name = "";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
