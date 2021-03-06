package ru.spbstu.icc.kspt.architecture.shalyapin.domain;

/**
 * @author Nikita Shalyapin
 * 
 *         The class represents an anonymous user, who is able to subscribe to
 *         market data.
 */
public abstract class Anonymous extends User implements IMarketDataConsumer {

	/**
	 * Create anonymous user.
	 */
	public Anonymous() {
		super((long) 0, "Anonymous", null, null, User.Access.ANONYMOUS);
	}

}
