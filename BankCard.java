

/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    private String ClientName;
    private String IssuerBank;
    private String BankAccount;
    private int BalanceAmount;
    private int CardId;
    
    
    //Constructors
    public BankCard(int balanceamount, int cardId ,String bankaccount,String issuerbank)
    {
        this.CardId= cardId;
        this.BalanceAmount= balanceamount;
        this.BankAccount= bankaccount;
        this.IssuerBank= issuerbank;
        this.ClientName=" ";
    }
    
    //Getters method--> instance variable:ClientName
    public String getClientName()
    {
        return this.ClientName;
    }
    //Getters method--> instance variable: IssuerBank
    public String getIssuerBank()
    {
        return this.IssuerBank;
    }
    // Getters method -->instance variable: CardId
    public int getCardId()
    {
        return this.CardId;
    }
    //Getters method--> insatance variable: BalanceAmount
    public int getBalanceAmount()
    {
        return this.BalanceAmount;
    }
    //Getters method--> instance variable: BankAccount
    public String getBankAccount()
    {
        return this.BankAccount;
    }
    // Setters method-->ClientName
    public void setClientName(String clientname)
    {
        this.ClientName= clientname;
    }
    // Setters Method-->BalanceAmount
    public void setBalanceAmount(int  balanceamount)
    {
        this.BalanceAmount= balanceamount;
    }
    // Display method
    public void display()
    {
        System.out.println("Issused by:" +IssuerBank);
        System.out.println("Card number is:" +CardId);
        System.out.println("Amount is:" +BalanceAmount);
        System.out.println("Account name is:" +BankAccount);
        if (this.ClientName == " ")
        {
            System.out.println("Error" +this.ClientName);
        }
        else
        {
            System.out.println("name is" +this.ClientName);
        }
    }
    
}
