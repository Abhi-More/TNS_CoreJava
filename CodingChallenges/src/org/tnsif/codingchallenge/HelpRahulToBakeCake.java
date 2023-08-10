package org.tnsif.codingchallenge;

import java.util.Arrays;

/*
Rahul decided to bake the Napoleon cake. He baked n dry layers first, and then put them on each other in one stack(see image), adding some cream. Rahul started with an empty plate, and performed the following steps n times:

place a new dry layer of cake on the top of the stack;
after the i-th layer is placed, pour ai units of cream on top of the stack.
When x units of cream are poured on the top of the stack, the top x layers of the cake get wet in the cream. If there are fewer than x layers, all layers get wet. If x=0, no layer gets wet.

Top 50 Array Coding Questions for Online Assessment
The picture represents the example test case.
Help Rahul determine which layers of the cake eventually get wet when the process is over, and which don’t.

Input: Each test case contains n integers arr[0], arr[1], … arr[n-1] — where arr[i] is the amount of cream poured on the cake after adding ith layer.

Output: Print array of n integers. The i-th of the integers should be equal to 1 if the i-th layer is wet, and 0 otherwise. Let’s see an example.

Example Test Case:

Input: n = 6 arr[6] = 0 3 0 0 1 3

Ouput: 1 1 0 1 1 1
 * */
public class HelpRahulToBakeCake {
	
	static void helpRahul(int[] arr, int n)
	{
	    int[] ans = new int[n];
	    
	    for(int i = 0; i < n; i++)
	    { 
	    	int j = arr[i];
	    	int ptr = i;
	    	while(ptr >= 0 && j > 0)
	    	{
	    		ans[ptr--] = 1;
	    		j--;
	    	}
	    }
	    for(int a: ans)
	    {
	    	System.out.print(a + " ");
	    }
	}

	public static void main(String[] args)
	{
		helpRahul(new int[]{0, 3, 0, 0, 1, 3}, 6);
	}
}
