package jsf_demo.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import jsf_demo.basic.COnvertBean;

@FacesConverter("jsf_demo.converter.MessageCOnverter")
public class MessageCOnverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value==null) {
			value = "";
		}
		
		String formattedValue = value+"NEWMESSAGE";
		//return new COnvertBean(formattedValue);
		return formattedValue;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
