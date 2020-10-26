package suvela;

class Mall {
	int items;
	String cust_Name;
	String visa_card;
	String cash;
	String payment;
	boolean bill;
	boolean carry_Bag;
	
	
	void itemAddedToCart(int items) {
			this.items = items;
	}
	void customerName(String cust_Name) {
			this.cust_Name = cust_Name;
	}
	void paymentDoneUsing(String visa_card, String cash) {
			this.visa_card = visa_card;
			this.cash = cash;
	}
	void needBill(boolean bill) {
			this.bill = bill;
	}
	void haveCarryBag(boolean carry_Bag) {
			this.carry_Bag = carry_Bag;
	}
	void decideSection(String payment) {
			this.payment = payment;
			System.out.println(cust_Name + " bought "+items+" items and payment done using "+payment);
			if(items < 10 && payment == cash)
				System.out.println("Send customer to section 1A");
			if(items < 10 && payment == cash)
				System.out.println("Send customer to section 1C");
			if(items > 10 && payment == visa_card)
				System.out.println("Send customer to section 1B");
			else
				System.out.println("Send customer to section 1D");
	}
	void displayCustomerInfo() {
			System.out.println("Customer Name is: " +cust_Name);
			if(bill == true && carry_Bag == true)
				System.out.println("Customer wants bill and carry Bag");
			else
				System.out.println("Customer does not want bill and Carry Bag");
			
	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(15);
		mall.customerName("Suvela");
		mall.haveCarryBag(true);
		mall.needBill(false);
		mall.paymentDoneUsing("visa card", "cash");
		mall.displayCustomerInfo();
		mall.decideSection("visa card");

	}

}
