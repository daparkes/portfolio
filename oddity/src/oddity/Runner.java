package oddity;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println(oddity(new int[]{58, 19, 3, 42}));
	}
	
	public static ArrayList<Integer> oddity(int[] nums){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer i : nums) {
			if (i % 2 == 1) {
				newList.add(i);
			}
		} return newList;
	}
}
