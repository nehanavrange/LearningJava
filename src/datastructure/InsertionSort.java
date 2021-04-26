package datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {2,3,1,5,4,7,6,8};
		System.out.println("array length:"+a.length);
		System.out.println("Before Insertion Sort");  
		for(int i:a){  
			System.out.print(i+" ");  
		}  
		System.out.println();
		InsertionSort.insertion(a);
		System.out.println("After Insertion Sort");  
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	private static void insertion(int[] a) {
	    int n = a.length;  
        for (int j = 1; j < n; j++) {  
            int key = a[j];  
            int i = j-1;  
            while ( (i > -1) && ( a [i] > key ) ) {  
                a [i+1] = a [i];  
                i--;  
            }  
            a[i+1] = key;  
        }
	}

	
}
