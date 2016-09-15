package qb;

public class QBRating {
	
	private double TD;
	private double Yards;
	private double INT;
	private double Comp;
	private double ATT;
	public QBRating(double td, double yards, double Int, double comp, double att) {
		TD = td;
		Yards = yards;
		INT = Int;
		Comp = comp;
		ATT = att;
	}
	public double getTD() {
		return TD;
	}
	public double getYards() {
		return Yards;
	}
	public double getInt() {
		return INT;
	}
	public double getComp() {
		return Comp;
	}
	public double getATT() {
		return ATT;
	}
	public double getrating1()
	{
		return (((getComp()/getATT())-.3) * 5);
	}
	public double getrating2()
	{
		return (((getYards()/getATT())-3) * .25);
	}
	public double getrating3()
	{
		return ((getTD()/getATT()) * 20);
	}
	public double getrating4()
	{
		return (2.375 - ((getInt()/getATT())*25));
	}
	public double Rating()
	{
		return (( getrating1() + getrating2() + getrating3() + getrating4())/6) * 100;  
	}

}
