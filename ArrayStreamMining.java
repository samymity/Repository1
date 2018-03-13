import java.util.*;

public class ArrayStreamMining {
	
	
	
	
	//EmployeeC  obj2 = new EmployeeC() ;
	
	
	EmployeeC[]  EmployeeArray = new EmployeeC[10];
	
	String s = "sandeep" ;
	
	String s1[] = { "s" , "a" , "n" };
	
	String s2 = new String();
	String[] s3 = new String[3];
			
	
 
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 1 };
		
		
		// TODO Auto-generated method stub
		ArrayStreamMining  obj2 = new ArrayStreamMining();
	
	      
	   
	      System.out.println("highest" + " Output1 Int :" +  obj2. HighestNumber(input));
	      System.out.println("highest" + " Output1 Array :" +  obj2.frequencyArray(input).length);
	      System.out.println("highest" + " Output2 Map :" +  obj2.frequency(input));
	      System.out.println("highest" + " Output3 Set :" +  obj2.frequencySet(input));
	      System.out.println("highest" + " Output4 List:" +  obj2.frequencyList(input));
	
	}

	

 public  int HighestNumber(int a[])
 {
	
	int length = a.length ;

	
	int temp = 0;
	int highest = 0;
    temp = a[0];
	
    
	for(int i=1; i<a.length; i++ )
	{
		if  (a[i]>= temp);
		 temp = a[i];
	
	highest = temp;
	}
	
	return  highest;
 }

 
 public  int[] frequencyArray(int a[])

 {
 	
 	int[] array2 = new  int[10];
 	
 	
 	for( int i=0; i<a.length ; i++)
 	{
 		array2[i] = a[i];
 		
 	}

   //   System.out.println("size" + map.size());
 	
 	
 	return array2;
 }

 
 
 
public Map<Integer, Integer> frequency(int a[])

{
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	
	for( int i=0; i<a.length ; i++)
	{
		map.put(a[i], null);
	}

     System.out.println("size" + map.size());
	
	
	return map;
}


public Set<Integer> frequencySet(int a[])

{
	
	Set<Integer> set  = new HashSet<Integer>();
	
	
	for( int i=0; i<a.length ; i++)
	{
		set.add(a[i]);
	}

     System.out.println("size" + "SET" + set.size());
	
	
	return set;
}




public List<Integer> frequencyList(int a[])

{
	
	List<Integer> list  = new LinkedList<Integer>();
	
	
	for( int i=0; i<a.length ; i++)
	{
		list.add(a[i]);
	}

     System.out.println("size" + "SET" + list.size());
	
	
	return list;
}



}
