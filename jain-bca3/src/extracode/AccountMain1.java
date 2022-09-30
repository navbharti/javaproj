package extracode;


	/* Create two methods namely credit and getBalance. The first one adds the amount (passed as parameter) to balance and does not return any data.
 The second method allows clients (i.e. the other classes that use this class) to obtain the value of a particular Account object’s balance. */
import java.util.*;
class Account1
{
	double balance;
	double credit;
	Account1(double balance,double credit)
	{
		this.balance=balance;
		this.credit=credit;
	}
	double credit()
	{
		double c=credit+balance;
		return c;
	}
	double getBalance()
	{
		return balance;
	}

}
public class AccountMain1 {

	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		Account1 a=new Account1(123456,2345);
		double cre=a.credit();
		double g=a.getBalance();
		System.out.println("The balance is: "+g);
		System.out.println("The Credited balance is: "+cre);
		
	
	}


}