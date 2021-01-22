package controller;

import lombok.Getter;
import lombok.Setter;

public class CuentaCorriente {
    private String accountNumber;
    private String cbu;
    private double balance;
    public CuentaCorriente(){
        this.accountNumber="";
        this.cbu="";
        this.balance=0;
    }
    public CuentaCorriente(CuentaCorriente anAccount){
        this.accountNumber=anAccount.accountNumber;
        this.cbu=anAccount.cbu;
        this.balance=anAccount.balance;
    }
    public CuentaCorriente(String accountNumber, String cbu, double balance){
        this.accountNumber=accountNumber;
        this.cbu=cbu;
        this.balance=balance;
    }
    public void ingreso(){}
    public void egreso(){}
    public void reintegro(){}
    public void transferencia(){}

    public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void setCbu(String cbu) {
        this.cbu=cbu;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public String getCbu(String cbu) {
        return this.cbu;
    }
    public double setBalance() {
        return balance;
    }
}
