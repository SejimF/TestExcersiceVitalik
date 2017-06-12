
import javax.sql.*;
/**
 * Mobile phone subscription with high standing charge, but low
 * costs for used services. Additionally has a "cost airbag", an
 * upper bound for the charges that can be incurred in a single
 * billing period: only a bounded number of call minutes and of
 * text messages are charged, everything beyond that is free.
 *
 * @author 
 */
public class PowerUserMobileSubscription extends MobileSubscription implements BoundedCharge
{

	


    // TO DO

    /**
     * Constructs a new PowerUserMobileSubscription according to the
     * given parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param phoneNumber the phone number used for this subscription;
     *  must not be null
     */
	 
	 private int minutes; // How much minuts havw been called;
	 private int messages; //How much messages have been sent;
	 private static int MINUTES_COST_UNDER_B_PERIOD = 10;   	//How much cost minuts under the limit;
	 private static int MESSAGE_COST_UNDER_B_PERIOD = 8;		//How much messages coat under the limit;
	 private static int MAXIMUM_MINUTES_FOR_CHARGE = 1800;		//Maximum minuts for charge;
	 private static int MAXIMUM_MESSAGES_FOR_CHARGE = 900;		//Maximum messages for charge;
	 private static int STANDARD_CHARGE = 4000;					//Standart charge;
	private static String SUBSCRIPTION_NAME = "Power User Mobile: ";  //Subscription Name;
	 
    public PowerUserMobileSubscription(String subscriber, String phoneNumber) {
        // TO DO
		
		super(subscriber,SUBSCRIPTION_NAME + phoneNumber, STANDARD_CHARGE);
    }

	@Override
	public void makeCall(int minutes)
	{
		// TODO: Implement this method          
		this.minutes += minutes;
		
	}

	@Override
	public int getCall()
	{
		// TODO: Implement this method
		return this.minutes;
	}

	@Override
	public void sendTextMessages(int messages)
	{
		// TODO: Implement this method
		this.messages += messages;
	}

	@Override
	public int getTextMessages()
	{
		// TODO: Implement this method
		return this.messages;
	}
	
	
	
	
	
	
	
	
	@Override
	public int computeTotalChargeInPence()
	{
		// TODO: Implement this method
		int result_minutes;
		int result_messages;
		
		if(getCall() >= 1800){
			result_minutes = MAXIMUM_MINUTES_FOR_CHARGE;
		}else result_minutes = getCall();
		
		if(getTextMessages() >= 900){
			result_messages = MAXIMUM_MESSAGES_FOR_CHARGE;
		}else result_messages = getTextMessages();
		return (result_minutes * MINUTES_COST_UNDER_B_PERIOD) + (result_messages * MESSAGE_COST_UNDER_B_PERIOD) + STANDARD_CHARGE;
	}

	@Override
	public int getMaxChargeInPence()
	{
		// TODO: Implement this method
		return MAXIMUM_MINUTES_FOR_CHARGE * MINUTES_COST_UNDER_B_PERIOD + MAXIMUM_MESSAGES_FOR_CHARGE * MESSAGE_COST_UNDER_B_PERIOD + STANDARD_CHARGE;
	}

	@Override
	public void resetConsumption()
	{
		// TODO: Implement this method
		this.minutes = 0;
		this.messages = 0;
		
	}
	
	
	

    // TO DO    
}
