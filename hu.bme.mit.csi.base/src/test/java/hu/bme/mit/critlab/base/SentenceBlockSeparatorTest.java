package hu.bme.mit.critlab.base;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class SentenceBlockSeparatorTest extends TestBase {
	
	@Test
	public void fullStopSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"a1 b1 c1. d1", // a->1, ab->1, bc->1, c->1, d->1
				"a1 b1 c1 d1", // a->1, ab->1, bc->1, cd->1, d->1
				2, true);
	}
	@Test
	public void semicolonSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"a1 b1 c1; d1", // a->1, ab->1, bc->1, c->1, d->1
				"a1 b1 c1 d1", // a->1, ab->1, bc->1, cd->1, d->1
				2, true);
	}
	@Test
	public void exclamationSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"a1 b1 c1! d1", // a->1, ab->1, bc->1, c->1, d->1
				"a1 b1 c1 d1", // a->1, ab->1, bc->1, cd->1, d->1
				2, true);
	}
	@Test
	public void questionSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"a1 b1 c1? d1", // a->1, ab->1, bc->1, c->1, d->1
				"a1 b1 c1 d1", // a->1, ab->1, bc->1, cd->1, d->1
				2, true);
	}
	@Test
	public void commaSeparatesNot() throws ExecutionException {
		doSimpleTest(1.0, 
				"a1 b1 c1,d1", 
				"a1 b1 c1 d1", 
				2, true);
	}
	@Test
	public void colonSeparatesNot() throws ExecutionException {
		doSimpleTest(1.0, 
				"a1 b1 c1:d1", 
				"a1 b1 c1 d1", 
				2, true);
	}
	@Test
	public void dashSeparatesNot() throws ExecutionException {
		doSimpleTest(1.0, 
				"a1 b1 c1-d1", 
				"a1 b1 c1 d1", 
				2, true);
	}
	@Test
	public void parenthesisSeparatesNot() throws ExecutionException {
		doSimpleTest(1.0, 
				"a1 b1 c1(d1", 
				"a1 b1 c1 d1", 
				2, true);
	}

}
