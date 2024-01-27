package jsf_demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ex_session")
@SessionScoped
public class ExSessionBean {
	
	private String message = "welcome to jsf app!!";

	public ExSessionBean() {
		System.out.println("ExSessionBean created!");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
