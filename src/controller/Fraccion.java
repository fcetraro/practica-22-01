package controller;

public class Fraccion {
    int numerator;
    int denominator;

    public Fraccion(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public void add(int number){
        this.numerator += (number * this.denominator);
    }
    public void substract(int number){
        this.numerator -= (number * this.denominator);
    }
    public void add(Fraccion number){
        this.numerator = (this.numerator * number.denominator) + (number.numerator * this.denominator);
        this.denominator = this.denominator * number.denominator;
    }
    public void substract(Fraccion number){
        this.numerator = (this.numerator * number.denominator) - (number.numerator * this.denominator);
        this.denominator = this.denominator * number.denominator;
    }
    public void multiply(int number){
        this.numerator = this.numerator * number;
    }
    public void multiply(Fraccion number){
        this.numerator = this.numerator * number.numerator;
        this.denominator = this.denominator * number.denominator;
    }
    public void divide(int number){
        this.numerator = this.numerator / number;
    }
    public void divide(Fraccion number){
        this.numerator = this.numerator * number.denominator;
        this.denominator = number.numerator * this.denominator;
    }
    @Override
    public String toString() {
        return this.numerator +"/"+this.denominator;
    }
}

