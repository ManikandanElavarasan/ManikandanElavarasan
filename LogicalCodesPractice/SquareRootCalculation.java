package first;

public class SquareRootCalculation {

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;
		double d1=Math.pow((x1+x2), 2);
		
		double d2=Math.pow((y1+y2), 2);
		
		double square=d1+d2;
		
		System.out.println(square);
		
		int root=(int) Math.sqrt(square);
		
		System.out.println(root);



		
		
		
		

	}

}
