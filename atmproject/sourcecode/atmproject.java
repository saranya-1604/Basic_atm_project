import java.util.Scanner;
class Argu{
	long ac;
	double balance;
	Argu()
	{
		
	}
	public Argu(long ac,double balance) {
		super();
		this.ac=ac;
		this. balance =  balance;
		
	}
	
}
class Savings extends Argu{
	
	Savings(){
		
	}
	 Savings(long ac,double  balance){
		 super(ac,  balance);
		 System.out.println("You are in Savings Account....");
		 System.out.println("Ac no :"+ac);
		 System.out.println("Balance:"+balance);
		 
	 }
	
	
	
	
	 void deposite(double amount) {
		 
		 balance=balance+amount;
		 System.out.println("Depositing amount:"+amount);
		System.out.println("In savings, Balance is:"+balance);	}
	  void withdraw(double amount) {
		System.out.println("withdrawing amount:"+amount);
		balance=balance-amount;
		System.out.println("In savings, Balance is:"+balance);
		
	}
}
class CreditCard extends Argu{
	
	CreditCard(){
		
	}
	CreditCard(long ac,double amount){
		 super(ac, amount);
		 System.out.println("You are in CreditCard Account....");
		 System.out.println("Ac no :"+ac);
		 System.out.println("Balance:"+balance);
		
	 }
		 
	
	 void deposite(double amount) {
		 balance=balance-amount;
		 System.out.println("Depositing amount:"+amount);
		System.out.println("In Creditcard, Balance is:"+balance);	}
	 void withdraw(double amount) {
		 balance=balance+amount;
		 System.out.println("withdrawing amount:"+amount);
		System.out.println("In Creditcard, Balance is:"+balance);
		
	}
	
}

public class Homework {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of the ac(Savings or CreditCard)");
        String actype=sc.nextLine();
        System.out.println(actype);
        if(actype.equals("Savings"))
        {	
           System.out.println("Enter the ac number ");
           long acno=sc.nextLong();
           System.out.println("Enter the balance");
           double bal=sc.nextDouble();
           sc.nextLine();
           Savings sa=new Savings(acno,bal);
           System.out.println("Enter the operation you want to perform (Deposite or Withdraw)");
           String ope=sc.nextLine();
           if(ope.equals("Withdraw"))
           {
        	   System.out.println("Enter the amount"); 
               double wa=sc.nextDouble();
               sa.withdraw(wa);
           }
           else
           { 
        	   System.out.println("Enter the amount"); 
               double da=sc.nextDouble();
               sa.deposite(da);
           }
        }    
        else
        {
        	System.out.println("Enter the ac number ");
            long acno=sc.nextLong();
            System.out.println("Enter the balance");
            double bal=sc.nextDouble();
            sc.nextLine();
            CreditCard cc= new CreditCard(acno,bal);
            System.out.println("Enter the operation you want to perform (Deposite or Withdraw)");
            String ope=sc.nextLine();
            if(ope.equals("Withdraw"))
            {
         	   System.out.println("Enter the amount"); 
                double wa=sc.nextDouble();
                cc.withdraw(wa);
            }
            else
            { 
         	   System.out.println("Enter the amount"); 
                double da=sc.nextDouble();
                cc.deposite(da);
            }
       
       
        
	}
        sc.close();

}}
