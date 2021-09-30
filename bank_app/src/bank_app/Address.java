package bank_app;

public class Address {
	
	@Override
	public String toString() {
		return "Address [State=" + State + ", City=" + City + ", pin=" + pin + "]";
	}
	public String State;
	public String City;
	public int pin;
	public Address(String state, String city, int pin) {
		super();
		State = state;
		City = city;
		this.pin = pin;
	}

	
}
