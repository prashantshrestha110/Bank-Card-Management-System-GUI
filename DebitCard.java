
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateOfWithdrawal;
    private boolean HasWithdrawn;
    // constructors
    public DebitCard(int balanceamount, int cardid, String bankaccount,String issuerbank, String Clientname,int PinNumber)
    {
        super (balanceamount, cardid,bankaccount,issuerbank);
        super.setClientName(Clientname);
        this.PINnumber=PinNumber;
        this.HasWithdrawn=false;
    }
        
        //Getters method-->PINnumber
        public int getPINnumber()
        {
            return this.PINnumber;
        }
        // Getters method-->WithdrawalAmount
        public int getWithdrawalAmount()
        {
            return this.WithdrawalAmount;
        }
        // Getters method-->DateOfWithdrawal
        public String getDateOfWithdrawal()
        {
            return this.DateOfWithdrawal;
        }
        // Getters method-->HasWithdrawn
        public boolean getHaswithdrawn()
        {
            return this.HasWithdrawn;
        }
         public void setWithdrawalAmount(int WithdrawalAmount)
         {
             this.WithdrawalAmount= WithdrawalAmount;
         }
         public void Withdraw(int WithdrawalAmount,String dateofwithdrawal,int pinNumber)
         {
         // 
             if (this.PINnumber==pinNumber)
             {
             //
             if (super.getBalanceAmount()>= WithdrawalAmount)
             {
                 //
                 super.setBalanceAmount(super.getBalanceAmount()-WithdrawalAmount);
                 this.WithdrawalAmount=WithdrawalAmount;
                 this.DateOfWithdrawal=dateofwithdrawal;
                 this.HasWithdrawn=true;
                 {
                     System.out.println("Your Withdrawal was sucessfull, new balance amount is" +getBalanceAmount());
                 }
             }
             //
             else
             {
                 System.out.println("Your withdrawal was not successful, please check your balance amount");
             }            
            }
            else
            {
                System.out.println("The entered PIN number was invalid, please try again");
            }
         }
         //Display method 
         public void display()
         {
             super.display();
             System.out.println("New pin is "+ PINnumber);
             if(this.HasWithdrawn==true)
             {
                 System.out.println("Your Pin Number is:" +this.PINnumber);
                 System.out.println("The Withdrawal amount is:" +this.WithdrawalAmount);
                 System.out.println("The date of Withdrawn is :" +this.DateOfWithdrawal);
             }
             else
             {
                 System.out.println("Your balance amount is:" +super.getBalanceAmount());
             }
         }

    }

