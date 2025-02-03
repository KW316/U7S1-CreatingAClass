package partA.ex01;

public class CheckingAccount {
    public double balance;
    public String name;

    public void deposit(int x){
        balance += x;
    }

    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + balance);

    }

}
