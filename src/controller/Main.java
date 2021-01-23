package controller;

import geometry.Circulo;
import geometry.FiguraGeometrica;
import geometry.Rectangulo;
import geometry.Triangulo;
import password.PasswordFuerte;
import password.PasswordIntermedia;
import password.PasswordSimple;
import password.exception.PasswordException;
import password.Password;

public class Main {
    public static void main(String[] args)
    {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        passwordExercise();
        //geometryExercise();
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
    static void passwordExercise(){
        Password password = new PasswordFuerte();
        System.out.println(password.isPasswordValid(""));
        try{
            password.setValue("");
        } catch (PasswordException e){
            e.printStackTrace();
            System.out.println("This was expected!");
        }
        System.out.println(password.isPasswordValid("Mercado#Libre#2021"));
        try{
            password.setValue("Mercado#Libre#2021");
        } catch (PasswordException e){
            e.printStackTrace();
            System.out.println("This was not expected!");
        }
        Password simplePassword = new PasswordSimple();
        System.out.println(simplePassword.isPasswordValid("Password"));
        System.out.println(simplePassword.isPasswordValid("pas"));
        Password iPassword = new PasswordIntermedia();
        System.out.println(iPassword.isPasswordValid("Password1"));
        System.out.println(iPassword.isPasswordValid("Password"));
    }
    static void geometryExercise(){
        // El error obtenido fue que faltaba crear los metodos de la clase abstracta padre "area()",
        // para solucinarlo se debe implementar este metodo.
        FiguraGeometrica triangle = new Triangulo(10,5);
        FiguraGeometrica circle = new Circulo(5);
        FiguraGeometrica rectangle = new Rectangulo(10,8);
        FiguraGeometrica geometryArray[] = new FiguraGeometrica[3];
        geometryArray[0]=triangle;
        geometryArray[1]=circle;
        geometryArray[2]=rectangle;
        System.out.println(util.MathUtil.areaPromedio(geometryArray));
    }
}
