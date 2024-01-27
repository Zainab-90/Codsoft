// Task 3: ATM Interface

import java.util.Scanner;
public class ATM
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Account User = new Account(5000);
		
		System.out.print("Enter Your Name: ");
		String Name = sc.next();
		System.out.print("Enter Your Account Number: ");
		int AccNo = sc.nextInt();
		System.out.println("\n\n********** Welcome To ATM Interface **********\n");
		boolean Running = true;	

		while(Running)
		{
			System.out.println("\n1. Check Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
			System.out.println("4. Dislpay Details");
			System.out.println("5. Exit \n");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1:  System.out.println("\nYour Account's Current Balance Is: Rs."+User.getBalance());
						 System.out.print("");
					 	break;	
		 			
				case 2: System.out.print("\nEnter The Amount You Want To Withdraw: ");
						double withdraw = sc.nextDouble();
						if(User.Withdraw(withdraw))
						{ 		
							System.out.println("\nAmount Has Been Withdrawn!!");
						}
						else
						{
							System.out.println("\nInsufficient Balance!");
						}
						break;

				case 3: System.out.print("\nEnter The Amount You Want To Deposit: ");
						double deposit = sc.nextDouble();
						if(User.Deposit(deposit))
						{
						System.out.println("\nAmount Has Been Deposited!!");
						}
						else
						{
							System.out.println("\nInvalid Amount!");
						}
						break;

				case 4: System.out.println("Name: "+Name);
						System.out.println("Account Number: "+AccNo);
						System.out.println("Balance: "+User.getBalance());
						break;
						
				case 5: System.exit(0);	

				default: System.out.println("Invalid Choice!!");	
				
									
			}
		}
		
	}	
}

class Account
{
	private double balance;
	public Account(double original_value)
	{
		balance = original_value;
	}
	public boolean Withdraw(double Amount)
	{
		if(Amount > 0 && Amount <= balance)
		{
			balance = balance - Amount;
			return true;
		}
		return false;		
	}
	public boolean Deposit(double Amount)
	{
		if (Amount > 0)
    	{
        	balance = balance + Amount;
       		return true;
    	}
    return false;
	}
	public double getBalance()
	{
		return balance;
	}
}