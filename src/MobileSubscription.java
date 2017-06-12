/**
 * Abstract superclass to represent subscriptions for mobile phones.
 * 
 * @author 
 */
public abstract class MobileSubscription extends PhoneSubscription {
	
	private int messages;
	
    // TO DO

	public MobileSubscription(String subscriber, String phoneNumber, int Charge){
		super(subscriber,phoneNumber,Charge);
	}
	
	public void sendTextMessages(int messages){
		this.messages = messages;
	}
	
	public int getTextMessages(){
		
		return messages;
	}
	
}
