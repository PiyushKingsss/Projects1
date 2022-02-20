package Sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {9,6,3,1,2,4,5};
	    int length = arr.length;
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    for(int i:arr){

	        System.out.println(i);
	    }
	}
	         
	
    public static void selectionSort(int[] arr){
    	int len = arr.length;
    	for(int i=0;i<len;i++){
            for (int j=i+1;j<(len);j++){
                if(arr[i]>arr[j]){
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
                }
            }
    	}
    }
}


       
     
