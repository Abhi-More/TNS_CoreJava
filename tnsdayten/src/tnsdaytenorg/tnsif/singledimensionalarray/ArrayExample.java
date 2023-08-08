package tnsdaytenorg.tnsif.singledimensionalarray;
import java.util.*;
public class ArrayExample {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
		
		for(int a: arr)
		{
			System.out.print(a + "  ");
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\nEnter Number of elements: ");
		
		int[] nums = new int[sc.nextInt()];
		
//		int n = sc.nextInt();
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println("Enter element at index " + i + " : ");
			nums[i] = sc.nextInt();
			
		}
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(i + " : " + nums[i]);
		}
		
		Arrays.sort(nums);
		
		
	}

}
