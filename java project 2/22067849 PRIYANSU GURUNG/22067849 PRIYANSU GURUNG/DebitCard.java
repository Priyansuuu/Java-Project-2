public class DebitCard extends BankCard
{
    //declaration of the attributes of the debit card class
    private int PIN_number;
    private int withdrawal_amount; 
    private String date_of_withdrawal;
    private boolean has_withdrawn;
    
    /*constructor of debit card class with six parameters calls the paramater
     * of the parent class constructor
     */
    public DebitCard(int balance_amount,int cardId,String bank_account,String issuer_bank,String client_name, int PIN_number)
    {
        super(balance_amount, cardId,bank_account, issuer_bank);//calls the paramters from parent class
        super.setClientname(client_name);//calls the method from parent class
        this.PIN_number=PIN_number;
        this.has_withdrawn=false;
    }
    /*returns  the values
     * of the attributes of debit card class
     */
    public int getPIN_number()
    {
        return this.PIN_number;
    }
    public int getWithdrawal_amount()
    {
        return this.withdrawal_amount;
    }
    public String getDate_of_Withdrawal()
    {
        return this.date_of_withdrawal;
    }
    public boolean getHas_Withdrawn()
    {
        return this.has_withdrawn;
    }
    /*used to set the values of 
     * withdrawal_amount in debit class card
     */
    public void setWithdrawal_amount(int withdrawal_amount)
    {
        this.withdrawal_amount=withdrawal_amount;   
    }
    public void withdraw(int withdrawal_amount,String date_of_withdrawal,int PIN_number)//method that has three parameters
    {
        //nested loop
        if(PIN_number==this.PIN_number)
        {
            if(super.getBalance_amount()>=withdrawal_amount)
            {
                this.has_withdrawn=true;
                this.date_of_withdrawal=date_of_withdrawal;
                super.setBalanceamount(super.getBalance_amount()-withdrawal_amount);
                //calls both the methods accessor and mutator from the parent class
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
         System.out.println("Wrong PIN number");   
        }
    }
    public void display()
    {
        if(has_withdrawn==true)
        {
            super.display();
            System.out.println("The PIN number is "+this.PIN_number);
            System.out.println("The withdrawal amount is "+this.getWithdrawal_amount());
            System.out.println("The date of withdrawal is "+this.getDate_of_Withdrawal());
        }
        else
        {
            System.out.println("The balance amount is "+getBalance_amount());
        }
    }
}

    
