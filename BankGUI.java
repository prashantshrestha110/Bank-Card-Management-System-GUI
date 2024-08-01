
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class BankGUI implements ActionListener
 {
    //declare all the components here
    private JFrame MyFrame;
    private ArrayList<BankCard> Details = new ArrayList();

    private JButton AddtoCreditcardButton,SetCreditLimitButton,CancelCreditcardButton,DisplayButton, DisplayButton1,ClearButton,AddtoDebitcardButton,WithdrawCashButton;

    private JLabel BankGUILabel,CreditcardLabel,Creditcard,DetailsLabel,CardId1Label,CVCNumber1Label,clientname1Label,IssuerBank1Label,BankAccount1Label,Balanceamount1Label,
    InterestRate1Label,CardId2Label,CreditLimit1Label,graceperiod1Label,ExpirationDate1Label,DebitcardLabel,CardId3Label,clientname2Label,IssuerBank2Label,BankAccount2Label,PINNumber2Label,
    Balanceamount2Label,CardId4Label,PINNumber1Label,WithdrawalAmountLabel,WithdrawalDateLabel;

    private JTextField CardIdText,CVCNumberText,clientnameText,IssuerBankText,BankAccountText,BalanceamountText,InterestRateText,CardId1Text,CreditLimitText,
    graceperiodText,CardId2Text,clientname1Text,IssuerBank1Text,BankAccount1Text,PINNumberText,Balanceamount1Text,CardId3Text,PINNumber1Text,WithdrawalAmountText;

    private JComboBox<String> DayList,MonthList,YearList,Day2List,Month2List,Year2List;

    public BankGUI(){
        //create the code to write GUI
        MyFrame = new JFrame();
        BankGUILabel = new JLabel("BANK GUI");
        BankGUILabel.setBounds(736,36,97,60);
        MyFrame.getContentPane().setBackground(Color.PINK);

        // ----creating Credit Card components

        //JLabel for Credit Card
        CreditcardLabel = new JLabel("CREDIT CARD ");
        CardId1Label = new JLabel("Card ID");
        CVCNumber1Label = new JLabel("CVC Number");
        clientname1Label = new JLabel("Client Name");
        IssuerBank1Label = new JLabel("Issuer Bank");
        BankAccount1Label = new JLabel("Bank Account");
        Balanceamount1Label = new JLabel("Balance Amount");
        InterestRate1Label = new JLabel("Interest Rate");
        CardId2Label = new JLabel("Card ID");
        CreditLimit1Label = new JLabel("Credit Limit");
        graceperiod1Label = new JLabel("Grace Period");
        ExpirationDate1Label = new JLabel("Expiration Date");

        //setBounds for Credit Card jlabel
        CreditcardLabel.setBounds(1149,131,117,48);
        CardId1Label.setBounds(919,228,75,35);
        CardId2Label.setBounds(934,616,55,25);
        CVCNumber1Label.setBounds(1191,225,88,35);
        clientname1Label.setBounds(910,271,93,20);
        IssuerBank1Label.setBounds(910,327,97,20);
        BankAccount1Label.setBounds(897,368,97,35);
        Balanceamount1Label.setBounds(892,414,102,35);
        InterestRate1Label.setBounds(1191,270,93,35);
        ExpirationDate1Label.setBounds(1179,315,105,35);
        CreditLimit1Label.setBounds(922,661,79,20);
        graceperiod1Label.setBounds(905,707,99,20);

        //JTextField for Credit Card
        CardIdText = new JTextField();
        CVCNumberText = new JTextField();
        clientnameText = new JTextField();
        IssuerBankText = new JTextField();
        BankAccountText = new JTextField();
        BalanceamountText = new JTextField();
        InterestRateText = new JTextField();
        CardId1Text = new JTextField();
        CreditLimitText = new JTextField();
        graceperiodText = new JTextField();

        //setBounds for Credit Card jtextfield
        CardIdText.setBounds(1003,235,95,25);
        clientnameText.setBounds(1003,281,95,25);
        IssuerBankText.setBounds(1007,327,95,25);
        BankAccountText.setBounds(1007,373,95,25);
        BalanceamountText.setBounds(1007,419,95,25);
        CVCNumberText.setBounds(1297,230,95,25);
        InterestRateText.setBounds(1297,276,95,25);
        CardId1Text.setBounds(1019,612,95,25);
        CreditLimitText.setBounds(1023,656,95,25);
        graceperiodText.setBounds(1023,702,95,25);

        //JComboBox for Credit Card
        String[] Years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        YearList = new JComboBox<String>(Years);
        String[] Months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        MonthList = new JComboBox<String>(Months);
        String[] Days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        DayList = new JComboBox<String>(Days);

        //setBounds for Credit Card jcombo box
        YearList.setBounds(1297,322,73,32);
        MonthList.setBounds(1391,322,73,32);
        DayList.setBounds(1485,322,73,32);

        //adding the Label of Credit Card
        MyFrame.add(CreditcardLabel);
        MyFrame.add(CardId1Label);
        MyFrame.add(CardId2Label);
        MyFrame.add(CVCNumber1Label);
        MyFrame.add(clientname1Label);
        MyFrame.add(ExpirationDate1Label);
        MyFrame.add(IssuerBank1Label);
        MyFrame.add(BankAccount1Label);
        MyFrame.add(Balanceamount1Label);;
        MyFrame.add(InterestRate1Label);
        MyFrame.add(ExpirationDate1Label);
        MyFrame.add(CreditLimit1Label);
        MyFrame.add(graceperiod1Label);
        MyFrame.add(BankGUILabel);
        MyFrame.add(CreditcardLabel);

        //adding the TextField of Credit Card
        MyFrame.add(CardIdText);
        MyFrame.add(CardId1Text);
        MyFrame.add(CVCNumberText);
        MyFrame.add(clientnameText);
        MyFrame.add(IssuerBankText);
        MyFrame.add(BankAccountText);
        MyFrame.add(BalanceamountText);
        MyFrame.add(InterestRateText);
        MyFrame.add(CreditLimitText);
        MyFrame.add(graceperiodText);

        // adding credit card combo box
        MyFrame.add(DayList);
        MyFrame.add(MonthList);
        MyFrame.add(YearList);

        // ----creating debit card components
        //JLabel for Debit Card
        DebitcardLabel = new JLabel("DEBIT CARD ");
        CardId3Label = new JLabel("Card ID");
        clientname1Label = new JLabel("Client Name");
        IssuerBank1Label = new JLabel("Issuer Bank");
        BankAccount1Label = new JLabel("Bank Account");
        PINNumber2Label = new JLabel("PIN Number");
        Balanceamount1Label = new JLabel("Balance Amount");
        CardId4Label = new JLabel("Card ID");
        PINNumber1Label = new JLabel("PIN Number");
        WithdrawalAmountLabel = new JLabel("Withdrawal Amount");
        WithdrawalDateLabel = new JLabel("Withdrawal Date");

        //setBounds for Debit Card jlabel

        DebitcardLabel.setBounds(249,155,114,35);
        CardId3Label.setBounds(115,250,75,35);
        CardId4Label.setBounds(94,615,44,20);
        clientname1Label.setBounds(107,300,93,35);
        IssuerBank1Label.setBounds(102,358,97,20);
        BankAccount1Label.setBounds(102,401,97,35);
        Balanceamount1Label.setBounds(342,248,115,35);
        PINNumber2Label.setBounds(342,308,95,20);
        PINNumber1Label.setBounds(95,650,95,20);
        WithdrawalAmountLabel.setBounds(70,695,124,20);
        WithdrawalDateLabel.setBounds(75,731,115,26);

        //JTextField for Debit Card
        CardId2Text = new JTextField();
        clientname1Text = new JTextField();
        IssuerBank1Text = new JTextField();
        BankAccount1Text = new JTextField();
        PINNumberText = new JTextField();
        Balanceamount1Text = new JTextField();
        CardId3Text = new JTextField();
        PINNumber1Text = new JTextField();
        WithdrawalAmountText = new JTextField();

        //set bounds for debit card jtextfield
        CardId2Text.setBounds(199,260,95,25);
        clientname1Text.setBounds(199,308,95,25);
        IssuerBank1Text.setBounds(199,356,95,25);
        BankAccount1Text.setBounds(199,407,95,25);
        PINNumberText.setBounds(456,308,95,25);
        Balanceamount1Text.setBounds(456,253,95,25);
        CardId3Text.setBounds(211,600,95,25);
        PINNumber1Text.setBounds(211,645,95,25);
        WithdrawalAmountText.setBounds(211,695,95,20);

        //JComboBox for Debit Card
        String[] Year = {  "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        Year2List = new JComboBox<String>(Year);
        String[] Month = {  "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        Month2List = new JComboBox<String>(Month);
        String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        Day2List = new JComboBox<String>(Day);

        //set bounds for debitcard combo box
        Day2List.setBounds(409,745,73,32);
        Month2List.setBounds(310,745,73,32);
        Year2List.setBounds(211,745,73,32);

        //adding the Label of Debit Card
        MyFrame.add(DebitcardLabel);
        MyFrame.add(CardId3Label);
        MyFrame.add(CardId4Label);
        MyFrame.add(clientname1Label);
        MyFrame.add(IssuerBank1Label);
        MyFrame.add(BankAccount1Label);
        MyFrame.add(Balanceamount1Label);
        MyFrame.add(PINNumber1Label);
        MyFrame.add(PINNumber2Label);
        MyFrame.add(WithdrawalAmountLabel);
        MyFrame.add(WithdrawalDateLabel);

        // adding text field of debitcard
        MyFrame.add(CardId2Text);
        MyFrame.add(CardId3Text);
        MyFrame.add(clientname1Text);
        MyFrame.add(IssuerBank1Text);
        MyFrame.add(BankAccount1Text);
        MyFrame.add(Balanceamount1Text);
        MyFrame.add(PINNumberText);
        MyFrame.add(PINNumber1Text);
        MyFrame.add(WithdrawalAmountText);

        //adding the JComboBox for debit card
        MyFrame.add(Day2List);
        MyFrame.add(Month2List);
        MyFrame.add(Year2List);

        //JButton for Credit Card and Debit card
        AddtoCreditcardButton = new JButton("Add to Credit Card");
        SetCreditLimitButton = new JButton("Set Credit Limit");
        CancelCreditcardButton = new JButton("Cancel Credit Card");
        DisplayButton = new JButton("Display");
        DisplayButton1 = new JButton("Display");
        ClearButton = new JButton("Clear");
        AddtoDebitcardButton = new JButton("Add to Debit Card");
        WithdrawCashButton = new JButton("Withdraw From Debit Card");

        //setBounds for jbutton
        AddtoDebitcardButton.setBounds(386,391,140,32);
        WithdrawCashButton.setBounds(235,819,200,32);
        AddtoCreditcardButton.setBounds(1279,410,140,32);
        SetCreditLimitButton.setBounds(1174,612,140,32);
        CancelCreditcardButton.setBounds(1174,665,140,32);
        DisplayButton.setBounds(469,474,115,35);
        DisplayButton1.setBounds(1312,469,115,35);
        ClearButton.setBounds(708,819,98,32);

        //adding the JButton to the JFrame for Credit Card and Debit Card
        MyFrame.add(AddtoCreditcardButton);
        MyFrame.add(AddtoDebitcardButton);
        MyFrame.add(SetCreditLimitButton);
        MyFrame.add(CancelCreditcardButton);
        MyFrame.add(WithdrawCashButton);
        MyFrame.add(ClearButton);
        MyFrame.add(DisplayButton);
        MyFrame.add(DisplayButton1);  
        
        //
        AddtoDebitcardButton.addActionListener(this);
        AddtoCreditcardButton.addActionListener(this);
        SetCreditLimitButton.addActionListener(this);
        CancelCreditcardButton.addActionListener(this);
        WithdrawCashButton.addActionListener(this);
        ClearButton.addActionListener(this);
        DisplayButton.addActionListener(this);
        DisplayButton1.addActionListener(this);
        
        MyFrame.setSize(1700,1000);
        MyFrame.setLayout(null);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setResizable(false);
        MyFrame.setVisible(true);
    }
    //implement the method of the

    //ActionListener

    public void actionPerformed(ActionEvent e)
{
         // Check if the source of the event is the "AddtoDebitcardButton" button
        if(e.getSource() == AddtoDebitcardButton)
          // Check if the "Details" list is empty
        if (Details.isEmpty())
               // Show a message dialog if the text fields are empty
            JOptionPane.showMessageDialog(MyFrame, "Text fields are empty", "warning", JOptionPane.INFORMATION_MESSAGE);
         {
           try{
               // Extract information from the text fields and convert them to their corresponding data types
            String balanceAmount = Balanceamount1Text.getText();
            int BalanceAmount = Integer.parseInt(balanceAmount);

            String cardID = CardId2Text.getText();
            int CardID = Integer.parseInt(cardID);

            String bankAccount =BankAccount1Text.getText();
            String issuerBank = IssuerBank1Text.getText();
            String clientName = clientname1Text.getText();

            String pinNumber =PINNumberText.getText();
            int PinNumber = Integer.parseInt(pinNumber);
             // Create a new DebitCard object using the extracted information
            DebitCard debitCardDetails = new DebitCard(BalanceAmount, CardID, bankAccount, issuerBank, clientName,PinNumber);

            boolean isAdded = false;
             // Create a new DebitCard object using the extracted information
            if(Details.isEmpty()){
                Details.add(debitCardDetails);
                JOptionPane.showMessageDialog(MyFrame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
          
             else
            {
              // If the "Details" list is not empty, loop through each element of the list and check if the current card ID matches any previously added card ID
            for (BankCard debtcard : Details){
                if(CardID == debtcard.getCardId()){
                     // If there is a match, show a message dialog indicating that the card has already been added
                    JOptionPane.showMessageDialog(MyFrame, "Card has already been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    isAdded = false;
                }
                else{
                    isAdded = true;
                }
            }
             // If there is no match, add the current DebitCard object to the "Details" list and show a success message dialog
            if(isAdded == true){
                Details.add(debitCardDetails);
                JOptionPane.showMessageDialog(MyFrame, "Card is not  added", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
             }
           }
         catch(NumberFormatException nfe){
                // Catch a NumberFormatException and show an error message dialog if the user enters an invalid input format
        JOptionPane.showMessageDialog(MyFrame, "Unacceptable Input Format. Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
       }
        //Function to Withdraw Cash Button

        
        if(e.getSource() == AddtoCreditcardButton){
            try{
                //Get values from text fields
                String cardid = CardIdText.getText();
                int CardID1 = Integer.parseInt(cardid);

                String clientname = clientnameText.getText();
                String issuerbank = IssuerBankText.getText();
                String bankaccount = BankAccountText.getText();

                String balanceamount = BalanceamountText.getText();
                int BalanceAmount = Integer.parseInt(balanceamount);

                String cvcNumber = CVCNumberText.getText();
                int CvcNumber = Integer.parseInt(cvcNumber);

                String interestRate = InterestRateText.getText();
                double interestRateDouble = Double.parseDouble(interestRate);

                String year1 = (String)YearList.getSelectedItem();
                String month1 = (String)MonthList.getSelectedItem();
                String day1 = (String) DayList.getSelectedItem();
                String dateofexp = (year1 + month1 + day1);

                CreditCard creditCardDetails = new CreditCard(CardID1, clientname, issuerbank, bankaccount, BalanceAmount, CvcNumber,interestRateDouble,dateofexp);

                boolean isAdded = false;
                if(Details.isEmpty()){
                    // If no cards are added, add the credit card and display a success message
                    Details.add(creditCardDetails);
                    JOptionPane.showMessageDialog(MyFrame, "Card has not been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    for(BankCard creditcard : Details){
                        if(CardID1 ==creditcard.getCardId()){
                            // If the card with the same ID is already added, display a message 
                            JOptionPane.showMessageDialog(MyFrame, "Card has already been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                            isAdded = false;
                        }
                        else{
                            isAdded = true;
                        }
                    }
                    if(isAdded == true){
                        // If the card is not already added, add the credit card and display a success message
                        Details.add(creditCardDetails);
                        JOptionPane.showMessageDialog(MyFrame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(MyFrame, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //function of Display button 
        // This code block is executed when DisplayButton1 is clicked
         if(e.getSource() == DisplayButton1){
             // Check if there are any CreditCards added
            if(Details.isEmpty()){
                   // Display an error message if there are no CreditCards
                JOptionPane.showMessageDialog(MyFrame, "Sorry, no CreditCard has been added ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                 // Iterate through the list of BankCards to display CreditCard details
                for(BankCard displaycredit: Details){
                    // Check if the current card is a CreditCard
                    if(displaycredit instanceof CreditCard){
                          // Display a success message before showing the details
                        JOptionPane.showMessageDialog(MyFrame, "The details of Credit Card has been displayed", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("\n");
                        // Call the display method for the CreditCard object
                        ((CreditCard)displaycredit).display();
                        System.out.println("\n");
                    }
                }
            }

        }
        
        //function of setcreditlimit button
       
        // This code block is executed when SetCreditLimitButton is clicked
       if(e.getSource() == SetCreditLimitButton)
        {
            if(CardId1Text.getText().isEmpty() || CreditLimitText.getText().isEmpty() || graceperiodText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(MyFrame,"Text Empty","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int cardid = Integer.parseInt(CardId1Text.getText());
                    double creditlimit = Double.parseDouble(CreditLimitText.getText());
                    int newgraceperiod = Integer.parseInt(graceperiodText.getText());
                    boolean car = false;
                    for(BankCard credit : Details)
                    {
                        if(credit instanceof CreditCard)
                        {
                            CreditCard c =(CreditCard) credit;
                            if(cardid == c.getCardId())
                            {
                                car = true;
                                if(creditlimit <= 2.5* c.getBalanceAmount())
                                {
                                    c.setCreditLimit(cardid,newgraceperiod);
                                    JOptionPane.showMessageDialog(MyFrame,"Successfull","Alert",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                    JOptionPane.showMessageDialog(MyFrame,"Credit Limit is too high","Alert",JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            }
                            else
                            {
                                car = false;
                            }
                        }
                    }
                    if (car==false)
                    {
                        JOptionPane.showMessageDialog(MyFrame,"No Card ID","Alert",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(MyFrame,"Number format Exception","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        

        
        // function of cancel credit card button
        // This code block is executed when CancelCreditcardButton is clicked
        if(e.getSource() == CancelCreditcardButton){
            try{
                //Get values from text fields
                String cardid2 = CardId1Text.getText();
                int Cardid1 = Integer.parseInt(cardid2);
                
                // Check if there are any CreditCards added

                if(Details.isEmpty()){
                         // Display an error message if there are no CreditCards
                    JOptionPane.showMessageDialog(MyFrame, "Cannot set Credit Limit, Credit Card is not added", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                else{
                         // Iterate through the list of BankCards to find the CreditCard with the specified ID
                    for(BankCard cancelcard: Details){
                        if(cancelcard instanceof CreditCard){
                            if(Cardid1 == cancelcard.getCardId()){
                                // Cancel the CreditCard
                                ((CreditCard)cancelcard).cancelCreditCard();
                                JOptionPane.showMessageDialog(MyFrame, "Credit Card is cancelled", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                   // Display an error message if the provided ID is not found
                                JOptionPane.showMessageDialog(MyFrame, "card Id provided does not exist.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }   
                        else{
                                // Display an error message if there are no CreditCards
                            JOptionPane.showMessageDialog(MyFrame, "Credit Card Not Found", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException nfe){
                     // Display an error message if the input values are not valid
                JOptionPane.showMessageDialog(MyFrame, "information  cannot be accepted", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    
        
        // function of withdrawl cash button 
        
        if (e.getSource() == WithdrawCashButton){
            try{
                //Get values from text fields
                String cardID12 = CardId3Text.getText();
                int CarddID1 = Integer.parseInt(cardID12);

                String PinNumber = PINNumber1Text.getText();
                int pinNumber1 = Integer.parseInt(PinNumber);

                String withdrawalAmount = WithdrawalAmountText.getText();
                int WithdrawalA = Integer.parseInt(withdrawalAmount);

                String year = (String)Year2List.getSelectedItem();
                String month = (String)Month2List.getSelectedItem();
                String day = (String)Day2List.getSelectedItem();
                String dateofwithdrawal = (year + month + day);

                if(Details.isEmpty()){
                    // If no DebitCard is added, display an error message
                    JOptionPane.showMessageDialog(MyFrame, "Cannot Withdraw, DebitCard has not been added", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    for(BankCard withdrawCards : Details)
                    {
                        if(withdrawCards instanceof DebitCard){
                            if(CarddID1 == withdrawCards.getCardId()){
                                if(pinNumber1 == ((DebitCard) withdrawCards) .getPINnumber()){
                                    if(WithdrawalA <= ((DebitCard) withdrawCards).getBalanceAmount()){
                                         // Withdraw the amount from the DebitCard
                                        ((DebitCard) withdrawCards).Withdraw(WithdrawalA, dateofwithdrawal, pinNumber1);
                                        JOptionPane.showMessageDialog(MyFrame, "The amount has been withdrawn successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        // If withdrawal amount is greater than the balance, display an error message
                                        JOptionPane.showMessageDialog(MyFrame, "Insufficient Balance", "Alert", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                else{
                                    // If entered pin number is incorrect, display an error message
                                    JOptionPane.showMessageDialog(MyFrame, "Incorrect Pin Number", "Error", JOptionPane.ERROR_MESSAGE); 
                                }
                            }
                            else{
                                // If DebitCard with given ID is not found, display an error message
                                JOptionPane.showMessageDialog(MyFrame, "  DebitCard with given Id has not been found", "Error", JOptionPane.ERROR_MESSAGE);
                            }    
                        }
                        else{
                            // If DebitCard is not found, display an error message
                            JOptionPane.showMessageDialog(MyFrame, "DebitCard NOT FOUND", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                }
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(MyFrame, "The information you provided can not be accepted", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        // function of displaybutton
        // This code block is executed when DisplayButton is clicked
        if(e.getSource() == DisplayButton){
            // Check if there are any DebitCards added
            if(Details.isEmpty()){
                   // Display an error message if there are no DebitCards
                JOptionPane.showMessageDialog(MyFrame, "Sorry, no DebitCard has been added ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                 // Iterate through the list of BankCards to find the DebitCard and display its details
                for(BankCard displaydebit: Details){
                    if(displaydebit instanceof DebitCard){
                        JOptionPane.showMessageDialog(MyFrame, "The details of Debit Card has been displayed", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("\n");
                        ((DebitCard)displaydebit).display();
                        System.out.println("\n");
                    }
                }
            }
        }
       
        
        
        
        
        
        // Function to Clear Button
        if (e.getSource() == ClearButton)
        {
            CardIdText.setText(" ");
            CVCNumberText.setText(" ");
            clientnameText.setText(" ");  
            IssuerBankText.setText(" ");  
            BankAccountText.setText(" ");
            BalanceamountText.setText(" ");  
            InterestRateText.setText(" ");  
            CardId1Text.setText(" ");
            CreditLimitText.setText(" ");
            graceperiodText.setText(" ");
            CardId2Text.setText(" ");
            clientname1Text.setText(" ");
            IssuerBank1Text.setText(" ");  
            BankAccount1Text.setText(" ");  
            PINNumberText.setText(" ");  
            Balanceamount1Text.setText(" ");  
            CardId3Text.setText(" ");
            PINNumber1Text.setText(" ");
            WithdrawalAmountText.setText(" ");

        }
    
  }
  public static void main(String[]args){
        new BankGUI();
    
}
}
