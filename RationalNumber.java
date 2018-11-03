public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
	numerator = 0;
	denominator = 1;
    }

    public RationalNumber(int n, int d) {
	if (d != 0) {
	    numerator = n;
	    denominator = d;
	}
	else {
	    System.out.println("Error '0' not a valid input for denominator");
	    numerator = 0;
	    denominator = 1;
	}
    }

    public void display() {
	System.out.println("Your rational number is " + numerator + "/" + denominator);
    }
	
	public int getNumerator() {
	return numerator;
	}
	
	public int getDenominator() {
	return denominator;
	}

    public double floatValue() {
	double num = numerator;
	double den = denominator;
	return (num / den);
    }

    public void multiply(RationalNumber n) {
	numerator *= n.getNumerator();
	denominator *= n.getDenominator();
    }

    public static void main(String[] args) {
	RationalNumber r = new RationalNumber();
	RationalNumber s = new RationalNumber(2, 3);
	RationalNumber err = new RationalNumber(42, 0);
	
	r.display();
	s.display();
	err.display();
	
	s.floatValue();
	
	s.multiply(s);
	}
}
