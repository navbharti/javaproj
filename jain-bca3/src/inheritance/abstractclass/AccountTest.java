package inheritance.abstractclass;



/* Create class AccountTest to create and manipulate an Account object. */
class Account2
{
	double balance;
	Account2(double balance)
	{
		this.balance=balance;
	}
	void show()
	{
		System.out.println("The balance is : "+balance);
	}

}
class AccountTest
{
	public static void main(String args[])
	{
		Account2 a=new Account2(123456.76543);
		a.show();
		
		
	
	}


}