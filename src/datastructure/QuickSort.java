package datastructure;

public class QuickSort {

	//using middle pivot element
	public static void main(String[] args) {
		int a[]={2,3,1,5,4,7,6,8};
		System.out.println("array length:"+a.length);
		System.out.println("Before Quick Sort");  
		for(int i:a){  
			System.out.print(i+" ");  
		}  
		System.out.println();

		QuickSort.quickSort(a,0,a.length-1);
		System.out.println("After Quick Sort");  
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		int mid=(low+high)/2;
		int pivot=a[mid];

		int i=low,j=high;

		while (i<=j) {

			while (a[i] < pivot) {
				i++;
			}
			while(a[j] > pivot) {
				j--;
			}
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}

		if(low<j) {
			quickSort(a, low, j);
		}
		if(high>i) {
			quickSort(a, i, high);
		}

	}
}
