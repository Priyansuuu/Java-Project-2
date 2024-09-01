public class BankCard
{
    //Declaration of the attributes of bank card class
    private int cardId;
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private int balance_amount;
    
    //constructor of bank card class with four parameters
    public BankCard(int balance_amount,int cardId,String bank_account,String issuer_bank)
    {
        this.balance_amount=balance_amount;
        this.cardId=cardId;
        this.bank_account=bank_account;
        this.issuer_bank=issuer_bank;
        this.client_name="";
    }
    /*accessor methods to return the value of the attributes
     * as all the attributes in the bank cars class are private
     */
    public int getBalance_amount()
    {
        return this.balance_amount;
    }
    public int getCardId()
    {
        return this.cardId;
    }
    public String getBank_account()
    {
        return this.bank_account;
    }
    public String getIssuer_bank()
    {
        return this.issuer_bank;
    }
    public String getClient_name()
    {
        return this.client_name;
    }
    /*mutator method to set the value of the attributes client_name and balance_amount
     * as all the attributes in this class are private
     */
    public void setClientname(String client_name)
    {
        this.client_name=client_name;
    }
    public void setBalanceamount(int balance_amount)
    {
        this.balance_amount=balance_amount;
    }
    //display method is used to print the statement according to the condition
    public void display()
    {
        if(client_name=="")
        {
            System.out.println("Empty field found. Please assign the client name");
        }
        else
        {
         System.out.println("The Card ID is "+this.cardId);
         System.out.println("The Client name is "+this.client_name);
         System.out.println("The Issuer bank is "+this.issuer_bank);
         System.out.println("The Bank account is "+this.bank_account);
         System.out.println("The Balance amount is "+this.balance_amount);
        }
    }
}