
/**
 * A subscription to a newspaper or a magazine. 
 * 
 * @author 
 */
public class NewspaperSubscription extends Subscription implements HasAddress, BoundedCharge
{

	


    // TO DO

    /**
     * Constructs a new NewspaperSubscription based on the parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param newspaper the name of the newspaper (and hence the subscription);
     *  must not be null
     * @param standingChargeInPence the price of the newspaper per billing
     *  period; must not be less than 0
     * @param address the address to which the newspaper is delivered;
     *  must not be null
     */
	 
	 private String address;
	 private int standingChargeInPence;
	 
	 
    public NewspaperSubscription(String subscriber, String newspaper,
								 int standingChargeInPence, String address) {
									 
									 
				super(subscriber,newspaper,standingChargeInPence);
				this.address = address;
				this.standingChargeInPence = standingChargeInPence;
				
    }
	
	
	@Override
	public int computeTotalChargeInPence()
	{
		// TODO: Implement this method
		return standingChargeInPence;
	}

	@Override
	public int getMaxChargeInPence()
	{
		// TODO: Implement this method
		return standingChargeInPence;
	}

	@Override
	public String getAddress()
	{
		// TODO: Implement this method
		return address;
	}
    // TO DO
}
