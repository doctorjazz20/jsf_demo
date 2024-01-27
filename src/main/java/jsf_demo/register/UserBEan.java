package jsf_demo.register;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;  

@ManagedBean(name="user")
@SessionScoped
public class UserBEan {
	
	@Size(min=2, max=10)
	private String username;
	
	@Size(min=2, max=10)
	private String password;
	
	@NotNull(message = "Name can't be empty") 
	@NotBlank(message = "Name can't be empty")
	private String email;
	
	public UserBEan() {
		System.out.println("User created!");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
