package hu.bme.mit.critlab.base;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class WordBlockSeparatorTest extends TestBase {
	@Test
	public void spaceSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void fullStopSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc.d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void semicolonSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc;d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void exclamationSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc!d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void questionSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc?d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void commaSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc,d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void colonSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc:d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void dashSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc-d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
	@Test
	public void parenthesisSeparates() throws ExecutionException {
		doSimpleTest(4.0 / 5.0, 
				"abc(d", // a->1, ab->1, bc->1, c->1, d->1
				"abcd", // a->1, ab->1, bc->1, cd->1, d->1
				2, false);
	}
}
