public class BankAccount {

    String name;
    String passw;
    String pin;
    String acntNum;
    double balance;

    public void BankAccount(String n, String p, String pinNum, String acnt, double b){
	name = n;
	passw = p;
	pin = pinNum;
	acntNum = acnt;
	balance = b;
    }

    public void nameSet(n){
	name = n;
    }

