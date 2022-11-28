

import java.util.Scanner;

class withdrawMoneyException extends Exception {

	withdrawMoneyException(String errormessage) {
		super(errormessage);
	}
}

class depositMoneyException extends Exception {

	depositMoneyException(String errormessage) {
		super(errormessage);
	}
}

class BankingServices {
	String Username;
	String Password;
	double balance = 1000;
	public boolean checkLogin(String user,String pass){
		
		
		 Username = "123";
		 Password = "123";
		 
		
		boolean flag = true;
		if (user.equals(Username) && pass.equals(Password)) {

			System.out.println("Access Granted! Login Sucessful Welcome!");
		}else if (!user.equals(Username)) {
			System.out.println("Invalid Username!");
			flag =false;
		}else if (!pass.equals(Password)) {
			System.out.println("Invalid Passowrd!");
			flag = false;
		}
		return flag;
	}
	

	public void withdrawMoney(float money) throws withdrawMoneyException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a WithdrawMoney");
		float withdrawmoney=sc.nextFloat();

		if (withdrawmoney <= 500) {
			System.out.println("Transaction Has Sucessfully Completed");
			balance = balance - withdrawmoney;
			System.out.println("Current balance is" + (balance));
		} else {
			throw new withdrawMoneyException("Withdraw Not Allowed");
		}
	}

	public void depositMoney(float money) throws depositMoneyException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a DepositdrawMoney");
		float depositmoney=sc.nextFloat();

		if (depositmoney <= 500) {

			System.out.println("Transaction Has Sucessfully Completed");
			balance = balance + depositmoney;
			System.out.println("Current balance is" + (balance));
		} else {
			throw new depositMoneyException("Deposit are Not Allowed");
		}
	}

	public void checkAvailableBalance() {

		System.out.println("Current balance is" + (balance));

	}

}

public class BankingServicesApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********************");
		System.out.println("Welcome To Banking Services Application");
		System.out.println("********************");
		
		//float depositmoney = 400;
		//float withdrawmoney = 400;

		
		 Scanner input1 = new Scanner(System.in);
		  System.out.println("Enter User ID : "); 
		  String username = input1.next();
		  
		  Scanner input2 = new Scanner(System.in);
		  System.out.println("Enter Password : ");
		  String password = input2.next();
		 
				
		BankingServices obj = new BankingServices();
		boolean flag=obj.checkLogin(username , password);
		while (flag) {

			System.out.println("A.WithDraw Money");
			System.out.println("B.Deposit Money");
			System.out.println("C.Available Balance");
			System.out.println("D.Exit");
			System.out.println("Select Option");
			Scanner sc = new Scanner(System.in);
			char i = sc.next().charAt(0);
			//System.out.println("");
			switch (i)

			{

			case 'A':

				try {
					obj.withdrawMoney(i);
				} catch (withdrawMoneyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 'B':

				try {
					obj.depositMoney(i);
				} catch (depositMoneyException e) {
					// TODO Auto-generated123 catch block
					e.printStackTrace();
				}

				break;

			case 'C':

				obj.checkAvailableBalance();

				break;

			case 'D':
				System.exit(0);

			}
		}
	}

}
