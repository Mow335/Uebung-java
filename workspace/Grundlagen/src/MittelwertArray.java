
public class MittelwertArray {
	
	static float sumAverage(int arg[]) {
		float Summe=0, Mittelwert=0;
		for (int i=0; i<arg.length;i++)
			Summe+=arg[i];
		System.out.println("Die Summe des Arrays ist: "+Summe);
		System.out.println("Der Länge des Arrays ist: "+arg.length);
		Mittelwert=(Summe/arg.length);		
		return Mittelwert;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,1,1,7};		
		System.out.print("Die Werte des Arrays sind: [ ");
		for (int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("]");		
		float Mittelwert=sumAverage(arr);		
		System.out.println("Der Mittelwert des Arrays ist: "+Mittelwert);
	}
}