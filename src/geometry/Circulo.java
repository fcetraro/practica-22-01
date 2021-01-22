package geometry;

public class Circulo extends FiguraGeometrica {
    private int radius;
    public static final double pi = 3.14;
    public Circulo(int radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return ((pi*(2*radius))/4);
    }
}
