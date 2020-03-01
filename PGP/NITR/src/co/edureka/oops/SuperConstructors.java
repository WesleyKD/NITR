package co.edureka.oops;
class Account{
	Account(){		
		System.out.println("Inside Account constructor");
	}
}

class SavingsAccount extends Account {
	SavingsAccount(){		
		System.out.println("Inside SavingsAccount constructor");
	}
}

public class SuperConstructors {

	public static void main(String[] args) {
		SavingsAccount acc = new SavingsAccount();
	}

}
