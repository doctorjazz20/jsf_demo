package jsf_demo.basic;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="personWrapper", eager = true)
@RequestScoped
public class SecondBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1853515899681512189L;
	
	@ManagedProperty(value = "#{person}")
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public SecondBean() {
		System.out.println("SecondBEan created!");
	}

}
