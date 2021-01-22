package controller;

public class Contador {
    private int count;
    public Contador(){
        this.count=0;
    }
    public Contador(Contador anotherContador){
        this.count=anotherContador.count;
    }
    public void increase() {
        this.count++;
    }
    public void decrease() {
        this.count--;
    }
    public void setCount(int count) {
        this.count=count;
    }
    public int getCount() {
        return this.count;
    }
}
