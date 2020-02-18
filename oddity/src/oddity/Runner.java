package oddity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println(oddity(new int[]{58, 19, 7, 8, 3, 42}));
	}
	
	public static List<Integer> oddity(int[] nums){
		List<Integer> newList = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 == 1) {
				newList.add(i);
			}
		} return newList;
	}
	
	public static List<Integer>oddityStream(int[] nums){
		return Arrays.stream(nums).boxed()
				.filter(num -> num % 2 == 1)
				.collect(Collectors.toList());
	}
}
