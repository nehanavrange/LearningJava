package datastructure;

// average and worst case complexities are of Ο(n2)
public class SelectionSort {

	static void selection(int a[]){
		for (int i = 0; i < a.length-1; i++) {
			int index = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[index]>a[j]) {
					index = j;
				}
			}
			int smallerNumber=a[index];
			a[index]=a[i];
			a[i]=smallerNumber;
		}
	}
	public static void main(String[] args) {
		int a[]= {2,3,1,5,4,7,6,8};
		System.out.println("array length:"+a.length);
		System.out.println("Before Selection Sort");  
		for(int i:a){  
			System.out.print(i+" ");  
		}  
		System.out.println();
		SelectionSort.selection(a);
		System.out.println("After Selection Sort");  
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
