import java.util.*;

public class Stat extends SuperArray {

    private SuperArray data;

    /**
     * Initialize the data array to a size of your choosing.
     */
    public Stat()  {
	data = new SuperArray(10);
    }
    
    /**
     * Initialize the data array to the specified size.
     */
    public Stat(int s)  {
	data = new SuperArray(s);
    }

    /**
     * Returns a string that contains all the elements of the array.
     */
    public String toString() {
	String s = "";

	for(int i=0; i < data.size; i++ )
	    s+= data.get(i) + " ";

	return s;
    }
    
    /*
     * Go through the array and have the user enter 
     * values for each available space.
     */
    public void setValues() {
	Scanner scan = new Scanner( System.in );

	for(int i=0; i < data.size; i++ ) {

	    System.out.print( "Enter data: " );
	    data.add(scan.nextInt());
	}
    }

    /**
     * Return the sum of all the data in the array.
     */
    public int calcSum() {
	int sum = 0;
	for(int i=0; i < data.size; i++ )
	    sum+= data.get(i);
	
	return sum;
    }

    /**
     * Return the average of the data in the array.
     */
    public double calcAvg() {
	return calcSum() * 1.0 / data.size;
    }

    /**
     * Return the smallest value in the array.
     */
    public int findMin() {
	int min = data.get(0);

	for(int i=1; i < data.size; i++ )
	    if ( data.get(i) < min )
		min = data.get(i);
	    
	return min;
    }

    /**
     * Return the largest value in the array.
     */
    public int findMax() {
	int max = data.get(0);

	for(int i=1; i < data.size; i++ )
	    if ( data.get(i) > max )
		max = data.get(i);
	    
	return max;
    }


    public int frequency( int n ) {

	int freq = 0;
	for(int i=0; i < data.size; i++ )
	    if ( data.get(i) == n )
		freq++;

	return freq;
    }


    public boolean evenBalance() {
	int lsum = 0;
	int rsum = 0;

	for (int i=0; i < data.size/2; i++ ) {
	    lsum+= data.get(i);
	    rsum+= data.get(data.size - 1 - i);
	}
	return lsum == rsum;
    }

    public int mode() {
	int guess = data.get(0);
	int freq = frequency( guess );

	for (int i=1; i < data.size; i++ ) {
	    if ( frequency( data.get(i) ) > freq ) {
		freq = frequency( data.get(i) );
		guess = data.get(i);
	    }
	}
	return guess;
    }

    public static void main( String[] args ) {

	int n;
	Stat s;
	Scanner scan = new Scanner( System.in );
	
	System.out.print("Number of entries: ");
	n = scan.nextInt();

	s = new Stat(n);

	s.setValues();
	System.out.println( "Data: " + s );
	System.out.println("Sum: " +  s.calcSum() );
	System.out.println("Average: " + s.calcAvg() );
	System.out.println("Min: " + s.findMin() );
	System.out.println("Max: " + s.findMax() );

	System.out.println( "Frequency of 10: " + s.frequency(10));
	System.out.println( "Frequency of -1: " + s.frequency(-1));

	System.out.println( "Balanced? " + s.evenBalance() );

	System.out.println( "Mode: " + s.mode() );
    }
}
