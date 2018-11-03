public class BankAccount2 {

    static String name;
    static String passw;
    static String pin;
    static String acntNum;
    static double balance;
	
	public int length();
	public char charAt(int index);
	boolean isDigit(char c);

    public static void BankAccount2(String n, String p, String pinNum, String acnt, double bal) {
	name = n;
	passw = p;
	pin = pinNum;
	acntNum = acnt;
	balance = bal;
    }

    public static void nameSet(String n) {
	name = n;
    }
	
	public static void passSet(String p) {
	passw = p;
	}
	
	public static void balanceSet(double bal) {
	balance = bal;
	}
	
	/*public static void infoShow() {
	System.out.println("Account name: " + name + ", " + "PassWord: " + passw + ", " + "Pin number: " + pin + ", " + "Account number: " + acntNum + ", " + "Account balance: " + balance);
	}*/
	
	public static void balanceShow() {
	System.out.println("Account Balance: " + balance);
	}
	
	public static void deposit(double value) {
	balance += value;
	}
	
	public static void withdraw(double value) {
	if (balance >= vlaue) {
	balance -= value;
	System.out.println(balance == value);
	}
	else {
	System.out.println(balance == value);
	System.out.println("Error insufficient funds");
	}
	}
	
	public static void accountCheck(String s){
	if (s.length() != 9 || str.charAt(0) == '0' || ! str.isDigit(str.charAt(0))) {
	acntNum = "999999999";
	System.out.println("Error that is not a proper account number. Account number must be exactly 9 characters long and begin with a non-zero digit");
	}
	else {
	acntNum = s;
	}
	}
	
	public static void acntSet(String acnt) {
	accountCheck(acnt);
	}
	
	public static void pinCheck(String str) {
	if (str.length() != 4 || ! str.isDigit(str.charAt(0)) || str.charAt(0) == '0'){
	pin = "9999";
	System.out.println("Error that is not a proper pin number. Pin number must be exactly 4 characters and begin with a non-zero digit");
	}
	else {
	pin = str;
	}
	}
	
	public static void pinSet(String pinNum) {
	pinCheck(pinNum);
	}
	
	public static void authenticate(String accountNum, String pinPass) {
	System.out.println(accountNum == acntNum && pinPass == pin);
	}
	
	public static void main(String[] args) {
	BankAccount("", "", "", "", 000.00);
	nameSet("Jay");
	passSet("foo");
	pinSet("1234");
	acntSet("123456789");
	balanceSet(1000.00);
	/*infoShow();
	deposit(0.01);
	balanceShow();
	withdraw(500.00);
	balanceShow();*/
	}
}