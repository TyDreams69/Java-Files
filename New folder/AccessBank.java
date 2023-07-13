

     public class AccessBank
     {
          private String name;
          private double balance;

          public AccessBank(String name, double balance)
          {
              this.name = name;
              
              if(balance > 0)
              this.balance = balance;
          } 
          
          public void setName(double balance)
          {
              if(balance > 0)
              this.balance = balance;
          }

          public void setName(String name)
          {
              this.name = name;
          }

          public String getName()
          {
               return name;
          }

          public double getBalance()
          {
               return balance;
          }

          public void deposit(double depositAmt)
          {
              if(depositAmt > 0.0)
              balance = balance + depositAmt;
          }

          public void withdraw(double withdrawal)
          {
           
              if(withdrawal > 0.0 && withdrawal < balance )
                 balance = balance - withdrawal;
              
              else
              System.out.print("Withdrawal amount exceeded account balance!!!.");
          }
                   

     }
 