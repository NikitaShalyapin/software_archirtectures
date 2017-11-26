/**
 * 
 */
package ru.spbstu.icc.kspt.architecture.shalyapin.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import ru.spbstu.icc.kspt.architecture.shalyapin.domain.Market;
import ru.spbstu.icc.kspt.architecture.shalyapin.domain.Order;
import ru.spbstu.icc.kspt.architecture.shalyapin.service.MarketService;

/**
 * @author Nikita Shalyapin
 *
 *         Test order storage
 */
public class OrderStorageTest {
	/**
	 * API for managing market.
	 */
	private MarketService API;

	/**
	 * Constructor
	 */
	public OrderStorageTest() {
		this.API = new MarketService(new Market());
	}

	/**
	 * Test method for
	 * {@link ru.spbstu.icc.kspt.architecture.shalyapin.infrastructure.OrderStorage#create(ru.spbstu.icc.kspt.architecture.shalyapin.domain.Order)}
	 * .
	 */
	@Test
	public void testCreate() {
		Order order = API.getTradeService().newOrder(100l, 200l, Order.Direction.ASK, 1l, 1l);
		if (order == null) {
			fail("Create order case failed!");
		}
	}

	/**
	 * Test method for
	 * {@link ru.spbstu.icc.kspt.architecture.shalyapin.infrastructure.OrderStorage#delete(ru.spbstu.icc.kspt.architecture.shalyapin.domain.Order)}
	 * .
	 */
	@Test
	public void testDeleteOrder() {
		Order order = API.getTradeService().newOrder(101l, 201l, Order.Direction.ASK, 1l, 1l);
		if (API.getTradeService().cancelOrder(order) == false) {
			fail("Delete order case failed!");
		}
	}

}
