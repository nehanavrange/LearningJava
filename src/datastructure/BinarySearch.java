package datastructure;

public class BinarySearch {

	//The worst-case complexity of the Binary Search Algorithm is O(log N)
	public static void main(String[] args) {
		//Elements must be in sorted order in  Binary/Interval search
		int a[]= {1,2,3,4,5,6,7,8};
		int mid;
		int low=0,high=a.length-1;
		int x=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if (x==a[mid]) {
				System.out.println("element found:"+x+"=="+a[mid]);
				break;
			}
			else if (x<a[mid]) {

				high=mid-1;
			}
			else  {
				low=mid+1;
			}

		}
		if ( low > high )
			System.out.println(x + " is not found.\n");

	}

}
