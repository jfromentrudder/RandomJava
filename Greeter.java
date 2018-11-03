public class Greeter {

    //Instance Variables
    String message;
    static boolean chooser = true;
    static byte randNum = (byte)(Math.random() * 2);

    //Methods
	
	//variable value setters
    public void setMessage(String m) { //sets value of message
	message = m;
    }

    public void greet() {
	System.out.println(message);
    }

    public void greet(String name){
	System.out.println(message + " " + name);
    }
	
    public static void truthGenerator(){
	if (randNum == 0){
	    chooser = true;
	}
	else{
	    chooser = false;
	}
    }
	
	
    //main method
    public static void main(String[] args){
	Greeter g;
	g = new Greeter();

	Greeter Fry = new Greeter();
	
	truthGenerator();

	if (chooser == true){
	    g.setMessage("Professor: Good News Everyone!");
	    g.greet();
	
	    Fry.setMessage("Fry: Hello");
	    Fry.greet("Professor");
	}
	else{
	    g.setMessage("Professor: Bad News Everyone!");
	    g.greet();
	
	    Fry.setMessage("Fry: Oh No!");
	    Fry.greet("Not again!");
	}
    }
}
