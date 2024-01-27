package jsf_demo.basic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * esempio bean annidati
 * @author gnustrike
 *
 */

@ManagedBean(name="person", eager = true)
@RequestScoped
public class Person{
	
	private String name = "MArio";
	
	private String surname = "Rossi";
	
	private int age = 34;
	
	public Person() {
		System.out.println("Person created!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}