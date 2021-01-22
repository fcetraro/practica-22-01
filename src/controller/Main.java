package controller;

public class Main {
    public static void main(String[] args)
    {
        //exercise1();
        //exercise2();
        exercise3();
    }
    static void exercise1(){
        String accountNumber = "123";
        CuentaCorriente emptyAccount = new CuentaCorriente();
        emptyAccount.setAccountNumber(accountNumber);
        CuentaCorriente account = new CuentaCorriente(emptyAccount.getAccountNumber(),"134",0);
        CuentaCorriente anotherAccount = new CuentaCorriente(account);
        System.out.println(accountNumber.equals(anotherAccount.getAccountNumber()));
    }
    static void exercise2(){
        Contador newC = new Contador();
        newC.increase();
        newC.increase();
        Contador anotherC = new Contador(newC);
        anotherC.decrease();
        System.out.println(anotherC.getCount()==1);
        newC.setCount(3);
        System.out.println(newC.getCount()==3);
    }
    static void exercise3(){
        Libro newBook = new Libro();
        newBook.setTitle("Harry Potter");
        newBook.setIsbn("978316314641737379");
        newBook.setAuthor("Rowling, J.K.");
        Libro anotherBook = new Libro("no author","no title","no isbn");
        System.out.println(newBook.toString());
        System.out.println(anotherBook.toString());
    }
}
