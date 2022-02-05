public class Rectangulo implements IFigura{
    private double b;
    private double a;
    private double area,perimetro;

    public Rectangulo(double b, double a){
        this.b=b;
        this.a=a;
    }

    @Override
    public double calcularArea() {
        area = b*a;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = b+b+a+a;
        return perimetro;
    }
}
