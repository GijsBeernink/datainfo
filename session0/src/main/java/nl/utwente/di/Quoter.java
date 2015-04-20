package nl.utwente.di;

public class Quoter {
	public Quoter() {
		
	}
	
	public double getBookPrice(String book) {
		double result = 0.0;
		if (book.equals("1")) {
			result = 10.0;
		} else if (book.equals("2")) {
			result = 45.0;
		} else if (book.equals("3")) {
			result = 20.0;
		} else if (book.equals("4")) {
			result = 35.0;
		} else if (book.equals("5")) {
			result = 50.0;
		}
		return result;
	}
}
