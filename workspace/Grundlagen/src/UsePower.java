
public class UsePower {
	
	static double potenz(int[] arg) {
		int x=arg[0];
		int n=arg[1];
		double ergebnis=Math.pow(x, n);		
		return ergebnis;
	}
	
	static double potenz(int x, int n) {
		double ergebnis=Math.pow(x, n);		
		return ergebnis;
	}

	public static void main(String[] args) {
		int x=5, n=4;		
		int arr[]= {x,n};
		double y=potenz(arr);
		double y2=potenz(x, n);
		System.out.println("Die "+n+". Potenz von "+x+" ist "+y);
		System.out.println("Die "+n+". Potenz von "+x+" ist "+y2);
	}
}