package qb;

public class Rmain {

	public static void main(String[] args) {
		QBRating Bradford = new QBRating(19.0, 3725.0, 14.0, 346.0, 532.0);
		System.out.println("Sam Bradfords QB Rating is " + Bradford.Rating());
	}
}
