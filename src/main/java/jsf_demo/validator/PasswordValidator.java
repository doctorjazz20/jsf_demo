package jsf_demo.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("password_validator")
public class PasswordValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		System.out.println("validating password");
		System.out.println("obtained value="+value.toString());
		String password = value.toString();
		
		UIInput uiInputConfirmPassword = (UIInput) component.getAttributes().get("confirmPasw");
		String confirmPsw = uiInputConfirmPassword.getSubmittedValue().toString();
		
	    if (password == null || password.isEmpty() || confirmPsw == null|| confirmPsw.isEmpty()) {
	    	  
	    	  System.out.println("Let required=\"true\" do its job.");
	    	  return;
	    	  
	    }
	    
	    if(!password.equalsIgnoreCase(confirmPsw)) {
	    	
	    	uiInputConfirmPassword.setValid(false);
	    	throw new ValidatorException(new FacesMessage("Password must match confirm password."));
	    	
	    }
		
	}

}
