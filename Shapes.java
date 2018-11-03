public class Shapes {
    
    /*======== public static String line() ==========
      Inputs:  String c (single character String)
               int n 
      Returns: A String that contains n copies of c
      ex: Shapes.line( "^", 4 ); ==> "^^^^"
      ====================*/
    public static String line(String c, int n) {
	String s = "";
	
	while (n > 0) {
	s += c;
	n --;
	}
	
	return s;
    }
    
    /*======== public static String box() ==========
      Inputs:  String c (single character)
               int rs
               int cs 
      Returns: A String made up of a rs x cs grid of c
      ex: Shapes.box("*", 2, 3) ==> "***
                                     ***"
     ====================*/
    public static String box(String c, int rs, int cs) {
	String s = "";
	int tmp = rs;
	
	while (cs > 0) {
		while (rs > 1) {
		s += c;
		rs --;
		}
		
		if (rs == 1) {
		s += c + "\n";
		rs = tmp;
		}
		cs --;
	}

	return s;
    }


    /*======== public String tri1() ==========
      Inputs:  String c 
               int h 
      Returns: A "triangle" of c, h lines high
      ex: Shapes.tri1("|", 3); ==> "|
                                    ||
				    |||"
      ====================*/
    public static String tri1(String c, int h) {
	String s = "";
	int rwNum = 1;
	int tmp = rwNum;
	
	while (h > 0) {
		while (rwNum > 0) {
			if (rwNum == 1) {
			s += c + "\n";
			rwNum --;
			}
			
			else {
			s += c;
			rwNum --;
			}
		}
		tmp ++;
		rwNum = tmp;
		h --;
	}
	
	return s;
    }

    /*======== public String tri2() ==========
      Inputs:  String c 
               int h 
      Returns: A differnt "triangle" of c, h lines high
      ex: Shapes.tri2("|", 3); ==> "  |
                                     ||
				    |||"
      ====================*/
    public static String tri2(String c, int height){
    String s="";
	int numTab = height - 1;
	int tmp = 1;
	
	while (numTab >= 0) {
		while (tmp != height + 1) {
			if (tmp == 1) {
			s += line(" ", numTab) + c + "\n";
			tmp ++;
			numTab --;
			}
			
			else{
			s += line(" ", numTab) + line(c, tmp) + "\n";
			tmp ++;
			numTab --;
			}
		}
	numTab --;
	}

	return s;
    }

    /*======== public String tri3() ==========
      Inputs:  String c 
               int h 
      Returns: A differnt "triangle" of c, h lines high
      ex: Shapes.tri2("|", 3); ==> " |
                                    |||
				   |||||"
      ====================*/
    public static String tri3(String c, int h) {
	String s = "";
	int tabLen = (h + 2) / 2;
	int rwLen = 1;
	
	
	    while ((rwLen < h + 2) && (tabLen != 0)) {
		s += line(" ", tabLen) + line(c, rwLen) + "\n";
		tabLen --;
		rwLen += 2;
		}
	
	return s;
    }


    /*======== public diamond() ==========
      Inputs:  String c 
               int h 
      Returns: A "diamond" of c, h lines high
      ex: Shapes.tri2("|", 5); ==> " |
                                    |||
				   |||||"
				    |||
				     |"
      ====================*/
    public static String diamond(String c, int h){
	String s = "";
	/*int mid;
	if (h % 2 == 0) {
		mid = h / 2;
	}
	else {
		mid = (h / 2) + 1;
	}
	
	int tabLen;
	int rwLen;
	int rwNum = mid;				// don't know how to do this.
	/
	while (rwNum == mid) {
		tri3(c, mid);
		rwNum ++;
	}	
	*/
	return s;
    }
    
    public static void main(String[] args) {
	System.out.println("Line Test:");
	System.out.println(Shapes.line("%",10));
	System.out.println();
	
	System.out.println("Box Test:");
	System.out.println(Shapes.box("#", 5,4));
	System.out.println(Shapes.box("#", 4,5));
	System.out.println();
	
	System.out.println("Tri1 Test:");
	System.out.println(Shapes.tri1("@", 5));
	System.out.println();

	System.out.println("Tri2 Test:");
	System.out.println(Shapes.tri2("+", 5));
	System.out.println();

	System.out.println("Tri3 Test:");
	System.out.println(Shapes.tri3("|", 5));
	System.out.println();

	System.out.println("Diamond Test:");
	System.out.println(Shapes.diamond("*", 5));
    }
}
