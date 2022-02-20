package Searches;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int searchItem = 14;
		BinarySearch demo = new BinarySearch();
		boolean status = demo.search(searchItem);
		System.out.println(status);
	}
        int[] arr = {1,3,6,7,9,14,18,22,50};
        
        public boolean search(int searchItem) {
        	 boolean isFound = false;
        	 int low = 0;
             int high = arr.length - 1;
             int mid = -1;
             while(low <= high) {
            	 mid = (low+high)/2;
             	int arrValue = arr[mid];
             	if (searchItem == arrValue) {
             		isFound = true;
             		break;
             	} else if (searchItem < arrValue) {
             		high = mid - 1;
             	} else {
             		low = mid + 1;
             	}
             }
			return isFound;
             	
             
     	}
     	
     }

             

        	