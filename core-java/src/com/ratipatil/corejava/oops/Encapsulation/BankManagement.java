package com.ratipatil.corejava.oops.Encapsulation;

public class BankManagement {

    private String accountHolderName ;
    private String accountNumber;
    private int pin ;
    private double balance ;
    private boolean isActive ;



    public BankManagement (String accountholdername , String accountnumber , int pin, double balance ){

        this.accountHolderName = accountholdername;
        this.accountNumber = accountnumber;
        this.pin = pin;


        if (balance >= 0 ){
            this.balance = balance;

        }else {
            this.balance = 0 ;
        }

        this.isActive = true;


    }


    public String getAccountHolderName(){
        return accountHolderName;
    }


    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }




    public static void main(String [] args){


        BankManagement bm = new BankManagement("ratikantpatil","123456789",1232,4500.4);

        System.out.println(bm.getAccountHolderName());
        System.out.println(bm.getAccountNumber());


    }

}
