

/**
 * Mobile phone subscription with zero standing charge, but high
 * costs for used services.
 *
 * @author 
 */
public class PayWhatYouUseMobileSubscription extends MobileSubscription
{

	

    // TO DO

    /**
     * Constructs a new PayWhatYouUseMobileSubscription according to the
     * parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     */
	 	private static int RESULT;
		private static int MINUTE_PRICE = 40;
		private static int MESSAGE_PRICE = 20;
		private int minutes;
		private int messages;
	private static String SUBSCRIPTION_NAME = "Pay what you use mobile phone: ";
	 
    public PayWhatYouUseMobileSubscription(String subscriber, String phoneNumber) {
        // TO DO
		
		super(subscriber,SUBSCRIPTION_NAME + phoneNumber, RESULT);
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
		return (getCall() * MINUTE_PRICE) + (getTextMessages() * MESSAGE_PRICE);
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
