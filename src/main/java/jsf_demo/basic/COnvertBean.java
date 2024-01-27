package jsf_demo.basic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="ex_convert")
@RequestScoped  
public class COnvertBean {
	
	private String message;
	
	private Integer number;
	
	public COnvertBean() {
		super();
	}
	
	public COnvertBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String submit() {
		return "convert.xhtml";
	}

}
