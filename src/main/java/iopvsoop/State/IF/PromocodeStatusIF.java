package iopvsoop.State.IF;

/**
 * 
 * @author Stefano
 *
 */
public class PromocodeStatusIF {

	public void apply(String promocode)
    {
        throw new ExpiredPromocodeException("Expired");
    }
}
