package controller;

import static util.StringUtil.rpad;

public class Main {
    public static void main(String[] args)
    {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        exercise6();
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
    static void exercise4(){
        Fraccion newFraction = new Fraccion(0,2);
        newFraction.add(2);
        System.out.println(newFraction.toString());
        Fraccion anotherFraction = new Fraccion(3,3);
        newFraction.add(anotherFraction);
        System.out.println(newFraction.toString());
        System.out.println(anotherFraction.toString());
        newFraction.substract(anotherFraction);
        System.out.println(newFraction.toString());
        newFraction.substract(1);
        System.out.println(newFraction.toString());
        newFraction.multiply(new Fraccion(2,1));
        System.out.println(newFraction.toString());
        newFraction.multiply(2);
        System.out.println(newFraction.toString());
        newFraction.divide(new Fraccion(4,1));
        System.out.println(newFraction.toString());
        newFraction.divide(2);
        System.out.println(newFraction.toString());
    }
    static void exercise5(){
        Fecha invalidDate = new Fecha(99,10,2020);
        System.out.println(invalidDate.toString());
        System.out.println(invalidDate.isValid());
        Fecha newDate = new Fecha(31,12,2020);
        newDate.addOneDay();
        System.out.println(newDate.toString());
        System.out.println(newDate.isValid());
    }
    static void exercise6(){
        System.out.println(util.StringUtil.rpad("test",'x',3));
        System.out.println(util.StringUtil.ltrim("   test   "));
        System.out.println(util.StringUtil.rtrim("   test   "));
        System.out.println(util.StringUtil.indexOfN("John|Paul|George|Ringo",'|',2));
    }
}
