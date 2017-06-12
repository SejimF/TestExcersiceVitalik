

/**
 * Represents a phone subscription for landline telephones at a certain
 * address.
 *
 * @author 
 */
public class LandlineSubscription extends PhoneSubscription implements HasAddress
{


	

    // TO DO

    /**
     * Constructs a new LandlineSubscription according to the parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     * @param address the address; must not be null
     */
	 	private String address;
		private int minutes;
		private static int STANDART_CHARGE = 1800;
		private static int MINUTES_COST = 2;
	 
	 
    public LandlineSubscription(String subscriber, String phoneNumber, String address) {
        // TO DO
		
		
		super(subscriber,"Landline telephone: " + phoneNumber,STANDART_CHARGE);
		
		this.address = address;
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
		return minutes;
	}
	
	
	
	
	@Override
	public int computeTotalChargeInPence()
	{
		// TODO: Implement this method
		return getCall() * MINUTES_COST + STANDART_CHARGE;
	}

	@Override
	public String getAddress()
	{
		// TODO: Implement this method
		return address;
	}
	
	@Override
	public void resetConsumption() {
        // nothing to do here; but subclasses may need to override this
		
		this.minutes = 0;
    }
    // TO DO
}
