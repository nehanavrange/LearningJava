package datastructure;

public class MergeSort {



	public static void main(String[] args) {
		int inputArray[]= {2,1,3,4,6,5,9,0,8};
		MergeSort mergesort=new MergeSort();
		System.out.println("Before Sorted array"); 
		for (int i : inputArray) {
			System.out.print(i+" ");
		}
		System.out.println();
		mergesort.sort(inputArray, 0, inputArray.length-1);
		System.out.println();
		System.out.println("After Sorted array"); 
		for (int i : inputArray) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

	//Intialized
	private void sort(int[] inputArray,int begin,int end) {
		if(begin<end) {
			// Find the middle point
			int mid=(begin+end)/2;

			// Sort first and second halves
			sort(inputArray,begin,mid);// divide
			sort(inputArray,mid+1,end);
			mergeArray(inputArray,begin,mid,end);
		}

	}
	void mergeArray(int arr[], int beg, int mid, int end)  
	{  

		int l = mid - beg + 1;  
		int r = end - mid;  

		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  

		for (int i=0; i<l; ++i)  
			LeftArray[i] = arr[beg + i];  

		for (int j=0; j<r; ++j)  
			RightArray[j] = arr[mid + 1+ j];  


		int i = 0, j = 0;  
		int k = beg;  
		while (i<l&&j<r)  
		{  
			if (LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			}  
			k++;  
		}  
		while (i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  

		while (j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  
}




