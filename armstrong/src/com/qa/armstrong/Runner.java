package com.qa.armstrong;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		System.out.println(armstrong(1000000));
	}
	
	public static List<Integer> armstrong(int maxNum){
		
		List<Integer> outList = new ArrayList<Integer>();
		for (int i = 0 ; i <= maxNum ; i++) {
			int outNum = 0;
			int tempNum = i;
			while (tempNum > 0) {
				outNum += Math.pow((tempNum%10),String.valueOf(i).length());
				tempNum = tempNum/10;
			}
			if (outNum == i) {
				outList.add(i);
			}			
		}
		return outList;
	}
}
