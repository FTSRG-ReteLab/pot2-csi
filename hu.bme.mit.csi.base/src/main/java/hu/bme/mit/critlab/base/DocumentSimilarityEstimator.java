package hu.bme.mit.critlab.base;

import java.util.concurrent.Future;

/**
 * Computes the cosine similarity between two documents.
 * See https://github.com/FTSRG-CSI-2015/csi-lecture-notes/wiki/Running-Example
 * 
 * @param document1 the first document
 * @param document2 the second document
 * @param shingleSize the number of tokens per (inner) shingle
 * @param wordGranularity true if tokens are words, false if tokens are characters
 * @return a future computation of the similarity value
 */
public interface DocumentSimilarityEstimator {
	public Future<Double> cosineSimilarity(String document1, String document2, int shingleSize, boolean wordGranularity);
}
