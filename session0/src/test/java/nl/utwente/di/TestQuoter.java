package nl.utwente.di;

import org.junit.Assert;
import org.junit.Test;

/*** Tests the Quoter */
public class TestQuoter {
	@Test
	public void testBook1() throws Exception {
		Quoter quoter = new Quoter();
		double price1 = quoter.getBookPrice("1");
		double price3 = quoter.getBookPrice("3");
		Assert.assertEquals("Priceofbook1", 10.0, price1, quoter.getBookPrice("1"));
		Assert.assertEquals("Priceofbook3", 20.0, price3, quoter.getBookPrice("3"));
	}
}
