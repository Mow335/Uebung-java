
public class AddRec {

		static int a = 4;
		static int b = 3;	
		
		static int addRec(int a, int b) 
		{

			if (a > 1)
				return (addRec(a - 1, b) + b);
			else
				return b;
		}
		

			public static void main(String[] args) {
			// TODO Automatisch generierter Methodenstub

			
			
			
			int p = addRec(a,b);
			System.out.println("rekursive Berechnung: " + p);

			}

	}
