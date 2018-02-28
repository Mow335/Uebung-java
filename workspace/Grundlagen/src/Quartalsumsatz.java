
public class Quartalsumsatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [] [] umsatz = new float [3][4];
		for (int i=0; i<3; i++)
			for (int j=0; j<4; j++)
				umsatz[i][j] = (i + j) * 1000;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.println("Filiale " + i + " hat im Quartal " +
						(j+1) + " folgenden Umsatz: " + umsatz[i][j]);
			}
			System.out.println();	
		}
	}

}
