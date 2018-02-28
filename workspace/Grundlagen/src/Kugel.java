
public class Kugel {
	
	static final double pi=3.14;
	
	static double[] berechnung(double arg) {
		double Kugel[]=new double[3];
		Kugel[0]=2*pi*arg;
		Kugel[1]=4*pi*(arg*arg);
		Kugel[2]=pi*(arg*arg*arg)*(4/3);
		return Kugel;
	}

	public static void main(String[] args) {
		double r=5.0;
		double[] Ergebnis=berechnung(r);
		System.out.println("Der Radius der Kugel betr�gt: "+r+" cm");
		System.out.println("Der Umfang der Kugel betr�gt: "+Ergebnis[0]+" cm");
		System.out.println("Die Mantelfl�che der Kugel betr�gt: "+Ergebnis[1]+" cm�");
		System.out.println("Das Volumen der Kugel betr�gt: "+Ergebnis[2]+" cm�");
	}
}
