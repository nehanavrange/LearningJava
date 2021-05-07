package collection.Map;

public class EX implements Comparable<EX> {

	    private int x;
		private int y;
		
		public EX(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		

		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		@Override
		public String toString() {
			return "EX [" + x + ", " + y + "]";
		}


		@Override
		public int hashCode() {
			
			return x;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof EX)
			{
				EX e= (EX) obj;
				return this.x==e.x && this.y==e.y;
			}
			return false;
			
		}


		@Override
		public int compareTo(EX o) {
			//default sorting order
			//ascending order
			return this.y -o.y ;
		}
		
		
	
}
