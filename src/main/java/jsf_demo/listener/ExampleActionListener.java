package jsf_demo.listener;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ExampleActionListener implements ActionListener{

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		
		System.out.println("ACTION LISTENER FIRED!!!");
		System.out.println(event.getSource().getClass().getName());
		System.out.println(event.getPhaseId());
		
	}

}
