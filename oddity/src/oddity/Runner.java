package oddity;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		oddity({58, 19, 3, 42});
	}
	
	static List<Integer> oddity(int[] nums){
		List<Integer> newList = new List<Integer>();
		for (int i : nums) {
			if (i % 2 == 1) {
				newList.add(i);
			}
		} return newList;
	}
}
