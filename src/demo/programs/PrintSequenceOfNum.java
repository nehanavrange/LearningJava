package demo.programs;

/*First parameter is first number to display, 
second parameter should be number of rows to be printed.
 */
/*output should be:

input 4
rows = 7

4
8 9
12 14 16
16 17 18 19
36 38 40 42 44 46
32 33 34 35 36 37 38 39
108 110 112 114 116 118 120 122 124
 */

public class PrintSequenceOfNum {

	public static void main(String[] args) {
		printseries(4,7);
	}

	private static void printseries(int input, int row) {
		int d = 0;
		int k = 0;
		for(int i=1;i<=row;i++) {
			for (int j=1;j<=i;j++) {
				if(i%2==0) {
					if(j==1) {
						System.out.print(input*i+" ");
					}
					else {
						d=input*i;
						for( k=j;k<=i;k++) {

							System.out.print(d+1 +" ");
							d++;
						}
					}
					if(j==k-1) {
						break;
					}
				}
				else {
					if(j==1) {
						System.out.print(input*i+" ");
					}
					else {
						d=input*i;
						for( k=j;k<=i;k++) {
							System.out.print(d+2+" ");
							d=d+2;
						}
						if(j==k-1) {
							break;
						}

					}
				}
			}
			System.out.println();
		}
	}

	/*		for(int i=1;i<=row;i++) {
			for (int j=1;j<=i;j++) {
				if(j==1) {
					d=i*input;
					System.out.print(d +" ");
				}
				else {
					System.out.print(d+1 +" ");

				}*/

}

