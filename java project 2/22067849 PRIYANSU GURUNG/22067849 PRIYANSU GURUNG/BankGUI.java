//imports classes amd methods of frpm java package
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
public class BankGUI implements ActionListener//implements the action listener interface
{
    //declares all componenets in the GUI
    private JFrame frame;
    private JPanel panel1,panel2,panel3;
    private JLabel BankCardForm_Lb,DebitCard_Lb,CreditCard_Lb,CardId_Lb,ClientName_Lb,IssuerBank_Lb,BankAccount_Lb,BalanceAmount_Lb,PinNumber_Lb,WithdrawalAmount_Lb,CvcNumber_Lb,CreditLimit_Lb,InterestRate_Lb,GracePeriod_Lb,WithdrawalDate_Lb,ExpirationDate_Lb;
    private JTextField CardId_Tf,ClientName_Tf,IssuerBank_Tf,BankAccount_Tf,BalanceAmount_Tf,PinNumber_Tf,WithdrawalAmount_Tf,CvcNumber_Tf,CreditLimit_Tf,InterestRate_Tf,GracePeriod_Tf;
    private JComboBox <String> WithdrawalDate_year,WithdrawalDate_month,WithdrawalDate_day,ExpirationDate_year,ExpirationDate_month,ExpirationDate_day;
    private JButton add_DebitCard,add_CreditCard,withdraw_DebitCard,set_CreditLimit,cancel_CreditCard,display_DebitCard,clear_DebitCard,display_CreditCard,clear_CreditCard,clear;
    ArrayList<BankCard>al=new ArrayList<BankCard>();
    public BankGUI()//Creates constructor of BankGUI class 
    {
        frame=new JFrame("Bank Registration");//create JFrame object
        
        //creates objects in panel1
        panel1=new JPanel();
        BankCardForm_Lb=new JLabel("BANK CARD REGISTRATION FORM");
        CardId_Lb=new JLabel("Card ID:");
        ClientName_Lb=new JLabel("Client Name:");
        IssuerBank_Lb=new JLabel("Issuer Bank:");
        BankAccount_Lb=new JLabel("Bank Account:");
        BalanceAmount_Lb=new JLabel("Balance Amount:");
        
        //textfields of panel1
        CardId_Tf=new JTextField();
        ClientName_Tf=new JTextField();
        IssuerBank_Tf=new JTextField();
        BankAccount_Tf=new JTextField();
        BalanceAmount_Tf=new JTextField();
        
        //setbounds of panel1
        BankCardForm_Lb.setBounds(320,0,370,25);
        CardId_Lb.setBounds(44,36,71,15);
        ClientName_Lb.setBounds(44,70,86,15);
        IssuerBank_Lb.setBounds(44,105,83,15);
        BankAccount_Lb.setBounds(44,140,91,15);
        BalanceAmount_Lb.setBounds(44,175,109,15);
        
        CardId_Tf.setBounds(176,32,205,23);
        ClientName_Tf.setBounds(176,67,205,23);
        IssuerBank_Tf.setBounds(176,103,205,23);
        BankAccount_Tf.setBounds(176,138,205,23);
        BalanceAmount_Tf.setBounds(176,173,205,23);
        
        //creates objects of panel2
        panel2=new JPanel();
        DebitCard_Lb=new JLabel("Debit Card");
        PinNumber_Lb=new JLabel("PIN Number:");
        WithdrawalAmount_Lb=new JLabel("Withdrawal Amount:");
        WithdrawalDate_Lb=new JLabel("Withdrawal Date:");
        
        PinNumber_Tf=new JTextField();
        WithdrawalAmount_Tf=new JTextField();
        
        //ComboBox 
        WithdrawalDate_year=new JComboBox<String>();
        WithdrawalDate_year.addItem("2015");
        WithdrawalDate_year.addItem("2016");
        WithdrawalDate_year.addItem("2017");
        WithdrawalDate_year.addItem("2018");
        WithdrawalDate_year.addItem("2019");
        WithdrawalDate_year.addItem("2020");
        WithdrawalDate_year.addItem("2021");
        WithdrawalDate_year.addItem("2022");
        WithdrawalDate_year.addItem("2023");
        WithdrawalDate_year.addItem("2024");
        WithdrawalDate_year.addItem("2025");
        
        WithdrawalDate_month=new JComboBox<String>();
        WithdrawalDate_month.addItem("January");
        WithdrawalDate_month.addItem("February");
        WithdrawalDate_month.addItem("March");
        WithdrawalDate_month.addItem("April");
        WithdrawalDate_month.addItem("May");
        WithdrawalDate_month.addItem("June");
        WithdrawalDate_month.addItem("July");
        WithdrawalDate_month.addItem("August");
        WithdrawalDate_month.addItem("September");
        WithdrawalDate_month.addItem("October");
        WithdrawalDate_month.addItem("November");
        WithdrawalDate_month.addItem("December");
        
        WithdrawalDate_day=new JComboBox<String>();
        WithdrawalDate_day.addItem("1");
        WithdrawalDate_day.addItem("2");
        WithdrawalDate_day.addItem("3");
        WithdrawalDate_day.addItem("4");
        WithdrawalDate_day.addItem("5");
        WithdrawalDate_day.addItem("6");
        WithdrawalDate_day.addItem("7");
        WithdrawalDate_day.addItem("8");
        WithdrawalDate_day.addItem("9");
        WithdrawalDate_day.addItem("10");
        WithdrawalDate_day.addItem("11");
        WithdrawalDate_day.addItem("12");
        WithdrawalDate_day.addItem("13");
        WithdrawalDate_day.addItem("14");
        WithdrawalDate_day.addItem("15");
        WithdrawalDate_day.addItem("16");
        WithdrawalDate_day.addItem("17");
        WithdrawalDate_day.addItem("18");
        WithdrawalDate_day.addItem("19");
        WithdrawalDate_day.addItem("20");
        WithdrawalDate_day.addItem("21");
        WithdrawalDate_day.addItem("22");
        WithdrawalDate_day.addItem("23");
        WithdrawalDate_day.addItem("24");
        WithdrawalDate_day.addItem("25");
        WithdrawalDate_day.addItem("26");
        WithdrawalDate_day.addItem("27");
        WithdrawalDate_day.addItem("28");
        WithdrawalDate_day.addItem("29");
        WithdrawalDate_day.addItem("30");
        WithdrawalDate_day.addItem("31");
        
        add_DebitCard=new JButton("Add Debit Card");
        withdraw_DebitCard=new JButton("Withdraw from Debit Card");
        display_DebitCard=new JButton("Display");
        clear_DebitCard=new JButton("Clear");
        
        //setbounds of panel2
        DebitCard_Lb.setBounds(185,14,120,21);
        PinNumber_Lb.setBounds(43,55,84,15);
        WithdrawalAmount_Lb.setBounds(43,139,128,15);
        WithdrawalDate_Lb.setBounds(43,180,109,15);
        
        PinNumber_Tf.setBounds(176,55,174,23);
        WithdrawalAmount_Tf.setBounds(176,138,174,23);
        
        WithdrawalDate_year.setBounds(176,180,67,23);
        WithdrawalDate_month.setBounds(266,180,100,23);
        WithdrawalDate_day.setBounds(390,180,53,23);
        
        add_DebitCard.setBounds(317,99,141,20);
        withdraw_DebitCard.setBounds(268,225,190,22);
        display_DebitCard.setBounds(59,311,77,20);
        clear_DebitCard.setBounds(318,311,68,20);
        
        add_DebitCard.addActionListener(this);
        withdraw_DebitCard.addActionListener(this);
        display_DebitCard.addActionListener(this);
        clear_DebitCard.addActionListener(this);
        
        //creates object for panel3 
        panel3=new JPanel();
        CreditCard_Lb=new JLabel("Credit Card");
        CvcNumber_Lb=new JLabel("CVC Number:");
        CreditLimit_Lb=new JLabel("Credit Limit:");
        InterestRate_Lb=new JLabel("Interest Rate:");
        GracePeriod_Lb=new JLabel("Grace Period:");
        ExpirationDate_Lb=new JLabel("Expiration Date:");
        
        CvcNumber_Tf=new JTextField();
        CreditLimit_Tf=new JTextField();
        InterestRate_Tf=new JTextField();
        GracePeriod_Tf=new JTextField();
        
        ExpirationDate_year=new JComboBox<String>();
        ExpirationDate_year.addItem("2015");
        ExpirationDate_year.addItem("2016");
        ExpirationDate_year.addItem("2017");
        ExpirationDate_year.addItem("2018");
        ExpirationDate_year.addItem("2019");
        ExpirationDate_year.addItem("2020");
        ExpirationDate_year.addItem("2021");
        ExpirationDate_year.addItem("2022");
        ExpirationDate_year.addItem("2023");
        ExpirationDate_year.addItem("2024");
        ExpirationDate_year.addItem("2025");
        
        ExpirationDate_month=new JComboBox<String>();
        ExpirationDate_month.addItem("January");
        ExpirationDate_month.addItem("February");
        ExpirationDate_month.addItem("March");
        ExpirationDate_month.addItem("April");
        ExpirationDate_month.addItem("May");
        ExpirationDate_month.addItem("June");
        ExpirationDate_month.addItem("July");
        ExpirationDate_month.addItem("August");
        ExpirationDate_month.addItem("September");
        ExpirationDate_month.addItem("October");
        ExpirationDate_month.addItem("November");
        ExpirationDate_month.addItem("December");
        
        ExpirationDate_day=new JComboBox<String>();
        ExpirationDate_day.addItem("1");
        ExpirationDate_day.addItem("2");
        ExpirationDate_day.addItem("3");
        ExpirationDate_day.addItem("4");
        ExpirationDate_day.addItem("5");
        ExpirationDate_day.addItem("6");
        ExpirationDate_day.addItem("7");
        ExpirationDate_day.addItem("8");
        ExpirationDate_day.addItem("9");
        ExpirationDate_day.addItem("10");
        ExpirationDate_day.addItem("11");
        ExpirationDate_day.addItem("12");
        ExpirationDate_day.addItem("13");
        ExpirationDate_day.addItem("14");
        ExpirationDate_day.addItem("15");
        ExpirationDate_day.addItem("16");
        ExpirationDate_day.addItem("17");
        ExpirationDate_day.addItem("18");
        ExpirationDate_day.addItem("19");
        ExpirationDate_day.addItem("20");
        ExpirationDate_day.addItem("21");
        ExpirationDate_day.addItem("22");
        ExpirationDate_day.addItem("23");
        ExpirationDate_day.addItem("24");
        ExpirationDate_day.addItem("25");
        ExpirationDate_day.addItem("26");
        ExpirationDate_day.addItem("27");
        ExpirationDate_day.addItem("28");
        ExpirationDate_day.addItem("29");
        ExpirationDate_day.addItem("30");
        ExpirationDate_day.addItem("31");
        
        add_CreditCard=new JButton("Add Credit Card");
        set_CreditLimit=new JButton("Set Credit Limit");
        cancel_CreditCard=new JButton("Cancel Credit Card");
        display_CreditCard=new JButton("Display");
        clear_CreditCard=new JButton("Clear");
        
        //setbounds of panel3
        CreditCard_Lb.setBounds(200,14,110,20);
        CvcNumber_Lb.setBounds(51,51,90,15);
        CreditLimit_Lb.setBounds(51,229,78,15);
        InterestRate_Lb.setBounds(51,87,89,15);
        GracePeriod_Lb.setBounds(51,191,89,15);
        ExpirationDate_Lb.setBounds(51,126,101,15);
        
        CvcNumber_Tf.setBounds(187,50,174,23);
        CreditLimit_Tf.setBounds(187,230,174,23);
        InterestRate_Tf.setBounds(187,88,174,23);
        GracePeriod_Tf.setBounds(187,192,174,23);
        
        ExpirationDate_year.setBounds(187,126,68,23);
        ExpirationDate_month.setBounds(269,126,100,23);
        ExpirationDate_day.setBounds(385,126,53,23);
        
        add_CreditCard.setBounds(327,165,126,19);
        set_CreditLimit.setBounds(65,273,141,21);
        cancel_CreditCard.setBounds(279,273,174,21);
        display_CreditCard.setBounds(73,311,77,20);
        clear_CreditCard.setBounds(344,311,68,21);
        
        add_CreditCard.addActionListener(this);
        set_CreditLimit.addActionListener(this);
        cancel_CreditCard.addActionListener(this);
        display_CreditCard.addActionListener(this);
        clear_CreditCard.addActionListener(this);
        
        //creates object and setbounds of frame
        clear=new JButton("Clear All");
        clear.setBounds(475,620,103,19);
        clear.addActionListener(this);
        
        //Adds objects to their respective panels
        panel1.add(BankCardForm_Lb);
        panel1.add(CardId_Lb);
        panel1.add(ClientName_Lb);
        panel1.add(IssuerBank_Lb);
        panel1.add(BankAccount_Lb);
        panel1.add(BalanceAmount_Lb);
        
        panel2.add(DebitCard_Lb);
        panel2.add(PinNumber_Lb);
        panel2.add(WithdrawalAmount_Lb);
        panel2.add(WithdrawalDate_Lb);
        
        panel3.add(CreditCard_Lb);
        panel3.add(CvcNumber_Lb);
        panel3.add(CreditLimit_Lb);
        panel3.add(InterestRate_Lb);
        panel3.add(GracePeriod_Lb);
        panel3.add(ExpirationDate_Lb);
        
        panel1.add(CardId_Tf);
        panel1.add(ClientName_Tf);
        panel1.add(IssuerBank_Tf);
        panel1.add(BankAccount_Tf);
        panel1.add(BalanceAmount_Tf);
        
        panel2.add(PinNumber_Tf);
        panel2.add(WithdrawalAmount_Tf);
        
        panel3.add(CvcNumber_Tf);
        panel3.add(CreditLimit_Tf);
        panel3.add(InterestRate_Tf);
        panel3.add(GracePeriod_Tf);
        
        panel2.add(WithdrawalDate_year);
        panel2.add(WithdrawalDate_month);
        panel2.add(WithdrawalDate_day);
        
        panel3.add(ExpirationDate_year);
        panel3.add(ExpirationDate_month);
        panel3.add(ExpirationDate_day);
        
        panel2.add(add_DebitCard);
        panel2.add(withdraw_DebitCard);
        panel2.add(display_DebitCard);
        panel2.add(clear_DebitCard);
        
        panel3.add(add_CreditCard);
        panel3.add(set_CreditLimit);
        panel3.add(cancel_CreditCard);
        panel3.add(display_CreditCard);
        panel3.add(clear_CreditCard);
        
        //adds panel and clear object to frame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        frame.add(clear);
        
        //sets layout and visibility of panels
        panel1.setLayout(null);
        panel1.setVisible(true);
        panel1.setBounds(36,20,1004,224);
        
        panel2.setLayout(null);
        panel2.setVisible(true);
        panel2.setBounds(36,263,482,352);
        
        panel3.setLayout(null);
        panel3.setVisible(true);
        panel3.setBounds(543,263,496,352);
        
        //sets layout,visibility,background color,fonts  
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1085,680);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0,51,102));
        panel1.setBackground(new Color(0,153,153));
        panel2.setBackground(new Color(0,153,153));
        panel3.setBackground(new Color(0,153,153));
        BankCardForm_Lb.setFont(new Font("Arial",Font.BOLD,21));
        DebitCard_Lb.setFont(new Font("Arial",Font.BOLD,20));
        CreditCard_Lb.setFont(new Font("Arial",Font.BOLD,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==add_DebitCard)//checks if add_DebitCard button is pressed
        {
            //checks the given textfields and if any of them is empty it gives error message
            if(CardId_Tf.getText().isEmpty()||ClientName_Tf.getText().isEmpty()||IssuerBank_Tf.getText().isEmpty()||BankAccount_Tf.getText().isEmpty()||BalanceAmount_Tf.getText().isEmpty()||PinNumber_Tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());//converts string value to integer
                    String ClientName=ClientName_Tf.getText();
                    String IssuerBank=IssuerBank_Tf.getText();
                    String BankAccount=BankAccount_Tf.getText();
                    int BalanceAmount=Integer.parseInt(BalanceAmount_Tf.getText());
                    int PINnumber=Integer.parseInt(PinNumber_Tf.getText());
                    
                    boolean matchID=false;
                
                    if(al.isEmpty())//checks if the arraylist is empty
                    {
                        DebitCard debitCardObject=new DebitCard(BalanceAmount,CardID,BankAccount,IssuerBank,ClientName,PINnumber);//creates object of debit card class
                        al.add(debitCardObject);//adds the debit card object to arraylist
                        JOptionPane.showMessageDialog(frame,"Debit Card is added.","Information",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)//iterates all the objects of the arraylist of bank card
                        {
                            if(object instanceof DebitCard)//checks if current object ia an instance of debit card
                            {
                                if(object.getCardId()==CardID)
                                {
                                    JOptionPane.showMessageDialog(frame,"Entered CardID already exists.","Error",JOptionPane.ERROR_MESSAGE);
                                    matchID=true;
                                    break;
                                }
                                else
                                {
                                    matchID=false;
                                }
                            }
                        }
                        if(matchID==false)
                        {
                            DebitCard debitCardObject=new DebitCard(BalanceAmount,CardID,BankAccount,IssuerBank,ClientName,PINnumber);
                            al.add(debitCardObject);
                            JOptionPane.showMessageDialog(frame,"Debit Card is added.","Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==add_CreditCard)//checks if add_CreditCard button is pressed
        {
            //checks the given textfields and if any of them is empty it gives error message
            if(CardId_Tf.getText().isEmpty()||ClientName_Tf.getText().isEmpty()||IssuerBank_Tf.getText().isEmpty()||BankAccount_Tf.getText().isEmpty()||BalanceAmount_Tf.getText().isEmpty()||CvcNumber_Tf.getText().isEmpty()||InterestRate_Tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    String ClientName=ClientName_Tf.getText();
                    String IssuerBank=IssuerBank_Tf.getText();
                    String BankAccount=BankAccount_Tf.getText();
                    int BalanceAmount=Integer.parseInt(BalanceAmount_Tf.getText());
                    int CVCnumber=Integer.parseInt(CvcNumber_Tf.getText());
                    double InterestRate=Double.parseDouble(InterestRate_Tf.getText());
                    String ExpirationDate=ExpirationDate_year.getSelectedItem().toString()+"/"+ExpirationDate_month.getSelectedItem().toString()+"/"+ExpirationDate_day.getSelectedItem().toString();
                        
                    boolean matchID=false;
                
                    
                    if(al.isEmpty())
                    {
                        //creates object of credit card class
                        CreditCard creditCardObject=new CreditCard(CardID,ClientName,IssuerBank,BankAccount,BalanceAmount,CVCnumber,InterestRate,ExpirationDate);
                        al.add(creditCardObject);//adds the credit card object to the bank card arraylist
                        JOptionPane.showMessageDialog(frame,"Credit Card is added.","Information",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof CreditCard)//checks if current object is an instance credit card
                            {
                                if(object.getCardId()==CardID)
                                {
                                    JOptionPane.showMessageDialog(frame,"Entered CardID already exists.","Error",JOptionPane.ERROR_MESSAGE);
                                    matchID=true;
                                    break;
                                }
                                else
                                {
                                    matchID=false;
                                }
                            }
                        }
                        if(matchID==false)
                        {
                            CreditCard creditCardObject=new CreditCard(CardID,ClientName,IssuerBank,BankAccount,BalanceAmount,CVCnumber,InterestRate,ExpirationDate);
                            al.add(creditCardObject);
                            JOptionPane.showMessageDialog(frame,"Credit Card is added.","Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==withdraw_DebitCard)//checks if withdraw_DebitCard button is pressed
        {
            //checks the given textfields and if any of them is empty it gives error message
            if(CardId_Tf.getText().isEmpty()||WithdrawalAmount_Tf.getText().isEmpty()||PinNumber_Tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    int WithdrawalAmount=Integer.parseInt(WithdrawalAmount_Tf.getText());
                    int PINnumber=Integer.parseInt(PinNumber_Tf.getText());
                    String WithdrawalDate=WithdrawalDate_year.getSelectedItem().toString()+"/"+WithdrawalDate_month.getSelectedItem().toString()+"/"+WithdrawalDate_day.getSelectedItem().toString();
                    
                    boolean withdrawDebit=false;    
                
                    if(al.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,"There is no match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof DebitCard)
                            {
                                DebitCard debitCardObject= (DebitCard)object;
                                if (object.getCardId()==CardID && debitCardObject.getPIN_number()==PINnumber)
                                {
                                   if(object.getBalance_amount()>=WithdrawalAmount)
                                   {
                                       debitCardObject.withdraw(WithdrawalAmount,WithdrawalDate,PINnumber);//calls the method withdraw from debit card class
                                       System.out.println(object.getBalance_amount());
                                       JOptionPane.showMessageDialog(frame,"Your withdraw is successfull.","Information",JOptionPane.INFORMATION_MESSAGE);
                                       withdrawDebit=true;
                                       break;
                                   }
                                   else
                                   {
                                       JOptionPane.showMessageDialog(frame,"Your balance amount is insufficient. Please check and enter again.","Error",JOptionPane.ERROR_MESSAGE);
                                       withdrawDebit=true;
                                       break;
                                   }
                                }   
                                else
                                {
                                    withdrawDebit=false;
                                }
                            }
                        }
                        if(withdrawDebit==false)
                        {
                            JOptionPane.showMessageDialog(frame,"Valid CardID or PIN number is not entered. Please check and enter again.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==set_CreditLimit)//checks if set_CreditLimit button is pressed
        {
            //checks the given textfields and if any of them is empty it gives error message
            if(CardId_Tf.getText().isEmpty()||CreditLimit_Tf.getText().isEmpty()||GracePeriod_Tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    double CreditLimit=Double.parseDouble(CreditLimit_Tf.getText());//converts string value to double
                    int GracePeriod=Integer.parseInt(GracePeriod_Tf.getText());
                    
                    boolean setCredit=false;
                    
                    if(al.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,"There is no match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof CreditCard)
                            {
                                CreditCard creditCardObject=(CreditCard)object;
                                if(object.getCardId()==CardID)
                                {
                                    creditCardObject.setCreditLimit(CreditLimit,GracePeriod);//calls the method setCreditLimit from credit card class
                                    System.out.println(CreditLimit);
                                    System.out.println(GracePeriod);
                                    JOptionPane.showMessageDialog(frame,"Credit limit and grace period are set.","Information",JOptionPane.INFORMATION_MESSAGE);
                                    setCredit=true;
                                    break;
                                }
                                else
                                {
                                    setCredit=false;
                                }
                            }
                        }
                        if(setCredit==false)
                        {
                            JOptionPane.showMessageDialog(frame,"CardID is invalid.","Error",JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==cancel_CreditCard)//checks if cancel_CreditCard button is pressed
        {
            if(CardId_Tf.getText().isEmpty())//checks the textfield of cardId if it is empty it gives error message
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    boolean cancelCredit=false;
                    
                    if(al.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,"There is no match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof CreditCard)
                            {
                                CreditCard creditCardObject=(CreditCard)object;
                                if(object.getCardId()==CardID)
                                {
                                    creditCardObject.cancelCreditCard();//calls the method cancelCreditCard from credit card class
                                    JOptionPane.showMessageDialog(frame,"Your credit card is cancelled.","Information",JOptionPane.INFORMATION_MESSAGE);
                                    cancelCredit=true;
                                    break;
                                }
                                else
                                {
                                    cancelCredit=false;
                                }
                            }
                        }
                        if(cancelCredit==false)
                        {
                            JOptionPane.showMessageDialog(frame,"CardID is invalid.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==display_DebitCard)//checks if display_DebitCard  button is pressed 
        {
            if(CardId_Tf.getText().isEmpty())//checks the textfield of cardId if it is empty it gives error message
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    boolean displayDebit=false;
                
                
                    if(al.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,"There is no match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof DebitCard)
                            {
                                DebitCard debitCardObject= (DebitCard)object;
                                if(object.getCardId()==CardID)
                                {
                                    object.display();
                                    JOptionPane.showMessageDialog(frame,"Your information is displayed.","Information",JOptionPane.INFORMATION_MESSAGE);
                                    displayDebit=true;
                                    break;
                                }
                                else
                                {
                                    displayDebit=false;
                                }
                            }
                        }
                        if(displayDebit==false)
                        {
                            JOptionPane.showMessageDialog(frame,"Card ID is not valid. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==clear_DebitCard)//checks if clear_DebitCard button is pressed
        {
            //sets their value to empty strings
            PinNumber_Tf.setText("");
            WithdrawalAmount_Tf.setText("");
        }
        else if(a.getSource()==display_CreditCard)//checks if display_CreditCard  button is pressed 
        {
            if(CardId_Tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty textfield found! Please fill it.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardID=Integer.parseInt(CardId_Tf.getText());
                    boolean displayCredit=false;
                
                
                    if(al.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,"There is no match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard object:al)
                        {
                            if(object instanceof CreditCard)
                            {
                                CreditCard creditCardObject= (CreditCard)object;
                                if(object.getCardId()==CardID)
                                {
                                    object.display();
                                    JOptionPane.showMessageDialog(frame,"Your information is displayed.","Information",JOptionPane.INFORMATION_MESSAGE);
                                    displayCredit=true;
                                    break;
                                }
                                else
                                {
                                    displayCredit=false;
                                }
                            }
                        }
                        if(displayCredit==false)
                        {
                            JOptionPane.showMessageDialog(frame,"Card ID is not valid. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please input correct values.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource()==clear_CreditCard)
        {
            CvcNumber_Tf.setText("");
            CreditLimit_Tf.setText("");
            InterestRate_Tf.setText("");
            GracePeriod_Tf.setText("");
        }
        
        else
        {
            CardId_Tf.setText("");
            ClientName_Tf.setText("");
            IssuerBank_Tf.setText("");
            BankAccount_Tf.setText("");
            BalanceAmount_Tf.setText("");
            PinNumber_Tf.setText("");
            WithdrawalAmount_Tf.setText("");
            CvcNumber_Tf.setText("");
            CreditLimit_Tf.setText("");
            InterestRate_Tf.setText("");
            GracePeriod_Tf.setText("");
        }
    }
    public static void main(String[]args)
    {
        new BankGUI();
    }
}
