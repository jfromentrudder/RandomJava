public class RationalNumber2 {
    private int numerator;
    private int denominator;

    public RationalNumber2() {
	numerator = 0;
	denominator = 1;
    }

    public RationalNumber2(int n, int d) {
	if (d != 0) {
	    numerator = n;
	    denominator = d;
	}
	else {
	    System.out.println("Error '0' not a valid input for denominator, setting rational number 0/1");
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

    public void multiply(RationalNumber2 n) {
	numerator *= n.getNumerator();
	denominator *= n.getDenominator();
    }
	
    public void add(RationalNumber2 n) {
	if (denominator == n.getDenominator()) {
	numerator += n.getNumerator();
	denominator += n.getDenominator();
	}
	else {
	int x = denominator;
	int y = n.getDenominator();
	
	numerator *= y;
	denominator *= y;
	n.getNumerator() *= x;
	n.getDenominator() *= x;
	
	numerator += n.getNumerator();
	denominator += n.getDenominator();
	}
	
	public void subtract(RationalNumber2 n) {
	if (denominator == n.getDenominator()) {
	numerator -= n.getNumerator();
	denominator -= n.getDenominator();
	}
	else {
	int x = denominator;
	int y = n.getDenominator();
	
	numerator *= y;
	denominator *= y;
	n.getNumerator() *= x;
	n.getDenominator() *= x;
	
	numerator -= n.getNumerator();
	denominator -= n.getDenominator();
	}
	
	public int gcd() {
	    int a, b;

	    if (numerator > denominator) {
		a = numerator;
		b = dwenominator;
	    }

	    else {
		a = denominator;
		b = numerator;
	    }

	    while(a % b != 0) {
		int tmp = b;
		b = a % tmp;
		a = tmp;
	    }

	    return b;
	}
	
	public void reduce() {
	int g = gcd();

	numerator /= g;
	denominator /= g;
	}

	public String toString() {
	    return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
	RationalNumber2 r = new RationalNumber2();
	RationalNumber2 s = new RationalNumber2(2, 3);
	
	r.display();
	s.display();
	
	s.floatValue();
	s.display();
	
	r.multiply(s);
	r.display();
	}
}
