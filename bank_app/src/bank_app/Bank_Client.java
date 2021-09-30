package bank_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bank_Client {
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("WELCOME TO XYZ BANK");
		System.out.println("-------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Name:");
		String name = br.readLine();
		System.out.println("Enter your State Name:");
		String statename = br.readLine();
		System.out.println("Enter your City Name:");
		String cityname = br.readLine();
		System.out.println("Enter your Zip Code:");
		int zipcode = Integer.parseInt(br.readLine());
		System.out.println("Enter the Type of Account you want to Create");
		System.out.println("Enter 1 if you want to create a Savings Account");
		System.out.println("Enter 2 if you want to create a Current Account");
		int Acc_type = Integer.parseInt(br.readLine());
		
		XYZBankAcc acc1;
		
		if(Acc_type == 1)
		{
			Address address1 = new Address(statename, cityname, zipcode);
			acc1 = new SavingAccount(name, address1);
			acc1.acc_type = ACC_TYPE.SAVINGS;
		}
		else
		{
			Address address1 = new Address(statename, cityname, zipcode);
			acc1 = new Currentaccount(name, address1);
			acc1.acc_type = ACC_TYPE.CURRENT;
		}
		

		
		while(true)
		{
			System.out.println("");
			System.out.println("Enter 1 if you want to add amount");
			System.out.println("Enter 2 if you want to deduct amount");
			System.out.println("Enter 3 if you want to get Balance");
			System.out.println("Enter 4 if you want to exit");
			System.out.println("Enter 5 if you want to get your account information");
			
			int enteredoption = Integer.parseInt(br.readLine());
			
			if(enteredoption == 4)
			{
				System.out.println("Thank you for Banking with XYZ Bank");
				break;
			}
			else if(enteredoption == 1)
			{
				System.out.println("Enter the Amount that you want to add:");
				int enteredamount = Integer.parseInt(br.readLine());
				acc1.addamount(enteredamount);
				System.out.println("Current Balance after adding:"+acc1.getBalance_Amount());
			}
			else if(enteredoption == 2)
			{
				System.out.println("Enter the Amount that you want to deduct:");
				int enteredamount = Integer.parseInt(br.readLine());
				System.out.println(acc1.withdrawamount(enteredamount));
				System.out.println("Current Balance after deducting:"+acc1.getBalance_Amount());
			}
			else if(enteredoption == 3)
			{
				System.out.println(acc1.getBalance_Amount());
			}			
			
			else if(enteredoption == 5)
			{
				System.out.println(acc1);
			}
		}
		
		
		
	}


}
