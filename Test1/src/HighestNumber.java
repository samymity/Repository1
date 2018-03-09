
import java.util.*;
public class HighestNumber {

	
	int max =0 ;
	
	int[] a = { 1, 2 , 3, 40 , 5 , 6, 7 ,101111, 8 , 17 ,33213, 42342, 89238, 77277, 66626, 23232};
      
   
	public int func1()
	
	{
	
	for (int counter = 1; counter < a.length-1; counter++)
	{
	     if (a[counter] > max)
	     {
	      max = a[counter];
	     }
	}

	return max;
	
	}
	
	
	
	
	public int func2(int array[]){
		  List<Integer> list = new ArrayList<Integer>();
		  for (int i = 0; i < array.length; i++) {
		    list.add(array[i]);
		  }
		 return Collections.max(list);
		 
	}
	
	public static void main(String[] args) {
		
		int[] a = { 1, 2 , 3, 40 , 5 , 6, 7 ,101111, 8 , 17 ,33213, 42342, 89238, 77277, 66626, 23232};
	      
		HighestNumber obj1 = new HighestNumber();
		int max = obj1.func1();
		int max2 = obj1.func2(a);
		
		// TODO Auto-generated method stub

		System.out.println("The highest maximum for the December is: " +  obj1.func1());
		System.out.println("The highest maximum for the December is: " +  max2);
	}

}
