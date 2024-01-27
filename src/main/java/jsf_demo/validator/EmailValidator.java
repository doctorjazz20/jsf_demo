package jsf_demo.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("email_validator")
public class EmailValidator implements Validator{
	
	private static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
	
	private boolean verifyEmail(String email) {
		
		Pattern pattern = Pattern.compile(VALID_EMAIL_ADDRESS_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		System.out.println("validating email");
		System.out.println("obtained value="+value.toString());
		
		String email = value.toString();
		if(!email.equalsIgnoreCase("") && !verifyEmail(email)) {
			throw new ValidatorException(new FacesMessage("email is in the wrong format"));
		}
		
	}

}
