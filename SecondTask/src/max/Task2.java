package max;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
	
	public static void printSumPairs(int []input, int k) {
		
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

	    for(int i = 0; i < input.length; i++){

	        if(pairs.containsKey(input[i])) {
	            System.out.println("[" + pairs.get(input[i]) + ", " + input[i] + "]");
	        }
	        else {
	            pairs.put(k-input[i], input[i]);
	        }
	    }

	}

	public static void main(String[] args) {
		 int[] i = {3, 4, 2, 7};
		 
		 Task2.printSumPairs(i, 10);

	}

}
