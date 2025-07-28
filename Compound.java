package S1;

public class Compound {
	public static void main(String [] args)
	{
		double P=200;
		double T=40;
		double R=90;
		double c= P*Math.pow((1+R/100),T);
		double ci=c-P;
		System.out.println(ci);
	}

}
