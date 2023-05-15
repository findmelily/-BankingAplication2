
package bankingapplication2;


public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }
    
    public void listAccount(){
        System.out.println("Hello");
    }
    
    public void openAccount(int accountNumber, String accountName){
        System.out.println("Hello");
    }
    
    public void closeAccount(int accountNumber){
        System.out.println("Hello");
    }
    
    public void depositMoney(int accountNumber,double amount){
        System.out.println("Hello");
    }
    
    public void withdrawMoney(int accountNumber,double amount){
        System.out.println("Hello");
    }
}
