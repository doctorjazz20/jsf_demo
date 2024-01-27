package jsf_demo.basic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="navigation")
@RequestScoped
public class NavigationBean {
	
	@ManagedProperty(value = "#{param.id}")
	private int pageId;
		
	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public NavigationBean() {
		System.out.println("NavigationBEan created!");
	}
	
	public String routeToMessage() {
		return "message.xhtml?faces-redirect=true";
	}
	
	public String routeToPerson() {
		return "person.xhtml?faces-redirect=true";
	}
	
	public String parameterRoute() {
		
		switch(pageId) {
			case 1:
				return "message.xhtml";
			case 2:
				return "person.xhtml";
			default: 
				return "navigation.xhtml";
		}
		
	}

}
