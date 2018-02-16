package za.co.hellogroup;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class CustomMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		System.out.println("CUSTOM MEDIATOR");
		return true;
	}
}