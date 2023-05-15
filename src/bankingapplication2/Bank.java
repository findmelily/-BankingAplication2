
package bankingapplication2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }
    
    public void listAccount(){
        System.out.println("Hello");
    }
    
    public void openAccount(int accountNumber, String accountName, double balance){
        Connection connection = BankingConnection.connect();
        String sql = "INSERT INTO account(accNumber, accName, accBalance)"
                    + "VALUES(?,?,?,?,?)";
  
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountNumber);
            preparedStatement.setString(2, accountName);
            preparedStatement.setDouble(3, balance);
        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
