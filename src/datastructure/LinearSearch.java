package datastructure;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {1,4,5,3,7,8};
		int x=6;
		System.out.println("array length:"+a.length);
		for (int i = 0; i <=a.length; i++) {
			if(i==a.length) {
				System.out.println("element not found:"+x);
				break;
			}
			else if (x==a[i]) {
				System.out.println("element found:"+a[i]);
				break;
			}
		}
	}

}