package geometry;

public class Triangulo extends FiguraGeometrica {
    int base, height;
    public Triangulo(int base, int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double area() {
        return ((base*height)/2);
    }
}
