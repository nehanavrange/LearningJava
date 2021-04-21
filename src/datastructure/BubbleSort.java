package datastructure;

public class BubbleSort {

	// Average and worst case time complexity  are of Ο(n2) 

	static void swap(int a1[]) {
		int temp=0;

		for (int i = 0; i < a1.length-1; i++) {
			for (int j = 0; j < a1.length-i-1 ; j++) //gives last element in sorted order thats why(-i) taken in condition 
			{
				if(a1[j]>a1[j+1])
				{
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}


	}

	public static void main(String[] args) {
		int a[]= {2,3,1,5,4,7,6,8};
		System.out.println("array length:"+a.length);
		BubbleSort.swap(a);
		System.out.println("sorted array using bubble sort");
		for (int i : a) {
			System.out.print(" "+i+" ");
		}


	}

}
