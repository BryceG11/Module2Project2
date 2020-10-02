package com.company;

import java.util.Arrays;

public class Main {

	static int findElement(int Find[], int n, int key)
	{
		for (int i = 0; i < n; i++)
			if (Find[i] == key)
				return i;
			return -1;
	}

	public static void main(String[] args) {
	    int orderStats[] = {4,7,2,1};
	    int N = 2;
	    System.out.println(orderStats[N-1]);
	    int rangeQs[] = {7,9,2,5,11,10};
	    int start = 2;
	    int end = 6;
	    int sorting[] = new int[]{1,5,3,6,8,64,3,6};
	    Arrays.sort(sorting);
	    System.out.printf(Arrays.toString(sorting));
		int Find[] = {12,16,9,5,3};
		int n = Find.length;
		int key = 5;
		int position = findElement(Find, n, key);
		if (position == - 1)
			System.out.println("Element not found");
		else
			System.out.println(position + 1);
	}
}
