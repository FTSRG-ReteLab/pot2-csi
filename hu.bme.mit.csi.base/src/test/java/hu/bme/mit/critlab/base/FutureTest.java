package hu.bme.mit.critlab.base;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;

import hu.bme.mit.critlab.base.DocumentSimilarityEstimator;

public class FutureTest {
	static final String
		HerbertJordan =
			"Tell how he wandered, Muse, time and again\r\n" + 
			"confounded, after he sacked Troy's citadel,\r\n" + 
			"how many towns he saw and learned their ways,\r\n" + 
			"how many trials the man endured at sea\r\n" + 
			"to save his comrades' lives, return them home.\r\n" + 
			"Hard though he tried, he failed to save those men\r\n" + 
			"whose recklessness secured their own demise.\r\n" + 
			"Like fools they ate the sun god Helios' cows,\r\n" + 
			"and he made certain they would not survive.\r\n" + 
			"choose where to start your story, Zeus's daughter.",
		NorbertAlbertson = 
			"Muse, tell of the wily-minded man\r\n" + 
			"Who wandered far after he sacked and burned\r\n" + 
			"The holy towers of Troy; he saw many men’s cities,\r\n" + 
			"And learned their minds, and his spirit suffered much\r\n" + 
			"Out on the sea, striving to keep his own life\r\n" + 
			"And bring his comrades home. But he did not save them,\r\n" + 
			"For the fools died by their own wicked deed\r\n" + 
			"When they killed and ate the cattle of Hyperion Helios,\r\n" + 
			"Who took their homecoming away; but he endured.\r\n" + 
			"Begin where you will, Muse, and tell his story.",
		StephenMitchell =
			"Sing to me, Muse, of that endlessly cunning man\r\n" + 
			"who was blown off course to the ends of the earth, in the years\r\n" + 
			"after he plundered Troy. He passed through the cities\r\n" + 
			"of many people and learned how they thought, and he suffered\r\n" + 
			"many bitter hardships upon the high seas\r\n" + 
			"as he tried to save his own life and bring his companions\r\n" + 
			"back to their home. But however bravely he struggled,\r\n" + 
			"he could not rescue them, fools that they were—their own\r\n" + 
			"recklessness brought disaster upon them all;\r\n" + 
			"they slaughtered and ate the cattle of Hélios,\r\n" + 
			"so the sun god destroyed them and blotted out their homecoming.\r\n" + 
			"Goddess, daughter of Zeus, begin now, wherever\r\n" + 
			"you wish to, and tell the story again, for us.";
		static final String[] texts = new String[]{ HerbertJordan, NorbertAlbertson, StephenMitchell };
		
		DocumentSimilarityEstimator estimator = (new TestBase()).getEstimator();
		
		@Test
		public void multipleCallTest() throws InterruptedException, ExecutionException {
			
			List<Future<Double>> futures = new LinkedList<>();
			
			for (int i = 0; i < 1; i++) {
				for (String text1 : texts) {
					for (String text2 : texts) {
						for(int size = 1; size<=3; size++) {
							futures.add(estimator.cosineSimilarity(text1, text2, size, true));
							futures.add(estimator.cosineSimilarity(text1, text2, size, false));
						}
					}
				}
			}
			System.out.println(" > -------------------");
			for (Future<Double> future : futures) {
				System.out.println("> " + future.get());
			}
		}
}
