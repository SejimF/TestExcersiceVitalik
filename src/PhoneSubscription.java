/**
 * Abstract superclass for subscriptions to phone services.
 *
 * @author 
 */
public abstract class PhoneSubscription extends Subscription {

    // TO DO
	
	private int minutes;
	
	
	PhoneSubscription(String subscriber, String phoneNumber, int StandartCharge){
		super(subscriber, phoneNumber, StandartCharge);
	}
	
	public void makeCall(int minutes){
		this.minutes = minutes;
	}
	
	
	public int getCall(){
		return minutes;
	}

}
