 public class CreditCard extends BankCard
{
    //declaration of all the attributes from child class credit card
    private int CVC_number;
    private double credit_limit;
    private double interest_rate;
    private String expiration_date;
    private int grace_period;
    private boolean is_granted;
    
    //constructor of credit card class with eight parameters
    public CreditCard(int cardId,String client_name,String issuer_bank,String bank_account,int balance_amount,int CVC_number,double interest_rate,String expiration_date)
    {
     super(balance_amount,cardId,bank_account,issuer_bank);//calls the parameters fronm parent class bank card
     super.setClientname(client_name);//calls mutator method from the parent class
     this.CVC_number=CVC_number;
     this.interest_rate=interest_rate;
     this.expiration_date=expiration_date;
     this.is_granted=false;
    }
    /*accessor method which returns the value
     * of the attributes
     */
    public int getCVC_number()
    {
        return this.CVC_number;
    }
    public double getCredit_limit()
    {
        return this.credit_limit;
    }
    public double getInterest_rate()
    {
        return this.interest_rate;
    }
    public String getExpiration_date()
    {
        return this.expiration_date;
    }
    public int getGrace_period()
    {
        return this.grace_period;
    }
    public boolean getIs_granted()
    {
        return this.is_granted;
    }
    /*mutator method which sets the value of
     *  credit_limit and grace_period
     */
    public void setCreditLimit(double credit_limit,int grace_period)
    {
        
        if(this.credit_limit<=2.5*super.getBalance_amount())
        {
          this.credit_limit=credit_limit; 
          this.grace_period=grace_period;
          this.is_granted=true;
        }
        else
        {
            System.out.println("Your credit cannot be issued");
        }
    }
    public void cancelCreditCard()//method which sets the value of the given attributes to 0 and false
    {
        this.CVC_number=0;
        this.credit_limit=0;
        this.grace_period=0;
        this.is_granted=false;
    }
    public void display()//prints the statements according to the if condition
    {
        
        if(this.is_granted==true)
        {
           super.display(); 
           System.out.println("The CVC number is "+this.CVC_number);
           System.out.println("The credit limit is "+this.credit_limit);
           System.out.println("The interest rate is "+this.interest_rate);
           System.out.println("The expiration date is "+this.expiration_date);
           System.out.println("The grace period is "+this.grace_period);
        }
        else
        {
            System.out.println("The CVC number is "+this.CVC_number);
            System.out.println("The interest rate is "+this.interest_rate);
            System.out.println("The expiration date is "+this.expiration_date);
        }
    }
}
      
