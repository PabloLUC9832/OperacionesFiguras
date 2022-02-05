public class Triangulo implements IFigura{

    private double l;
    private double a;
    private double area,perimetro;

    public Triangulo(double l, double a){
        this.l = l;
        this.a = a;
    }

    public Triangulo(double l){
        this.l = l;
    }

    @Override
    public double calcularArea() {
        area = (l*a)/2 ;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = l+l+l;
        return perimetro;
    }
    
}