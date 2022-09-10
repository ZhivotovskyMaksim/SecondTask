package max;

public class Task3 {
	
	private static boolean fuzzysearch(String targets, String sets) {
		char[] set = sets.toLowerCase().toCharArray();
		char[] target = targets.toLowerCase().toCharArray();
	        int i = 0;
	        if (target.length <= set.length) {
	            for (int j = 0; i < target.length;) {
	                if(target[i] < set[j]) {
	                    break;   
	                } else {
	                    i += (target[i] == set[j++]) ? 1 : 0;
	                }
	            }
	        }
	        return i < target.length ? false : true;
	}


    /*
    Task3
        Реализовать функцию нечеткого поиска
        
                fuzzySearch("car", "ca6$$#_rtwheel"); // true
                fuzzySearch("cwhl", "cartwheel"); // true
                fuzzySearch("cwhee", "cartwheel"); // true
                fuzzySearch("cartwheel", "cartwheel"); // true
                fuzzySearch("cwheeel", "cartwheel"); // false
                fuzzySearch("lw", "cartwheel"); // false
     */
	
	public static void main(String[] args) {

        System.out.println(Task3.fuzzysearch("car", "ca6$$#_rtwheel"));
        System.out.println(Task3.fuzzysearch("cwhl", "cartwheel"));
        System.out.println(Task3.fuzzysearch("cwhee", "cartwheel"));
        System.out.println(Task3.fuzzysearch("cartwheel", "cartwheel"));
        System.out.println(Task3.fuzzysearch("cwheeel", "cartwheel"));
        System.out.println(Task3.fuzzysearch("lw", "cartwheel"));

	}
}
