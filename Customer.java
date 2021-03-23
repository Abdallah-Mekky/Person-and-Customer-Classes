package javaapplication24;


public class Customer extends Person{
    
    private int customer_number;
    private boolean mailing_list;
    
    public Customer(){
    };

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public void setMailing_list(boolean mailing_list) {
        this.mailing_list = mailing_list;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public boolean isMailing_list() {
        return mailing_list;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + ", Customer Number = " + customer_number + ", Mailing List = " + mailing_list + "]";
    }
    
    
     
}
