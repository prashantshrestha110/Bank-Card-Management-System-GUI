
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class CreditCard extends BankCard
{
   private int CVCnumber;
   private double CreditLimit;
   private double InterestRate;
   private String ExpirationDate;
   private int GracePeriod;
   private boolean IsGranted;
   // Constructors
   public CreditCard(int CardId,String ClientName, String issuerBank,String BankAccount, int BalanceAmount,int CVCnumber, double InterestRate, String ExpirationDate)
   {
       super(BalanceAmount,CardId,BankAccount,issuerBank);
       super.setClientName(ClientName);
       this.CVCnumber=CVCnumber;
       this.InterestRate=InterestRate;
       this.ExpirationDate=ExpirationDate;
       this.IsGranted=false;
    }
    //getters method-->instance variable: CVCnumber
    public int  getCVCnumber()
    {
        return this.CVCnumber;
    }
    //getters method-->instance variable:CreditLimit
    public double getCreditLimit()
    {
        return this.CreditLimit;
    }
    //getters method--> instance variable:InterestRate
    public double getInterestRate()
    {
        return this.InterestRate;
    }
    //getters method--> instance variable:ExpirationDate
    public String ExpirationDate()
    {
        return this.ExpirationDate;
    }
     
    public int getGracePeriod()
    {
        return this.GracePeriod;
    }
    //getters method-->instance variable:IsGranted
    public boolean getIsGranted()
    {
        return this.IsGranted;
    }
    //setters method--> CreditLimit
    public void setCreditLimit(int newCreditLimit, int newGracePeriod)
    {
        if(this.CreditLimit<= super.getBalanceAmount()*2.5)
        {
            this.CreditLimit=newCreditLimit;
            this.GracePeriod=newGracePeriod;
            this.IsGranted=true;
        }
        else
        {
           System.out.println("Sorry, your credit cannot be issued");

        }
    }
     // Method to cancel Credit Card
    public void cancelCreditCard()
        {
            this.CVCnumber=0;
            this.CreditLimit=0;
            this.GracePeriod=0;
            this.IsGranted=false;
            System.out.println("Your Credit Card has been canceled.");
        }
    //Display Method
    public void display()
        {
            super.display();
            if(this.IsGranted==true)
            {
                System.out.println("Your Credit Limit is:" +this.CreditLimit);
                System.out.println("Your Grace Period is:" +this.GracePeriod);

            }
            else
            {

                System.out.println("Credit Card has not been granted yet.");
            }

        }
    }