package Searches;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int searchItem = 10;
		LinearSearch demo = new LinearSearch();
		boolean status = demo.LinSearch(searchItem);
		if(status) 
			System.out.println("Found");
			else
				System.out.println("Not Found");
		}
	
        int[] arr = {10,20,30,40,50};
        
        public boolean LinSearch(int searchItem) {
        	boolean isFound = false;
        	int size = arr.length;
        	System.out.println("The size of array is :" + size);
        	for(int i=0;i<size;i++) {
        		int value = arr[i];
        		if(value == searchItem) {
        			isFound = true;
        			break;
        		}
        	}
        	return isFound;
        }
}
        		

       
        


