package ubu.gii.dass.refactoring;

public class NewRelease extends MovieType{

	@Override
	public double getCharge(Rental rental) {
		double result = rental.getDaysRented() * 3;
		return result;
	}

	@Override
	public int getType() {
		return MovieType.NEW_RELEASE;
	}

}
