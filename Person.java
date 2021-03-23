package javaapplication24;

public class Person {
  
    private String name;
    private String address;
    private int telephone_numper;
    
    
    public Person(){
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone_numper(int telephone_numper) {
        this.telephone_numper = telephone_numper;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone_numper() {
        return telephone_numper;
    }

    @Override
    public String toString() {
        return "Customer[" + "Name = " + name + ", Address = " + address + ", Telephone Numper = " + telephone_numper ;
    }
    
    
    
    
}
