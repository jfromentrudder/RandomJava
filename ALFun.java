import java.util.*;

public class ALFun {

    static void populateAL( ArrayList al, int n ) {	
		Random r = new Random();
		while (n >= 0) {
			al.add(r.nextInt(11));
			n --;
		}
    }

    static void collapseDuplicates( ArrayList al ) {
		int i = 0;
		
		while (i < al.size() - 1) {
			if (al.get(i) == al.get(i + 1)) {
				al.remove(i);
			}
			else {
			i ++;
			}
		}
    }

    public static void main(String[] args) {

	ArrayList a = new ArrayList();
	System.out.println( "Before populate: " + a);
	populateAL( a, 40 );
	System.out.println( "After populate: " + a );
	collapseDuplicates( a );
	System.out.println( "After collapse: " + a );
    }

}
