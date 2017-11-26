package ru.spbstu.icc.kspt.architecture.shalyapin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.spbstu.icc.kspt.architecture.shalyapin.domain.Instrument;
import ru.spbstu.icc.kspt.architecture.shalyapin.domain.Market;
import ru.spbstu.icc.kspt.architecture.shalyapin.service.MarketService;

/**
 * @author Nikita Shalyapin
 *
 *         Test instrument storage
 */
public class InstrumentStorageTest {
	/**
	 * API for managing market.
	 */
	private MarketService API;

	/**
	 * Constructor
	 */
	public InstrumentStorageTest() {
		this.API = new MarketService(new Market());
	}

	/**
	 * Test method for
	 * {@link ru.spbstu.icc.kspt.architecture.shalyapin.infrastructure.InstrumentStorage#create(ru.spbstu.icc.kspt.architecture.shalyapin.domain.Instrument)}
	 * .
	 */
	@Test
	public void testCreate() {
		Instrument instrument = API.getInstrumentService().newInstrument("AABB");
		if (instrument == null) {
			fail("Create instrument case failed!");
		}
	}

	/**
	 * Test method for
	 * {@link ru.spbstu.icc.kspt.architecture.shalyapin.infrastructure.InstrumentStorage#delete(ru.spbstu.icc.kspt.architecture.shalyapin.domain.Instrument)}
	 * .
	 */
	@Test
	public void testDeleteInstrument() {
		Instrument instrument = API.getInstrumentService().newInstrument("BBAA");
		if (API.getInstrumentService().deleteInstrument(instrument) == false) {
			fail("Delete instrument case failed!");
		}
	}

}
