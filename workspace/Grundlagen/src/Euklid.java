
public class Euklid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6,b = 23, rest = 0;
		int c = 0, d = 0;
		if (a < b) {				// if-Zuweisung um herauszufinden welche der größere Wert ist
			c = a;					//c = Teiler
			d = b;					//d =Nenner
		}
		else {
			
			c = b; d = a;
		}
		while (d % c != 0) {	 	// Prüfen ob der Rest von d/c ungleich Null ist
			rest = d % c;
			d = c; 					// hier wird der vorherige Teiler zum neuen Nenner 
			c = rest; 				// der neue Teiler ist der Rest
		}
			System.out.println("Der groeßte gemeinsame Teiler von " + a + " und " + b + " ist " + c);
			
	}

}
