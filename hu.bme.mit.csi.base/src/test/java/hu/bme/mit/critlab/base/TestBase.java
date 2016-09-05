package hu.bme.mit.critlab.base;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Assert;

import hu.bme.mit.critlab.base.DocumentSimilarityEstimator;

public class TestBase {
	
	private static final double TOLERANCE_EPSILON = 1.0E-5;

	protected DocumentSimilarityEstimator getEstimator() {
		// TODO instantiate your solution here
		throw new UnsupportedOperationException("instantiate your solution here");
	}
	
	protected void assertWithTolerance(double expected, double actual) {
		//System.out.println("expected = " + expected);
		//System.out.println("actual = " + actual);
		Assert.assertEquals(expected, actual, TOLERANCE_EPSILON);
	}
	
	protected void doSimpleTest(double expected, String document1, String document2, int shingleSize, boolean wordGranularity) throws ExecutionException {
		Future<Double> futureResult = getEstimator().cosineSimilarity(document1, document2, shingleSize, wordGranularity);
		Double result;
		try {
			result = futureResult.get();
		} catch (InterruptedException e) {
			result = null;
		}
		assertWithTolerance(expected, result);
	}
}
