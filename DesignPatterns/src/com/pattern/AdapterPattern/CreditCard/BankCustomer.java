package com.pattern.AdapterPattern.CreditCard;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// adapter class
public class BankCustomer extends BankDetails implements CreditCard{
	
	public void giveBankDetails(){
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the account holder name");
			String customerName = br.readLine();
			System.out.println("\n");
			
			System.out.println("enter the account number:");
			long accno=Long.parseLong(br.readLine());
			System.out.println("\n");
			
			System.out.println("enter the bank name");
			String bankName=br.readLine();
			
			setAccHolderName(customerName);
			setAccNumber(accno);
			setBankName(bankName);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public String getCreditCard() {
	long accno = getAccNumber();
	String accHolderName=getAccHolderName();
	String bname=getBankName();
		return ("the account number "+accno +"of" + accHolderName 
		+ "in" +bname+" bank is valid and authenticated for credit card");
	}
}
