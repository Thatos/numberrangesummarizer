package numberrangesummarizer;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NumSummarizerTest {
	 @Test
	    public void testCollectedNumbers(){
	        NumSummarizer test = new NumSummarizer();
	        String numbers = "1,3,4,6,7,103,104,107,108,109,110,115,188,189,192,20";
	        Collection<Integer> result =test.collect(numbers);
	        assertEquals(Arrays.asList(1, 3, 4, 6, 7, 20, 103, 104, 107, 108, 109, 110, 115, 188, 189, 192),result);



	    }

	    private void assertEquals(List<Integer> asList, Collection<Integer> result) {
		// TODO Auto-generated method stub
		
	}

		@Test
	    public void testSummarizedCollection(){

	        NumSummarizer test = new NumSummarizer();
	        Collection<Integer> listCollected =  Arrays.asList(1,3,4,6,7,103,104,107,108,109,110,115,188,189,192,200);
	        String summarizedstr = test.summarizeCollection(listCollected);
	        System.out.println(summarizedstr);

	        assertEquals("1, 3 - 4, 6 - 7, 103 - 104, 107 - 110, 115, 188 - 189, 192, 200",summarizedstr);
	    }

		private void assertEquals(String string, String summarizedstr) {
			// TODO Auto-generated method stub
			
		}

}
