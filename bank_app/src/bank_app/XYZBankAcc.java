package bank_app;

import java.util.Date;



public class XYZBankAcc {
	

	public String Ownername;
	public Address address;
	public double Balance_Amount ;
	public Date created_date;
	public status Acc_status;
	public ACC_TYPE acc_type;
	public XYZBankAcc(String ownername, Address address) {
		super();
		Ownername = ownername;
		this.address = address;
		Balance_Amount = 0;
		this.created_date = new Date();
		this.Acc_status = status.ACTIVE;
	}
	
	public String getOwnername() {
		return Ownername;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double getBalance_Amount() {
		return Balance_Amount;
	}
	
	public void setBalance_Amount(double balance_Amount) {
		Balance_Amount = balance_Amount;
	}
	
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public status getAcc_status() {
		return Acc_status;
	}
	public void setAcc_status(status acc_status) {
		Acc_status = acc_status;
	}
	public ACC_TYPE getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(ACC_TYPE acc_type) {
		this.acc_type = acc_type;
	}
	
	public void addamount(double amount) {
		double current_amount = getBalance_Amount();
		setBalance_Amount(current_amount + amount); 
	}
	
	public String withdrawamount(double amount) 
	{
		double current_amount = getBalance_Amount();
		if(amount > current_amount)
		{
			return "Entered Amount is greater than your Current Balance";
		}
		else {
			return "Amount" + amount + "has been withdrawn from your Account";
		}
	}

	@Override
	public String toString() {
		return "XYZBankAcc [Ownername=" + Ownername + ", address=" + address + ", Balance_Amount=" + Balance_Amount
				+ ", created_date=" + created_date + ", Acc_status=" + Acc_status + ", acc_type=" + acc_type + "]";
	}
	
	
	
	
	
}

enum status {
	ACTIVE,
	INACTIVE,
	CLOSED
}

enum ACC_TYPE {
	SAVINGS,
	CURRENT
}