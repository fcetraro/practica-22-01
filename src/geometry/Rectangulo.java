package geometry;

public class Rectangulo extends FiguraGeometrica {
    int length, width;
    public Rectangulo(int length, int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area() {
        return length*width;
    }
}
