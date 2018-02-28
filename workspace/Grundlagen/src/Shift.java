
public class Shift {
	
	static void disposarray( int shift[])
	{	
		int i;
		int placeholder;
		System.out.print("Values of the Array: [ ");
		for (i=0; i < shift.length; i++)
			System.out.print(shift[i] + " ");
		System.out.println("]");
		
		placeholder = shift[shift.length-1];
		
		for (i=shift.length-2; i>=0; i--)
		{
			shift[i+1] = shift[i];

		}
		shift[0] = placeholder;
	}
	
	public static void main(String[]args)
	{
		
		int base[] = {1,2,3,4,5};
		disposarray(base);
		System.out.print("Values of the Array: [ ");
		for (int i=0; i < base.length; i++)
			System.out.print(base[i] + " ");
		System.out.println("]");
		disposarray(base);
		
		System.out.print("Values of the Array: [ ");
		for (int i=0; i < base.length; i++)
			System.out.print(base[i] + " ");
		System.out.println("]");
		
		
	}
}