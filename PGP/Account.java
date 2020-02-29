class Account 
{
 long acno;
 String name;
 float bal;

 /* ---- constructor ---- */
 Account(long acno, String name, float amt){
	 this.acno = acno;
	 this.name = name;
	 this.bal = amt;
 }

 /* -- deposit amount method ---- */
 void deposit(float amt){
	 this.bal = this.bal + amt;
	 System.out.println("Rs."+ amt+" deposited | Balance: "+this.bal);
 }

 /* ---- withdraw method ---- */
 void withdraw(float amt){
	 if(this.bal >= amt){
		 this.bal -= amt;
		 System.out.println("Rs."+amt+" debitted | Balance: "+this.bal);
	 }
	 else{
		 System.out.println("ERROR: Insufficient Balance!!");
	 }
 }

 /* --- getBalance balance --- */
 void getBalance(){
	 System.out.println("A/C No: "+this.acno+" | Name: "+this.name+" | Balance: " +this.bal);
 }
}
