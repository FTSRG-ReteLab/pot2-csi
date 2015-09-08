package hu.bme.mit.critlab.base;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class WordTokenSeparatorTest extends TestBase {
	public static final double splittedToTwoSentence = 2.0 / Math.sqrt(2.0*3.0);
	
	@Test
	public void numberSeparatesNot() throws ExecutionException {
		doSimpleTest(0.0, 
				"abc d", 
				"abc9d", 
				2, true);
	}
	@Test
	public void capitalLetterSeparatesNot() throws ExecutionException {
		doSimpleTest(0.0, 
				"abc d", 
				"abcEd", 
				2, true);
	}
	@Test
	public void spaceSeparates() throws ExecutionException {
		doSimpleTest(0.0, 
				"abc d", 
				"abcd", 
				2, true);
	}
	@Test
	public void fullStopSeparates() throws ExecutionException {
		doSimpleTest(splittedToTwoSentence, 
				"abc.d", 
				"abc d", 
				2, true);
	}
	@Test
	public void semicolonSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"abc;d", 
				"abc d", 
				2, true);
	}
	@Test
	public void exclamationSeparates() throws ExecutionException {
		doSimpleTest(splittedToTwoSentence, 
				"abc!d", 
				"abc d", 
				2, true);
	}
	@Test
	public void questionSeparates() throws ExecutionException {
		doSimpleTest(splittedToTwoSentence, 
				"abc?d", 
				"abc d", 
				2, true);
	}
	@Test
	public void commaSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"abc,d", 
				"abc d", 
				2, true);
	}
	@Test
	public void colonSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"abc:d", 
				"abc d", 
				2, true);
	}
	@Test
	public void dashSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"abc-d", 
				"abc d", 
				2, true);
	}
	@Test
	public void parenthesisSeparates() throws ExecutionException {
		doSimpleTest(1.0, 
				"abc(d", 
				"abc d", 
				2, true);
	}
}
