package javaapplication;

import java.util.Scanner;

public class JavaApplication{

     public static void main(String[] args) {
        String Name,Address;
        int Telephone_Num,Customer_Num;
        boolean Mailing_List;
        String Wants;
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Enter Your Name : ");
        Name=S.next();
        System.out.println("");
        
        System.out.println("Enter Your Address :");
        Address=S.next();
        System.out.println("");
        
        System.out.println("Enter Your Telephone Number :");
        Telephone_Num=S.nextInt();
        System.out.println("");
        
        System.out.println("Enter Your Customer Number :");
        Customer_Num=S.nextInt();
        System.out.println("");
        
        System.out.println("Do You Want In A Mailing List ??  \n Enter 'Yes' if you want \n or 'No'  ");
        Wants=S.next();
        Mailing_List=Wants.equals("Yes");
        System.out.println("");
        
        Customer C=new Customer();
        
        C.setName(Name);
        C.setAddress(Address);
        C.setTelephone_numper(Telephone_Num);
        C.setCustomer_number(Customer_Num);
        C.setMailing_list(Mailing_List);
        
        System.out.println(C.toString());
        
    }
    
}
